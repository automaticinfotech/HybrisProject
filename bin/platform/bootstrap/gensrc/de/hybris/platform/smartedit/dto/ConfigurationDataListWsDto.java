/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 30 Oct, 2017 12:12:02 PM
 * ----------------------------------------------------------------
 *
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2016 SAP SE
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of SAP 
 * Hybris ("Confidential Information"). You shall not disclose such 
 * Confidential Information and shall use it only in accordance with the 
 * terms of the license agreement you entered into with SAP Hybris.
 */
package de.hybris.platform.smartedit.dto;

import de.hybris.platform.smartedit.dto.ConfigurationData;
import java.util.Collection;

public  class ConfigurationDataListWsDto  implements java.io.Serializable 
{


	/** <i>Generated property</i> for <code>ConfigurationDataListWsDto.configurations</code> property defined at extension <code>smartedit</code>. */
		
	private Collection<ConfigurationData> configurations;
	
	public ConfigurationDataListWsDto()
	{
		// default constructor
	}
	
	
	
	public void setConfigurations(final Collection<ConfigurationData> configurations)
	{
		this.configurations = configurations;
	}
	
	
	
	public Collection<ConfigurationData> getConfigurations() 
	{
		return configurations;
	}
	


}