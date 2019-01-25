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

package mencobatutorialservice.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandler;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerRegistryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.spring.extender.service.ServiceReference;

import mencobatutorialservice.model.mencobatutorial;

import mencobatutorialservice.service.mencobatutorialLocalService;

import mencobatutorialservice.service.persistence.mencobatutorialEntryPersistence;
import mencobatutorialservice.service.persistence.mencobatutorialPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the mencobatutorial local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link mencobatutorialservice.service.impl.mencobatutorialLocalServiceImpl}.
 * </p>
 *
 * @author liferay
 * @see mencobatutorialservice.service.impl.mencobatutorialLocalServiceImpl
 * @see mencobatutorialservice.service.mencobatutorialLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class mencobatutorialLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements mencobatutorialLocalService,
		IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link mencobatutorialservice.service.mencobatutorialLocalServiceUtil} to access the mencobatutorial local service.
	 */

	/**
	 * Adds the mencobatutorial to the database. Also notifies the appropriate model listeners.
	 *
	 * @param mencobatutorial the mencobatutorial
	 * @return the mencobatutorial that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public mencobatutorial addmencobatutorial(mencobatutorial mencobatutorial) {
		mencobatutorial.setNew(true);

		return mencobatutorialPersistence.update(mencobatutorial);
	}

	/**
	 * Creates a new mencobatutorial with the primary key. Does not add the mencobatutorial to the database.
	 *
	 * @param guestbookId the primary key for the new mencobatutorial
	 * @return the new mencobatutorial
	 */
	@Override
	@Transactional(enabled = false)
	public mencobatutorial createmencobatutorial(long guestbookId) {
		return mencobatutorialPersistence.create(guestbookId);
	}

	/**
	 * Deletes the mencobatutorial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param guestbookId the primary key of the mencobatutorial
	 * @return the mencobatutorial that was removed
	 * @throws PortalException if a mencobatutorial with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public mencobatutorial deletemencobatutorial(long guestbookId)
		throws PortalException {
		return mencobatutorialPersistence.remove(guestbookId);
	}

	/**
	 * Deletes the mencobatutorial from the database. Also notifies the appropriate model listeners.
	 *
	 * @param mencobatutorial the mencobatutorial
	 * @return the mencobatutorial that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public mencobatutorial deletemencobatutorial(
		mencobatutorial mencobatutorial) {
		return mencobatutorialPersistence.remove(mencobatutorial);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(mencobatutorial.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return mencobatutorialPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return mencobatutorialPersistence.findWithDynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return mencobatutorialPersistence.findWithDynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return mencobatutorialPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return mencobatutorialPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public mencobatutorial fetchmencobatutorial(long guestbookId) {
		return mencobatutorialPersistence.fetchByPrimaryKey(guestbookId);
	}

	/**
	 * Returns the mencobatutorial matching the UUID and group.
	 *
	 * @param uuid the mencobatutorial's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mencobatutorial, or <code>null</code> if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial fetchmencobatutorialByUuidAndGroupId(String uuid,
		long groupId) {
		return mencobatutorialPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the mencobatutorial with the primary key.
	 *
	 * @param guestbookId the primary key of the mencobatutorial
	 * @return the mencobatutorial
	 * @throws PortalException if a mencobatutorial with the primary key could not be found
	 */
	@Override
	public mencobatutorial getmencobatutorial(long guestbookId)
		throws PortalException {
		return mencobatutorialPersistence.findByPrimaryKey(guestbookId);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(mencobatutorialLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(mencobatutorial.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("guestbookId");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(mencobatutorialLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(mencobatutorial.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("guestbookId");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(mencobatutorialLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(mencobatutorial.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("guestbookId");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {
		final ExportActionableDynamicQuery exportActionableDynamicQuery = new ExportActionableDynamicQuery() {
				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary = portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(stagedModelType,
						modelAdditionCount);

					long modelDeletionCount = ExportImportHelperUtil.getModelDeletionCount(portletDataContext,
							stagedModelType);

					manifestSummary.addModelDeletionCount(stagedModelType,
						modelDeletionCount);

					return modelAdditionCount;
				}
			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(new ActionableDynamicQuery.AddCriteriaMethod() {
				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					Criterion modifiedDateCriterion = portletDataContext.getDateRangeCriteria(
							"modifiedDate");

					Criterion statusDateCriterion = portletDataContext.getDateRangeCriteria(
							"statusDate");

					if ((modifiedDateCriterion != null) &&
							(statusDateCriterion != null)) {
						Disjunction disjunction = RestrictionsFactoryUtil.disjunction();

						disjunction.add(modifiedDateCriterion);
						disjunction.add(statusDateCriterion);

						dynamicQuery.add(disjunction);
					}

					Property workflowStatusProperty = PropertyFactoryUtil.forName(
							"status");

					if (portletDataContext.isInitialPublication()) {
						dynamicQuery.add(workflowStatusProperty.ne(
								WorkflowConstants.STATUS_IN_TRASH));
					}
					else {
						StagedModelDataHandler<?> stagedModelDataHandler = StagedModelDataHandlerRegistryUtil.getStagedModelDataHandler(mencobatutorial.class.getName());

						dynamicQuery.add(workflowStatusProperty.in(
								stagedModelDataHandler.getExportableStatuses()));
					}
				}
			});

		exportActionableDynamicQuery.setCompanyId(portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<mencobatutorial>() {
				@Override
				public void performAction(mencobatutorial mencobatutorial)
					throws PortalException {
					StagedModelDataHandlerUtil.exportStagedModel(portletDataContext,
						mencobatutorial);
				}
			});
		exportActionableDynamicQuery.setStagedModelType(new StagedModelType(
				PortalUtil.getClassNameId(mencobatutorial.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return mencobatutorialLocalService.deletemencobatutorial((mencobatutorial)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return mencobatutorialPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the mencobatutorials matching the UUID and company.
	 *
	 * @param uuid the UUID of the mencobatutorials
	 * @param companyId the primary key of the company
	 * @return the matching mencobatutorials, or an empty list if no matches were found
	 */
	@Override
	public List<mencobatutorial> getmencobatutorialsByUuidAndCompanyId(
		String uuid, long companyId) {
		return mencobatutorialPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of mencobatutorials matching the UUID and company.
	 *
	 * @param uuid the UUID of the mencobatutorials
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching mencobatutorials, or an empty list if no matches were found
	 */
	@Override
	public List<mencobatutorial> getmencobatutorialsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<mencobatutorial> orderByComparator) {
		return mencobatutorialPersistence.findByUuid_C(uuid, companyId, start,
			end, orderByComparator);
	}

	/**
	 * Returns the mencobatutorial matching the UUID and group.
	 *
	 * @param uuid the mencobatutorial's UUID
	 * @param groupId the primary key of the group
	 * @return the matching mencobatutorial
	 * @throws PortalException if a matching mencobatutorial could not be found
	 */
	@Override
	public mencobatutorial getmencobatutorialByUuidAndGroupId(String uuid,
		long groupId) throws PortalException {
		return mencobatutorialPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the mencobatutorials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link mencobatutorialservice.model.impl.mencobatutorialModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of mencobatutorials
	 * @param end the upper bound of the range of mencobatutorials (not inclusive)
	 * @return the range of mencobatutorials
	 */
	@Override
	public List<mencobatutorial> getmencobatutorials(int start, int end) {
		return mencobatutorialPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of mencobatutorials.
	 *
	 * @return the number of mencobatutorials
	 */
	@Override
	public int getmencobatutorialsCount() {
		return mencobatutorialPersistence.countAll();
	}

	/**
	 * Updates the mencobatutorial in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param mencobatutorial the mencobatutorial
	 * @return the mencobatutorial that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public mencobatutorial updatemencobatutorial(
		mencobatutorial mencobatutorial) {
		return mencobatutorialPersistence.update(mencobatutorial);
	}

	/**
	 * Returns the mencobatutorial local service.
	 *
	 * @return the mencobatutorial local service
	 */
	public mencobatutorialLocalService getmencobatutorialLocalService() {
		return mencobatutorialLocalService;
	}

	/**
	 * Sets the mencobatutorial local service.
	 *
	 * @param mencobatutorialLocalService the mencobatutorial local service
	 */
	public void setmencobatutorialLocalService(
		mencobatutorialLocalService mencobatutorialLocalService) {
		this.mencobatutorialLocalService = mencobatutorialLocalService;
	}

	/**
	 * Returns the mencobatutorial persistence.
	 *
	 * @return the mencobatutorial persistence
	 */
	public mencobatutorialPersistence getmencobatutorialPersistence() {
		return mencobatutorialPersistence;
	}

	/**
	 * Sets the mencobatutorial persistence.
	 *
	 * @param mencobatutorialPersistence the mencobatutorial persistence
	 */
	public void setmencobatutorialPersistence(
		mencobatutorialPersistence mencobatutorialPersistence) {
		this.mencobatutorialPersistence = mencobatutorialPersistence;
	}

	/**
	 * Returns the mencobatutorial entry local service.
	 *
	 * @return the mencobatutorial entry local service
	 */
	public mencobatutorialservice.service.mencobatutorialEntryLocalService getmencobatutorialEntryLocalService() {
		return mencobatutorialEntryLocalService;
	}

	/**
	 * Sets the mencobatutorial entry local service.
	 *
	 * @param mencobatutorialEntryLocalService the mencobatutorial entry local service
	 */
	public void setmencobatutorialEntryLocalService(
		mencobatutorialservice.service.mencobatutorialEntryLocalService mencobatutorialEntryLocalService) {
		this.mencobatutorialEntryLocalService = mencobatutorialEntryLocalService;
	}

	/**
	 * Returns the mencobatutorial entry persistence.
	 *
	 * @return the mencobatutorial entry persistence
	 */
	public mencobatutorialEntryPersistence getmencobatutorialEntryPersistence() {
		return mencobatutorialEntryPersistence;
	}

	/**
	 * Sets the mencobatutorial entry persistence.
	 *
	 * @param mencobatutorialEntryPersistence the mencobatutorial entry persistence
	 */
	public void setmencobatutorialEntryPersistence(
		mencobatutorialEntryPersistence mencobatutorialEntryPersistence) {
		this.mencobatutorialEntryPersistence = mencobatutorialEntryPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("mencobatutorialservice.model.mencobatutorial",
			mencobatutorialLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"mencobatutorialservice.model.mencobatutorial");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return mencobatutorialLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return mencobatutorial.class;
	}

	protected String getModelClassName() {
		return mencobatutorial.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = mencobatutorialPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = mencobatutorialLocalService.class)
	protected mencobatutorialLocalService mencobatutorialLocalService;
	@BeanReference(type = mencobatutorialPersistence.class)
	protected mencobatutorialPersistence mencobatutorialPersistence;
	@BeanReference(type = mencobatutorialservice.service.mencobatutorialEntryLocalService.class)
	protected mencobatutorialservice.service.mencobatutorialEntryLocalService mencobatutorialEntryLocalService;
	@BeanReference(type = mencobatutorialEntryPersistence.class)
	protected mencobatutorialEntryPersistence mencobatutorialEntryPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}