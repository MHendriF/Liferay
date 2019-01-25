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

package mencobatutorialservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the mencobatutorial service. Represents a row in the &quot;GB_mencobatutorial&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link mencobatutorialservice.model.impl.mencobatutorialImpl}.
 * </p>
 *
 * @author liferay
 * @see mencobatutorial
 * @see mencobatutorialservice.model.impl.mencobatutorialImpl
 * @see mencobatutorialservice.model.impl.mencobatutorialModelImpl
 * @generated
 */
@ProviderType
public interface mencobatutorialModel extends BaseModel<mencobatutorial>,
	GroupedModel, ShardedModel, StagedAuditedModel, WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mencobatutorial model instance should use the {@link mencobatutorial} interface instead.
	 */

	/**
	 * Returns the primary key of this mencobatutorial.
	 *
	 * @return the primary key of this mencobatutorial
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mencobatutorial.
	 *
	 * @param primaryKey the primary key of this mencobatutorial
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this mencobatutorial.
	 *
	 * @return the uuid of this mencobatutorial
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this mencobatutorial.
	 *
	 * @param uuid the uuid of this mencobatutorial
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the guestbook ID of this mencobatutorial.
	 *
	 * @return the guestbook ID of this mencobatutorial
	 */
	public long getGuestbookId();

	/**
	 * Sets the guestbook ID of this mencobatutorial.
	 *
	 * @param guestbookId the guestbook ID of this mencobatutorial
	 */
	public void setGuestbookId(long guestbookId);

	/**
	 * Returns the group ID of this mencobatutorial.
	 *
	 * @return the group ID of this mencobatutorial
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this mencobatutorial.
	 *
	 * @param groupId the group ID of this mencobatutorial
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this mencobatutorial.
	 *
	 * @return the company ID of this mencobatutorial
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this mencobatutorial.
	 *
	 * @param companyId the company ID of this mencobatutorial
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this mencobatutorial.
	 *
	 * @return the user ID of this mencobatutorial
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this mencobatutorial.
	 *
	 * @param userId the user ID of this mencobatutorial
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this mencobatutorial.
	 *
	 * @return the user uuid of this mencobatutorial
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this mencobatutorial.
	 *
	 * @param userUuid the user uuid of this mencobatutorial
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this mencobatutorial.
	 *
	 * @return the user name of this mencobatutorial
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this mencobatutorial.
	 *
	 * @param userName the user name of this mencobatutorial
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this mencobatutorial.
	 *
	 * @return the create date of this mencobatutorial
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this mencobatutorial.
	 *
	 * @param createDate the create date of this mencobatutorial
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this mencobatutorial.
	 *
	 * @return the modified date of this mencobatutorial
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this mencobatutorial.
	 *
	 * @param modifiedDate the modified date of this mencobatutorial
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this mencobatutorial.
	 *
	 * @return the status of this mencobatutorial
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this mencobatutorial.
	 *
	 * @param status the status of this mencobatutorial
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this mencobatutorial.
	 *
	 * @return the status by user ID of this mencobatutorial
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this mencobatutorial.
	 *
	 * @param statusByUserId the status by user ID of this mencobatutorial
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this mencobatutorial.
	 *
	 * @return the status by user uuid of this mencobatutorial
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this mencobatutorial.
	 *
	 * @param statusByUserUuid the status by user uuid of this mencobatutorial
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this mencobatutorial.
	 *
	 * @return the status by user name of this mencobatutorial
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this mencobatutorial.
	 *
	 * @param statusByUserName the status by user name of this mencobatutorial
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this mencobatutorial.
	 *
	 * @return the status date of this mencobatutorial
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this mencobatutorial.
	 *
	 * @param statusDate the status date of this mencobatutorial
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the name of this mencobatutorial.
	 *
	 * @return the name of this mencobatutorial
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this mencobatutorial.
	 *
	 * @param name the name of this mencobatutorial
	 */
	public void setName(String name);

	/**
	 * Returns <code>true</code> if this mencobatutorial is approved.
	 *
	 * @return <code>true</code> if this mencobatutorial is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this mencobatutorial is denied.
	 *
	 * @return <code>true</code> if this mencobatutorial is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this mencobatutorial is a draft.
	 *
	 * @return <code>true</code> if this mencobatutorial is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this mencobatutorial is expired.
	 *
	 * @return <code>true</code> if this mencobatutorial is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this mencobatutorial is inactive.
	 *
	 * @return <code>true</code> if this mencobatutorial is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this mencobatutorial is incomplete.
	 *
	 * @return <code>true</code> if this mencobatutorial is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this mencobatutorial is pending.
	 *
	 * @return <code>true</code> if this mencobatutorial is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this mencobatutorial is scheduled.
	 *
	 * @return <code>true</code> if this mencobatutorial is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		mencobatutorialservice.model.mencobatutorial mencobatutorial);

	@Override
	public int hashCode();

	@Override
	public CacheModel<mencobatutorialservice.model.mencobatutorial> toCacheModel();

	@Override
	public mencobatutorialservice.model.mencobatutorial toEscapedModel();

	@Override
	public mencobatutorialservice.model.mencobatutorial toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}