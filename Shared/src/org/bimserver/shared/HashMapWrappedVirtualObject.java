package org.bimserver.shared;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

import org.bimserver.BimserverDatabaseException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class HashMapWrappedVirtualObject implements WrappedVirtualObject {

	private EClass eClass;
	private final Map<EStructuralFeature, Object> map = new HashMap<>();

	public HashMapWrappedVirtualObject(Reusable reusable, EClass eClass) {
		this.eClass = eClass;
	}

	@Override
	public EClass eClass() {
		return eClass;
	}

	public Object eGet(EStructuralFeature feature) {
		return map.get(feature);
	}
	
	@Override
	public void setAttribute(EStructuralFeature eStructuralFeature, Object value) throws BimserverDatabaseException {
		map.put(eStructuralFeature, value);
	}

	@Override
	public ByteBuffer write() throws BimserverDatabaseException {
		return null;
	}

	public Object eGet(String name) {
		EStructuralFeature feature = eClass.getEStructuralFeature(name);
		return eGet(feature);
	}
}