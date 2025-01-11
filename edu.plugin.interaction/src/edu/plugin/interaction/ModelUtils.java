package edu.plugin.interaction;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Education.EducationFactory;
import Education.EducationPackage;
import Education.HighSchool;

public class ModelUtils {

    // Create a HighSchool instance
    public static HighSchool createHighSchool(String name, int foundedYear) {
        HighSchool highSchool = EducationFactory.eINSTANCE.createHighSchool();
        highSchool.setName(name);
        highSchool.setFoundedYear(foundedYear);
        System.out.println("Created HighSchool: " + name);
        return highSchool;
    }

    // Serialize the model to a file
    public static void serializeModel(Resource resource, String filePath) {
        try {
            resource.save(Collections.EMPTY_MAP);
            System.out.println("Model saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load the model from a file
    public static HighSchool loadModel(String filePath) {
        EPackage.Registry.INSTANCE.put(EducationPackage.eNS_URI, EducationPackage.eINSTANCE);
        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.getResource(URI.createFileURI(filePath), true);

        try {
            resource.load(Collections.EMPTY_MAP);
            System.out.println("Model loaded from: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (HighSchool) resource.getContents().get(0);
    }

    // Validate the model
    public static Diagnostic validateModel(HighSchool highSchool) {
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(highSchool);
        if (diagnostic.getSeverity() == Diagnostic.OK) {
            System.out.println("The model is valid.");
        } else {
            System.out.println("The model validation failed: " + diagnostic.getMessage());
        }
        return diagnostic;
    }

    public static void main(String[] args) {
        String filePath = "HighSchools.xmi";

        // Create model instances
        HighSchool highSchool1 = createHighSchool("Liberty High", 1995);
        HighSchool highSchool2 = createHighSchool("Green Valley High", 1980);

        // Save the models
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(URI.createFileURI(filePath));
        resource.getContents().add(highSchool1);
        resource.getContents().add(highSchool2);

        serializeModel(resource, filePath);

        // Load and validate the models
        HighSchool loadedHighSchool = loadModel(filePath);
        validateModel(loadedHighSchool);
    }
}
