package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;
import com.mariano.memorymanagement.helper.MemoryHelper;
import com.mariano.memorymanagement.model.CustomObject;

/**
 * @author Mariano Camposeco
 */
public class ObjectComparisonService {
    private static final ObjectComparisonService INSTANCE = new ObjectComparisonService();
    private final EqualHelper equalHelper;
    private final MemoryHelper memoryHelper;

    private ObjectComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
        this.memoryHelper = MemoryHelper.getInstance();
    }

    public static ObjectComparisonService getInstance() {
        return INSTANCE;
    }

    public void observeIdenticalObjects() {
        CustomObject firstObject = new CustomObject(100);
        CustomObject secondObject = new CustomObject(100);

        System.out.println("Observing identical objects (different references, same value):");
        System.out.println("firstObject Value: " + firstObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value: " + secondObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        firstObject.setValue(200);

        System.out.println("\nAfter modifying firstObject:");
        System.out.println("firstObject Value: " + firstObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value (Unchanged): " + secondObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        System.out.println();
    }

    public void observeSameReferenceObjects() {
        CustomObject firstObject = new CustomObject(300);
        CustomObject secondObject = firstObject;

        System.out.println("Observing objects with the same reference:");
        System.out.println("firstObject Value: " + firstObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value: " + secondObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        firstObject.setValue(400);

        System.out.println("\nAfter modifying firstObject:");
        System.out.println("firstObject Value: " + firstObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value (Also Changed): " + secondObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        System.out.println();
    }

    public void compareObjects() {
        CustomObject firstObject = new CustomObject(300);
        CustomObject secondObject = new CustomObject(300);

        System.out.println("Comparing two objects with the same value but different references:");
        System.out.println("firstObject Value: " + firstObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value: " + secondObject.getValue() + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        System.out.println();
        equalHelper.compareCustomObjectsWithEquals(firstObject, secondObject);
    }
}
