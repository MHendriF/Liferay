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

package mencobatutorialservice.service.impl;

import java.util.List;
//import java.util.Map.Entry;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;

import mencobatutorialservice.model.mencobatutorialEntry;
import mencobatutorialservice.service.base.mencobatutorialEntryServiceBaseImpl;

//import java.util.List;
//
//import com.liferay.portal.kernel.exception.PortalException;
//import com.liferay.portal.kernel.exception.SystemException;
//import com.liferay.portal.kernel.search.suggest.SuggesterResult.Entry;
//import com.liferay.portal.kernel.service.ServiceContext;
//
//import mencobatutorialservice.model.mencobatutorial;
//import mencobatutorialservice.model.mencobatutorialEntry;
//import mencobatutorialservice.service.base.mencobatutorialEntryServiceBaseImpl;

/**
 * The implementation of the mencobatutorial entry remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mencobatutorialservice.service.mencobatutorialEntryService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialEntryServiceBaseImpl
 * @see mencobatutorialservice.service.mencobatutorialEntryServiceUtil
 */
public class mencobatutorialEntryServiceImpl
	extends mencobatutorialEntryServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mencobatutorialservice.service.mencobatutorialEntryServiceUtil} to access the mencobatutorial entry remote service.
	 */
	
	public mencobatutorialEntry addEntry(long userId, long guestbookId, String name,
	        String email, String message, ServiceContext serviceContext)
	        throws PortalException, SystemException {

	    return mencobatutorialEntryLocalService.addEntry(userId, guestbookId, name, email,
	                 message, serviceContext);
	}

	public mencobatutorialEntry deleteEntry(long entryId, ServiceContext serviceContext)
	                throws PortalException, SystemException {

	    return mencobatutorialEntryLocalService.deleteEntry(entryId, serviceContext);
	}

	public List<mencobatutorialEntry> getEntries(long groupId, long guestbookId)
	                throws SystemException {

	    return mencobatutorialEntryLocalService.getEntries(groupId, guestbookId);
	}

	public List<mencobatutorialEntry> getEntries(long groupId, long guestbookId, int start,
	                int end) throws SystemException {

	    return mencobatutorialEntryLocalService.getEntries(groupId, guestbookId, start, end);
	}

	public int getEntriesCount(long groupId, long guestbookId)
	                throws SystemException {

	    return mencobatutorialEntryLocalService.getEntriesCount(groupId, guestbookId);
	}

	public mencobatutorialEntry updateEntry(long userId, long guestbookId, long entryId,
	                String name, String email, String message,
	                ServiceContext serviceContext) throws PortalException,
	                SystemException {

	    return mencobatutorialEntryLocalService.updateEntry(userId, guestbookId, entryId,
	                        name, email, message, serviceContext);
	}
}