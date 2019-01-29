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

package mencobatutorialservice.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import mencobatutorialservice.service.mencobatutorialServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link mencobatutorialServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link mencobatutorialservice.model.mencobatutorialSoap}.
 * If the method in the service utility returns a
 * {@link mencobatutorialservice.model.mencobatutorial}, that is translated to a
 * {@link mencobatutorialservice.model.mencobatutorialSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialServiceHttp
 * @see mencobatutorialservice.model.mencobatutorialSoap
 * @see mencobatutorialServiceUtil
 * @generated
 */
@ProviderType
public class mencobatutorialServiceSoap {
	public static mencobatutorialservice.model.mencobatutorialSoap addGuestbook(
		long userId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			mencobatutorialservice.model.mencobatutorial returnValue = mencobatutorialServiceUtil.addGuestbook(userId,
					name, serviceContext);

			return mencobatutorialservice.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mencobatutorialservice.model.mencobatutorialSoap deleteGuestbook(
		long guestbookId,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			mencobatutorialservice.model.mencobatutorial returnValue = mencobatutorialServiceUtil.deleteGuestbook(guestbookId,
					serviceContext);

			return mencobatutorialservice.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mencobatutorialservice.model.mencobatutorialSoap[] getGuestbooks(
		long groupId) throws RemoteException {
		try {
			java.util.List<mencobatutorialservice.model.mencobatutorial> returnValue =
				mencobatutorialServiceUtil.getGuestbooks(groupId);

			return mencobatutorialservice.model.mencobatutorialSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mencobatutorialservice.model.mencobatutorialSoap[] getGuestbooks(
		long groupId, int start, int end) throws RemoteException {
		try {
			java.util.List<mencobatutorialservice.model.mencobatutorial> returnValue =
				mencobatutorialServiceUtil.getGuestbooks(groupId, start, end);

			return mencobatutorialservice.model.mencobatutorialSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static int getGuestbooksCount(long groupId)
		throws RemoteException {
		try {
			int returnValue = mencobatutorialServiceUtil.getGuestbooksCount(groupId);

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static mencobatutorialservice.model.mencobatutorialSoap updateGuestbook(
		long userId, long guestbookId, String name,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			mencobatutorialservice.model.mencobatutorial returnValue = mencobatutorialServiceUtil.updateGuestbook(userId,
					guestbookId, name, serviceContext);

			return mencobatutorialservice.model.mencobatutorialSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(mencobatutorialServiceSoap.class);
}