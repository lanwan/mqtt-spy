/***********************************************************************************
 * 
 * Copyright (c) 2014 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */
package pl.baczkowicz.mqttspy.ui.utils;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.codec.binary.Hex;
import org.junit.Ignore;
import org.junit.Test;

import pl.baczkowicz.mqttspy.common.generated.ConversionMethod;
import pl.baczkowicz.mqttspy.common.generated.FormatterDetails;
import pl.baczkowicz.mqttspy.common.generated.FormatterFunction;
import pl.baczkowicz.mqttspy.common.generated.SubstringConversionFormatterDetails;
import pl.baczkowicz.mqttspy.common.generated.SubstringExtractFormatterDetails;
import pl.baczkowicz.mqttspy.exceptions.ConversionException;
import pl.baczkowicz.mqttspy.utils.ConversionUtils;
import pl.baczkowicz.mqttspy.utils.FormattingUtils;

/**
 * Uses for the formatting/conversion utils.
 */
public class FormattingUtilsTest
{
	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#stringToHex(java.lang.String)}.
	 */
	@Test
	public final void testStringToHex()
	{
		assertEquals("7465737432", ConversionUtils.stringToHex("test2"));
	}

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#hexToString(java.lang.String)}.
	 * @throws ConversionException 
	 */
	@Test
	public final void testHexToString() throws ConversionException
	{
		assertEquals("test2", ConversionUtils.hexToString("7465737432"));
	}
	
	@Test
	public void testConversion1()
	{
		final String encodedString = "3f915604fffd";
		assertEquals(encodedString, new String(encodedString.getBytes()));
		assertEquals(encodedString.getBytes().length, new String(encodedString.getBytes()).getBytes().length);
	}
	
	@Test
	public final void testConversion2() throws ConversionException, UnsupportedEncodingException	
	{
		final String encodedString = "3f915604fffd";
		assertEquals(12, encodedString.length());
		assertEquals(12, encodedString.getBytes().length);
		
		final byte[] plainArray = ConversionUtils.hexToArray(encodedString);		
		assertEquals(6, plainArray.length);		
				
		assertEquals(12, Hex.encodeHex(plainArray).length);
		assertEquals(12, new String(Hex.encodeHex(plainArray)).length());
		assertEquals(12, ConversionUtils.arrayToHex(plainArray).length());
	}
	
