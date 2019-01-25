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

import mencobatutorialservice.model.mencobatutorialEntry;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing mencobatutorialEntry in entity cache.
 *
 * @author liferay
 * @see mencobatutorialEntry
 * @generated
 */
@ProviderType
public class mencobatutorialEntryCacheModel implements CacheModel<mencobatutorialEntry>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof mencobatutorialEntryCacheModel)) {
			return false;
		}

		mencobatutorialEntryCacheModel mencobatutorialEntryCacheModel = (mencobatutorialEntryCacheModel)obj;

		if (entryId == mencobatutorialEntryCacheModel.entryId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, entryId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", entryId=");
		sb.append(entryId);
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
		sb.append(", email=");
		sb.append(email);
		sb.append(", message=");
		sb.append(message);
		sb.append(", guestbookId=");
		sb.append(guestbookId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public mencobatutorialEntry toEntityModel() {
		mencobatutorialEntryImpl mencobatutorialEntryImpl = new mencobatutorialEntryImpl();

		if (uuid == null) {
			mencobatutorialEntryImpl.setUuid("");
		}
		else {
			mencobatutorialEntryImpl.setUuid(uuid);
		}

		mencobatutorialEntryImpl.setEntryId(entryId);
		mencobatutorialEntryImpl.setGroupId(groupId);
		mencobatutorialEntryImpl.setCompanyId(companyId);
		mencobatutorialEntryImpl.setUserId(userId);

		if (userName == null) {
			mencobatutorialEntryImpl.setUserName("");
		}
		else {
			mencobatutorialEntryImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			mencobatutorialEntryImpl.setCreateDate(null);
		}
		else {
			mencobatutorialEntryImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			mencobatutorialEntryImpl.setModifiedDate(null);
		}
		else {
			mencobatutorialEntryImpl.setModifiedDate(new Date(modifiedDate));
		}

		mencobatutorialEntryImpl.setStatus(status);
		mencobatutorialEntryImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			mencobatutorialEntryImpl.setStatusByUserName("");
		}
		else {
			mencobatutorialEntryImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			mencobatutorialEntryImpl.setStatusDate(null);
		}
		else {
			mencobatutorialEntryImpl.setStatusDate(new Date(statusDate));
		}

		if (name == null) {
			mencobatutorialEntryImpl.setName("");
		}
		else {
			mencobatutorialEntryImpl.setName(name);
		}

		if (email == null) {
			mencobatutorialEntryImpl.setEmail("");
		}
		else {
			mencobatutorialEntryImpl.setEmail(email);
		}

		if (message == null) {
			mencobatutorialEntryImpl.setMessage("");
		}
		else {
			mencobatutorialEntryImpl.setMessage(message);
		}

		mencobatutorialEntryImpl.setGuestbookId(guestbookId);

		mencobatutorialEntryImpl.resetOriginalValues();

		return mencobatutorialEntryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		entryId = objectInput.readLong();

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
		email = objectInput.readUTF();
		message = objectInput.readUTF();

		guestbookId = objectInput.readLong();
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

		objectOutput.writeLong(entryId);

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

		if (email == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (message == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(message);
		}

		objectOutput.writeLong(guestbookId);
	}

	public String uuid;
	public long entryId;
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
	public String email;
	public String message;
	public long guestbookId;
}