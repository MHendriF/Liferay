/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package mencobatutorialservice.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link mencobatutorialEntryService}.
 *
 * @author liferay
 * @see mencobatutorialEntryService
 * @generated
 */
@ProviderType
public class mencobatutorialEntryServiceWrapper
	implements mencobatutorialEntryService,
		ServiceWrapper<mencobatutorialEntryService> {
	public mencobatutorialEntryServiceWrapper(
		mencobatutorialEntryService mencobatutorialEntryService) {
		_mencobatutorialEntryService = mencobatutorialEntryService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencobatutorialEntryService.getOSGiServiceIdentifier();
	}

	@Override
	public mencobatutorialEntryService getWrappedService() {
		return _mencobatutorialEntryService;
	}

	@Override
	public void setWrappedService(
		mencobatutorialEntryService mencobatutorialEntryService) {
		_mencobatutorialEntryService = mencobatutorialEntryService;
	}

	private mencobatutorialEntryService _mencobatutorialEntryService;
}