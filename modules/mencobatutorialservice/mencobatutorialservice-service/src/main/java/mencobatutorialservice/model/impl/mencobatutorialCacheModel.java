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

package mencobatutorialservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import mencobatutorialservice.model.mencobatutorial;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing mencobatutorial in entity cache.
 *
 * @author liferay
 * @see mencobatutorial
 * @generated
 */
@ProviderType
public class mencobatutorialCacheModel implements CacheModel<mencobatutorial>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencobatutorialCacheModel)) {
			return false;
		}

		mencobatutorialCacheModel mencobatutorialCacheModel = (mencobatutorialCacheModel)obj;

		if (guestbookId == mencobatutorialCacheModel.guestbookId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, guestbookId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", name=");
		sb.append(name);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public mencobatutorial toEntityModel() {
		mencobatutorialImpl mencobatutorialImpl = new mencobatutorialImpl();

		if (uuid == null) {
			mencobatutorialImpl.setUuid("");
		}
		else {
			mencobatutorialImpl.setUuid(uuid);
		}

		mencobatutorialImpl.setGuestbookId(guestbookId);
		mencobatutorialImpl.setGroupId(groupId);
		mencobatutorialImpl.setCompanyId(companyId);
		mencobatutorialImpl.setUserId(userId);

		if (userName == null) {
			mencobatutorialImpl.setUserName("");
		}
		else {
			mencobatutorialImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mencobatutorialImpl.setCreateDate(null);
		}
		else {
			mencobatutorialImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mencobatutorialImpl.setModifiedDate(null);
		}
		else {
			mencobatutorialImpl.setModifiedDate(new Date(modifiedDate));
		}

		mencobatutorialImpl.setStatus(status);
		mencobatutorialImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			mencobatutorialImpl.setStatusByUserName("");
		}
		else {
			mencobatutorialImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			mencobatutorialImpl.setStatusDate(null);
		}
		else {
			mencobatutorialImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			mencobatutorialImpl.setName("");
		}
		else {
			mencobatutorialImpl.setName(name);
		}

		mencobatutorialImpl.resetOriginalValues();

		return mencobatutorialImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		guestbookId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		name = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(guestbookId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}
	}

	public String uuid;
	public long guestbookId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public String name;
}