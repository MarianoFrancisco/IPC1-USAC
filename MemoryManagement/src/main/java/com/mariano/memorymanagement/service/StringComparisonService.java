package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;

/**
 * @author Mariano Camposeco
 */
public class StringComparisonService {
    private static final StringComparisonService INSTANCE = new StringComparisonService();
    private final EqualHelper equalHelper;

    private StringComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
    }

    public static StringComparisonService getInstance() {
        return INSTANCE;
    }

    public void compareStringLiterals() {
        String first = "hello";
        String second = "hello";
        equalHelper.compareStringWithDoubleEquals(first, second);
        equalHelper.compareStringWithEquals(first, second);
    }

    public void compareNewStringObjects() {
        String third = new String("hello");
        String fourth = new String("hello");
        equalHelper.compareStringWithDoubleEquals(third, fourth);
        equalHelper.compareStringWithEquals(third, fourth);
    }

    public void compareMixedStringReferences() {
        String fifth = "hello";
        String sixth = new String("hello");
        equalHelper.compareStringWithDoubleEquals(fifth, sixth);
        equalHelper.compareStringWithEquals(fifth, sixth);
    }
}
