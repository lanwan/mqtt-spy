/***********************************************************************************
 * 
 * Copyright (c) 2015 Kamil Baczkowicz
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v10.html
 *    
 * The Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * 
 *    Kamil Baczkowicz - initial API and implementation and/or initial documentation
 *    
 */

package pl.baczkowicz.spy.ui.events;

import pl.baczkowicz.spy.eventbus.FilterableEvent;

public class MessageIndexIncrementEvent extends FilterableEvent
{
	private final int increment;
	
	public MessageIndexIncrementEvent(final int increment, final Object filter)
	{
		this.increment = increment;
		super.setFilter(filter);
	}

	/**
	 * @return the index
	 */
	public int getIncrement()
	{
		return increment;
	}
}