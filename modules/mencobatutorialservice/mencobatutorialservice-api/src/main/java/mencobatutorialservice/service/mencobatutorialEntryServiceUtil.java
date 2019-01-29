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
 * Provides the remote service utility for mencobatutorialEntry. This utility wraps
 * {@link mencobatutorialservice.service.impl.mencobatutorialEntryServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author liferay
 * @see mencobatutorialEntryService
 * @see mencobatutorialservice.service.base.mencobatutorialEntryServiceBaseImpl
 * @see mencobatutorialservice.service.impl.mencobatutorialEntryServiceImpl
 * @generated
 */
@ProviderType
public class mencobatutorialEntryServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link mencobatutorialservice.service.impl.mencobatutorialEntryServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static mencobatutorialservice.model.mencobatutorialEntry addEntry(
		long userId, long guestbookId, String name, String email,
		String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .addEntry(userId, guestbookId, name, email, message,
			serviceContext);
	}

	public static mencobatutorialservice.model.mencobatutorialEntry deleteEntry(
		long entryId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteEntry(entryId, serviceContext);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getEntries(
		long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntries(groupId, guestbookId);
	}

	public static java.util.List<mencobatutorialservice.model.mencobatutorialEntry> getEntries(
		long groupId, long guestbookId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntries(groupId, guestbookId, start, end);
	}

	public static int getEntriesCount(long groupId, long guestbookId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getEntriesCount(groupId, guestbookId);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static mencobatutorialservice.model.mencobatutorialEntry updateEntry(
		long userId, long guestbookId, long entryId, String name, String email,
		String message,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .updateEntry(userId, guestbookId, entryId, name, email,
			message, serviceContext);
	}

	public static mencobatutorialEntryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<mencobatutorialEntryService, mencobatutorialEntryService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(mencobatutorialEntryService.class);

		ServiceTracker<mencobatutorialEntryService, mencobatutorialEntryService> serviceTracker =
			new ServiceTracker<mencobatutorialEntryService, mencobatutorialEntryService>(bundle.getBundleContext(),
				mencobatutorialEntryService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}