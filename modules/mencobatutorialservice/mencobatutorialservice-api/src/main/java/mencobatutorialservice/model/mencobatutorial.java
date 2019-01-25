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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the mencobatutorial service. Represents a row in the &quot;GB_mencobatutorial&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see mencobatutorialModel
 * @see mencobatutorialservice.model.impl.mencobatutorialImpl
 * @see mencobatutorialservice.model.impl.mencobatutorialModelImpl
 * @generated
 */
@ImplementationClassName("mencobatutorialservice.model.impl.mencobatutorialImpl")
@ProviderType
public interface mencobatutorial extends mencobatutorialModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link mencobatutorialservice.model.impl.mencobatutorialImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<mencobatutorial, Long> GUESTBOOK_ID_ACCESSOR = new Accessor<mencobatutorial, Long>() {
			@Override
			public Long get(mencobatutorial mencobatutorial) {
				return mencobatutorial.getGuestbookId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<mencobatutorial> getTypeClass() {
				return mencobatutorial.class;
			}
		};
}