package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;

/**
 * @author Mariano Camposeco
 */
public class IntegerComparisonService {
    private static final IntegerComparisonService INSTANCE = new IntegerComparisonService();
    private final EqualHelper equalHelper;

    private IntegerComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
    }

    public static IntegerComparisonService getInstance() {
        return INSTANCE;
    }

    public void compareIntValues() {
        int first = 300;
        int second = 300;
        equalHelper.compareIntWithDoubleEquals(first, second);
    }

    public void compareIntegerHeapValues() {
        Integer third = 350;
        Integer fourth = 350;
        equalHelper.compareIntegerWithDoubleEquals(third, fourth);
        equalHelper.compareIntegerWithEquals(third, fourth);
    }

    public void compareCachedIntegerValues() {
        Integer fifth = 111;
        Integer sixth = 111;
        equalHelper.compareIntegerWithDoubleEquals(fifth, sixth);
        equalHelper.compareIntegerWithEquals(fifth, sixth);

        Integer seventh = new Integer(111);
        Integer eighth = new Integer(111);
        equalHelper.compareIntegerWithDoubleEquals(seventh, eighth);
        equalHelper.compareIntegerWithEquals(seventh, eighth);
    }
}
