package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;
import com.mariano.memorymanagement.helper.MemoryHelper;

/**
 * @author Mariano Camposeco
 */
public class IntegerComparisonService {
    private static final IntegerComparisonService INSTANCE = new IntegerComparisonService();
    private final EqualHelper equalHelper;
    private final MemoryHelper memoryHelper;

    private IntegerComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
        this.memoryHelper = MemoryHelper.getInstance();
    }

    public static IntegerComparisonService getInstance() {
        return INSTANCE;
    }

    public void compareIntValues() {
        int firstValue = 300;
        int secondValue = 300;

        System.out.println("Comparing primitive int values (stored in stack, no references):");
        System.out.println("firstValue: " + firstValue);
        System.out.println("secondValue: " + secondValue);

        System.out.println();
        equalHelper.compareIntWithDoubleEquals(firstValue, secondValue);
    }

    public void compareIntegerHeapValues() {
        Integer firstInteger = 350;
        Integer secondInteger = 350;

        System.out.println("Comparing Integer objects (outside cache, different heap objects):");
        System.out.println("firstInteger Value: " + firstInteger + " | Reference: " + memoryHelper.getHexIdentity(firstInteger));
        System.out.println("secondInteger Value: " + secondInteger + " | Reference: " + memoryHelper.getHexIdentity(secondInteger));

        System.out.println();
        equalHelper.compareIntegerWithDoubleEquals(firstInteger, secondInteger);
        equalHelper.compareIntegerWithEquals(firstInteger, secondInteger);
    }

    public void compareCachedIntegerValues() {
        Integer cachedFirst = 111;
        Integer cachedSecond = 111;

        System.out.println("Comparing cached Integer values (within -128 to 127 range):");
        System.out.println("cachedFirst Value: " + cachedFirst + " | Reference: " + memoryHelper.getHexIdentity(cachedFirst));
        System.out.println("cachedSecond Value: " + cachedSecond + " | Reference: " + memoryHelper.getHexIdentity(cachedSecond));

        System.out.println();
        equalHelper.compareIntegerWithDoubleEquals(cachedFirst, cachedSecond);
        equalHelper.compareIntegerWithEquals(cachedFirst, cachedSecond);

        Integer nonCachedFirst = new Integer(111);
        Integer nonCachedSecond = new Integer(111);

        System.out.println("\nComparing manually created Integer objects (new instances in heap):");
        System.out.println("nonCachedFirst Value: " + nonCachedFirst + " | Reference: " + memoryHelper.getHexIdentity(nonCachedFirst));
        System.out.println("nonCachedSecond Value: " + nonCachedSecond + " | Reference: " + memoryHelper.getHexIdentity(nonCachedSecond));

        System.out.println();
        equalHelper.compareIntegerWithDoubleEquals(nonCachedFirst, nonCachedSecond);
        equalHelper.compareIntegerWithEquals(nonCachedFirst, nonCachedSecond);
    }
}
