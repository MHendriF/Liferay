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
 * Provides a wrapper for {@link mencobatutorialService}.
 *
 * @author liferay
 * @see mencobatutorialService
 * @generated
 */
@ProviderType
public class mencobatutorialServiceWrapper implements mencobatutorialService,
	ServiceWrapper<mencobatutorialService> {
	public mencobatutorialServiceWrapper(
		mencobatutorialService mencobatutorialService) {
		_mencobatutorialService = mencobatutorialService;
	}

	@Override
	public mencobatutorialservice.model.mencobatutorial addGuestbook(
		long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return _mencobatutorialService.addGuestbook(userId, name, serviceContext);
	}

	@Override
	public mencobatutorialservice.model.mencobatutorial deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialService.deleteGuestbook(guestbookId,
			serviceContext);
	}

	@Override
	public java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialService.getGuestbooks(groupId);
	}

	@Override
	public java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialService.getGuestbooks(groupId, start, end);
	}

	@Override
	public int getGuestbooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialService.getGuestbooksCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _mencobatutorialService.getOSGiServiceIdentifier();
	}

	@Override
	public mencobatutorialservice.model.mencobatutorial updateGuestbook(
		long userId, long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _mencobatutorialService.updateGuestbook(userId, guestbookId,
			name, serviceContext);
	}

	@Override
	public mencobatutorialService getWrappedService() {
		return _mencobatutorialService;
	}

	@Override
	public void setWrappedService(mencobatutorialService mencobatutorialService) {
		_mencobatutorialService = mencobatutorialService;
	}

	private mencobatutorialService _mencobatutorialService;
}