	@Ignore
	@Test
	public final void testHexToStringToHex() throws ConversionException
	{
		final String testString = "3f915604fffd";
		
		assertEquals(true, Charset.isSupported("UTF-8"));
		
		//final Hex hex = new Hex(ConversionUtils.DEFAULT_CHARSET);
		assertEquals(12, ConversionUtils.stringToArray(testString).length);
		
		assertEquals(6, ConversionUtils.hexToArray(testString).length);
		assertEquals(6, ConversionUtils.arrayToString(ConversionUtils.hexToArray(testString)).length());
		
		assertEquals(6, ConversionUtils.hexToString(testString).length());
		
		assertEquals(6, ConversionUtils.hexToString(testString).getBytes().length);
		
		assertEquals(6, ConversionUtils.stringToArray(ConversionUtils.hexToString(testString)).length);
		assertEquals(12, Hex.encodeHex(ConversionUtils.stringToArray(ConversionUtils.hexToString(testString))).length);
		
		// return new String(Hex.encodeHex());
		assertEquals(testString, ConversionUtils.stringToHex(ConversionUtils.hexToString(testString)));
	}
	
	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#hexToString(java.lang.String)}.
	 * @throws ConversionException 
	 */
	@Test
	(expected = ConversionException.class)
	public final void testInvalidHexToString() throws ConversionException
	{
		assertEquals("not is not valid", ConversionUtils.hexToString("paosd9d"));
	}

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#hexToStringNoException(java.lang.String)}.
	 */
	@Test
	public final void testHexToStringNoException()
	{
		assertEquals("[invalid hex]", ConversionUtils.hexToStringNoException("hello :)"));
	}

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#base64ToString(java.lang.String)}.
	 */
	@Test
	public final void testBase64ToString()
	{
		assertEquals("GOOD", ConversionUtils.base64ToString("R09PRA=="));
	}

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#stringToBase64(java.lang.String)}.
	 */
	@Test
	public final void testStringToBase64()
	{
		assertEquals("R09PRA==", ConversionUtils.stringToBase64("GOOD"));
	}

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#formatText(pl.baczkowicz.mqttspy.configuration.generated.FormatterDetails, java.lang.String)}.
	 */
	@Test
	public final void testCustomBase64DecodingConversion()
	{
		final FormatterDetails customFormatter = new FormatterDetails();
		final FormatterFunction function = new FormatterFunction();
		function.setSubstringConversion(new SubstringConversionFormatterDetails());
		function.getSubstringConversion().setStartTag("<Body>");
		function.getSubstringConversion().setEndTag("</Body>");
		function.getSubstringConversion().setKeepTags(true);
		function.getSubstringConversion().setFormat(ConversionMethod.BASE_64_DECODE);
		customFormatter.getFunction().add(function);
		
		assertEquals("<Body>GOOD</Body>", FormattingUtils.formatText(customFormatter, "<Body>R09PRA==</Body>", null));
	}
	
	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#formatText(pl.baczkowicz.mqttspy.configuration.generated.FormatterDetails, java.lang.String)}.
	 */
	@Test
	public final void testCustomBase64DecodingConversionNoTags()
	{
		final FormatterDetails customFormatter = new FormatterDetails();
		final FormatterFunction function = new FormatterFunction();
		function.setSubstringConversion(new SubstringConversionFormatterDetails());
		function.getSubstringConversion().setStartTag("<Body>");
		function.getSubstringConversion().setEndTag("</Body>");
		function.getSubstringConversion().setKeepTags(false);
		function.getSubstringConversion().setFormat(ConversionMethod.BASE_64_DECODE);
		customFormatter.getFunction().add(function);
		
		assertEquals("GOOD", FormattingUtils.formatText(customFormatter, "<Body>R09PRA==</Body>", null));
	}
	
	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#formatText(pl.baczkowicz.mqttspy.configuration.generated.FormatterDetails, java.lang.String)}.
	 */
	@Test
	public final void testCustomBase64DecodingWithExtract()
	{
		final FormatterDetails customFormatter = new FormatterDetails();
		
		final FormatterFunction function1 = new FormatterFunction();
		function1.setSubstringConversion(new SubstringConversionFormatterDetails());
		function1.getSubstringConversion().setStartTag("<Body>");
		function1.getSubstringConversion().setEndTag("</Body>");
		function1.getSubstringConversion().setKeepTags(true);
		function1.getSubstringConversion().setFormat(ConversionMethod.BASE_64_DECODE);
		customFormatter.getFunction().add(function1);
		
		final FormatterFunction function2 = new FormatterFunction();
		function2.setSubstringExtract(new SubstringExtractFormatterDetails());
		function2.getSubstringExtract().setStartTag("<Body>");
		function2.getSubstringExtract().setEndTag("</Body>");
		function2.getSubstringExtract().setKeepTags(false);
		customFormatter.getFunction().add(function2);
		
		assertEquals("GOOD", FormattingUtils.formatText(customFormatter, "some other stuff <Body>R09PRA==</Body> and even more stuff", null));
	} 

	/**
	 * Test method for {@link pl.baczkowicz.mqttspy.utils.FormattingUtils#convertText(pl.baczkowicz.mqttspy.configuration.generated.ConversionMethod, java.lang.String)}.
	 */
	@Test
	public final void testConvert()
	{
		assertEquals("test", FormattingUtils.convertText(ConversionMethod.PLAIN, "test"));
		
		assertEquals("test2", FormattingUtils.convertText(ConversionMethod.HEX_DECODE, "7465737432"));
		assertEquals("7465737431", FormattingUtils.convertText(ConversionMethod.HEX_ENCODE, "test1"));

		assertEquals("GOOD", FormattingUtils.convertText(ConversionMethod.BASE_64_DECODE, "R09PRA=="));
		assertEquals("R09PRA==", FormattingUtils.convertText(ConversionMethod.BASE_64_ENCODE, "GOOD"));
	}
	
	@Test
	public final void testReplaceCharacters()	
	{
		assertEquals("23", FormattingUtils.replaceCharacters(ConversionMethod.HEX_ENCODE, "#", 0, 40, null));
		assertEquals("-23-1", FormattingUtils.replaceCharacters(ConversionMethod.HEX_ENCODE, "#1", 0, 40, "-"));
	}

}
