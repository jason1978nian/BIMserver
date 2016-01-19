/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.store.impl;

import org.bimserver.emf.IdEObjectImpl;

import org.bimserver.models.store.PluginType;
import org.bimserver.models.store.PluginVersion;
import org.bimserver.models.store.StorePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plugin Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#isMismatch <em>Mismatch</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.PluginVersionImpl#getArtifactId <em>Artifact Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PluginVersionImpl extends IdEObjectImpl implements PluginVersion {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PLUGIN_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return (String) eGet(StorePackage.Literals.PLUGIN_VERSION__VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__VERSION, newVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PluginType getType() {
		return (PluginType) eGet(StorePackage.Literals.PLUGIN_VERSION__TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PluginType newType) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String) eGet(StorePackage.Literals.PLUGIN_VERSION__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMismatch() {
		return (Boolean) eGet(StorePackage.Literals.PLUGIN_VERSION__MISMATCH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMismatch(boolean newMismatch) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__MISMATCH, newMismatch);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepository() {
		return (String) eGet(StorePackage.Literals.PLUGIN_VERSION__REPOSITORY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepository(String newRepository) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__REPOSITORY, newRepository);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroupId() {
		return (String) eGet(StorePackage.Literals.PLUGIN_VERSION__GROUP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupId(String newGroupId) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__GROUP_ID, newGroupId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArtifactId() {
		return (String) eGet(StorePackage.Literals.PLUGIN_VERSION__ARTIFACT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArtifactId(String newArtifactId) {
		eSet(StorePackage.Literals.PLUGIN_VERSION__ARTIFACT_ID, newArtifactId);
	}

} //PluginVersionImpl
