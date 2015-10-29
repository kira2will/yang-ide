package com.cisco.yangide.ext.model.editor.patterns.objects;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.cisco.yangide.ext.model.editor.util.YangDiagramImageProvider;
import com.cisco.yangide.ext.model.editor.util.YangModelUtil;
import com.cisco.yangide.ext.model.impl.ModelFactoryImpl;

public class ModulePattern extends DomainObjectPattern {

    @Override
    public String getCreateName() {
        return "module";
    }

    @Override
    protected EObject createEObject() {
        return ModelFactoryImpl.eINSTANCE.createModule();
    }

    @Override
    public String getCreateImageId() {
        return YangDiagramImageProvider.IMG_MODULE_PROPOSAL;
    }

    @Override
    public EClass getObjectEClass() {
        return YangModelUtil.MODEL_PACKAGE.getModule();
    }
    
}