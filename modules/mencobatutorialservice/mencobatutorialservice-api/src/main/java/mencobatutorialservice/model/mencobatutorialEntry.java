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
 * The extended model interface for the mencobatutorialEntry service. Represents a row in the &quot;GB_mencobatutorialEntry&quot; database table, with each column mapped to a property of this class.
 *
 * @author liferay
 * @see mencobatutorialEntryModel
 * @see mencobatutorialservice.model.impl.mencobatutorialEntryImpl
 * @see mencobatutorialservice.model.impl.mencobatutorialEntryModelImpl
 * @generated
 */
@ImplementationClassName("mencobatutorialservice.model.impl.mencobatutorialEntryImpl")
@ProviderType
public interface mencobatutorialEntry extends mencobatutorialEntryModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link mencobatutorialservice.model.impl.mencobatutorialEntryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<mencobatutorialEntry, Long> ENTRY_ID_ACCESSOR = new Accessor<mencobatutorialEntry, Long>() {
			@Override
			public Long get(mencobatutorialEntry mencobatutorialEntry) {
				return mencobatutorialEntry.getEntryId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<mencobatutorialEntry> getTypeClass() {
				return mencobatutorialEntry.class;
			}
		};
}