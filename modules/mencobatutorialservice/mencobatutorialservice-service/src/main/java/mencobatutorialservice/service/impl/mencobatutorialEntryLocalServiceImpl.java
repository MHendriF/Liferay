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

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
//import com.liferay.portal.kernel.search.suggest.SuggesterResult.Entry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.Validator;

import mencobatutorialservice.exception.EntryEmailException;
import mencobatutorialservice.exception.EntryMessageException;
import mencobatutorialservice.exception.EntryNameException;
import mencobatutorialservice.model.mencobatutorialEntry;
import mencobatutorialservice.service.base.mencobatutorialEntryLocalServiceBaseImpl;

/**
 * The implementation of the mencobatutorial entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mencobatutorialservice.service.mencobatutorialEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialEntryLocalServiceBaseImpl
 * @see mencobatutorialservice.service.mencobatutorialEntryLocalServiceUtil
 */
public class mencobatutorialEntryLocalServiceImpl
	extends mencobatutorialEntryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mencobatutorialservice.service.mencobatutorialEntryLocalServiceUtil} to access the mencobatutorial entry local service.
	 */
	
	public mencobatutorialEntry addEntry(
	    long userId, long guestbookId, String name, String email,
	    String message, ServiceContext serviceContext)
	    throws PortalException {

	    long groupId = serviceContext.getScopeGroupId();

	    User user = userLocalService.getUserById(userId);

	    Date now = new Date();

	    validate(name, email, message);

	    long entryId = counterLocalService.increment();

	    mencobatutorialEntry entry = mencobatutorialEntryPersistence.create(entryId);

	    entry.setUuid(serviceContext.getUuid());
	    entry.setUserId(userId);
	    entry.setGroupId(groupId);
	    entry.setCompanyId(user.getCompanyId());
	    entry.setUserName(user.getFullName());
	    entry.setCreateDate(serviceContext.getCreateDate(now));
	    entry.setModifiedDate(serviceContext.getModifiedDate(now));
	    entry.setExpandoBridgeAttributes(serviceContext);
	    entry.setGuestbookId(guestbookId);
	    entry.setName(name);
	    entry.setEmail(email);
	    entry.setMessage(message);

	    mencobatutorialEntryPersistence.update(entry);

	    return entry;
	}
	
	public mencobatutorialEntry updateEntry (
	    long userId, long guestbookId, long entryId, String name, String email,
	    String message, ServiceContext serviceContext)
	    throws PortalException, SystemException {

	    Date now = new Date();

	    validate(name, email, message);

	    mencobatutorialEntry entry = getmencobatutorialEntry(entryId);

	    User user = userLocalService.getUserById(userId);

	    entry.setUserId(userId);
	    entry.setUserName(user.getFullName());
	    entry.setModifiedDate(serviceContext.getModifiedDate(now));
	    entry.setName(name);
	    entry.setEmail(email);
	    entry.setMessage(message);
	    entry.setExpandoBridgeAttributes(serviceContext);

	    mencobatutorialEntryPersistence.update(entry);

	    return entry;
	}
	
	public mencobatutorialEntry deleteEntry (long entryId, ServiceContext serviceContext)
	    throws PortalException {

		mencobatutorialEntry entry = getmencobatutorialEntry(entryId);

	    entry = deletemencobatutorialEntry(entryId);

	    return entry;
	}
	
	public List<mencobatutorialEntry> getEntries(long groupId, long guestbookId) {
	    return mencobatutorialEntryPersistence.findByG_G(groupId, guestbookId);
	}

	public List<mencobatutorialEntry> getEntries(long groupId, long guestbookId, int start, int end)
	    throws SystemException {

	    return mencobatutorialEntryPersistence.findByG_G(groupId, guestbookId, start, end);
	}

	public List<mencobatutorialEntry> getEntries(
	    long groupId, long guestbookId, int start, int end, OrderByComparator<mencobatutorialEntry> obc) {

	    return mencobatutorialEntryPersistence.findByG_G(groupId, guestbookId, start, end, obc);
	}

	public int getEntriesCount(long groupId, long guestbookId) {
	    return mencobatutorialEntryPersistence.countByG_G(groupId, guestbookId);
	}
	
	protected void validate(String name, String email, String entry)
	    throws PortalException {

	    if (Validator.isNull(name)) {
	        throw new EntryNameException();
	    }

	    if (!Validator.isEmailAddress(email)) {
	        throw new EntryEmailException();
	    }

	    if (Validator.isNull(entry)) {
	        throw new EntryMessageException();
	    }
	}
}