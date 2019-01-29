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

//import org.omg.IOP.ServiceContext;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.service.ServiceContext;

import mencobatutorialservice.model.mencobatutorial;
import mencobatutorialservice.service.base.mencobatutorialServiceBaseImpl;

/**
 * The implementation of the mencobatutorial remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link mencobatutorialservice.service.mencobatutorialService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialServiceBaseImpl
 * @see mencobatutorialservice.service.mencobatutorialServiceUtil
 */
public class mencobatutorialServiceImpl extends mencobatutorialServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link mencobatutorialservice.service.mencobatutorialServiceUtil} to access the mencobatutorial remote service.
	 */
	
	public mencobatutorial addGuestbook(long userId, String name,
		    ServiceContext serviceContext) throws SystemException,
		    PortalException {

		    return mencobatutorialLocalService.addGuestbook(userId, name, serviceContext);
	}

	public mencobatutorial deleteGuestbook(long guestbookId,
	    ServiceContext serviceContext) throws PortalException,
	    SystemException {

	    return mencobatutorialLocalService.deleteGuestbook(guestbookId, serviceContext);
	}

	public List<mencobatutorial> getGuestbooks(long groupId) throws SystemException {
	        return mencobatutorialLocalService.getGuestbooks(groupId);
	}

	public List<mencobatutorial> getGuestbooks(long groupId, int start, int end)
	                throws SystemException {
	        return mencobatutorialLocalService.getGuestbooks(groupId, start, end);
	}

	public int getGuestbooksCount(long groupId) throws SystemException {
	        return mencobatutorialLocalService.getGuestbooksCount(groupId);
	}

	public mencobatutorial updateGuestbook(long userId, long guestbookId,
	    String name, ServiceContext serviceContext) throws PortalException,
	    SystemException {

	    return mencobatutorialLocalService.updateGuestbook(userId, guestbookId,
	        name, serviceContext);
	}
}