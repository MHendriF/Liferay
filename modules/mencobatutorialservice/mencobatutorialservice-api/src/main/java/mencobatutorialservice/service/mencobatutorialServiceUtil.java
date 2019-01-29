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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for mencobatutorial. This utility wraps
 * {@link mencobatutorialservice.service.impl.mencobatutorialServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see mencobatutorialService
 * @see mencobatutorialservice.service.base.mencobatutorialServiceBaseImpl
 * @see mencobatutorialservice.service.impl.mencobatutorialServiceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link mencobatutorialservice.service.impl.mencobatutorialServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static mencobatutorialservice.model.mencobatutorial addGuestbook(
		long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().addGuestbook(userId, name, serviceContext);
	}

	public static mencobatutorialservice.model.mencobatutorial deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteGuestbook(guestbookId, serviceContext);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGuestbooks(groupId);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorial> getGuestbooks(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGuestbooks(groupId, start, end);
	}

	public static int getGuestbooksCount(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getGuestbooksCount(groupId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static mencobatutorialservice.model.mencobatutorial updateGuestbook(
		long userId, long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateGuestbook(userId, guestbookId, name, serviceContext);
	}

	public static mencobatutorialService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialService, mencobatutorialService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialService.class);

		ServiceTracker<mencobatutorialService, mencobatutorialService> serviceTracker =
			new ServiceTracker<mencobatutorialService, mencobatutorialService>(bundle.getBundleContext(),
				mencobatutorialService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}