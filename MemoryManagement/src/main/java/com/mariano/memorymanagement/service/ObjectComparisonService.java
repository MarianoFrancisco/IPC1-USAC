package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;
import com.mariano.memorymanagement.model.CustomObject;

/**
 * @author Mariano Camposeco
 */
public class ObjectComparisonService {
    private static final ObjectComparisonService INSTANCE = new ObjectComparisonService();
    private final EqualHelper equalHelper;

    private ObjectComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
    }

    public static ObjectComparisonService getInstance() {
        return INSTANCE;
    }

    public void observeIdenticalObjects() {
        CustomObject first = new CustomObject(100);
        CustomObject second = new CustomObject(100);

        System.out.println(first);
        System.out.println(second);

        first.setValue(200);

        System.out.println(first);
        System.out.println(second);
    }

    public void observeSameReferenceObjects() {
        CustomObject first = new CustomObject(300);
        CustomObject second = first;

        System.out.println(first);
        System.out.println(second);

        first.setValue(400);

        System.out.println(first);
        System.out.println(second);
    }

    public void compareObjects() {
        CustomObject first = new CustomObject(300);
        CustomObject second = new CustomObject(300);
        equalHelper.compareCustomObjectsWithEquals(first, second);
    }
}
