package com.mariano.memorymanagement.service;

import com.mariano.memorymanagement.helper.EqualHelper;
import com.mariano.memorymanagement.helper.MemoryHelper;

/**
 * @author Mariano Camposeco
 */
public class StringComparisonService {
    private static final StringComparisonService INSTANCE = new StringComparisonService();
    private final EqualHelper equalHelper;
    private final MemoryHelper memoryHelper;

    private StringComparisonService() {
        this.equalHelper = EqualHelper.getInstance();
        this.memoryHelper = MemoryHelper.getInstance();
    }

    public static StringComparisonService getInstance() {
        return INSTANCE;
    }

    public void compareStringLiterals() {
        String firstString = "Hello";
        String secondString = "Hello";

        System.out.println("Comparing string literals:");
        System.out.println("firstString Value: " + firstString + " | Reference: " + memoryHelper.getHexIdentity(firstString));
        System.out.println("secondString Value: " + secondString + " | Reference: " + memoryHelper.getHexIdentity(secondString));

        System.out.println();
        equalHelper.compareStringWithDoubleEquals(firstString, secondString);
        equalHelper.compareStringWithEquals(firstString, secondString);
    }

    public void compareNewStringObjects() {
        String firstObject = new String("Hello");
        String secondObject = new String("Hello");

        System.out.println("Comparing new String objects:");
        System.out.println("firstObject Value: " + firstObject + " | Reference: " + memoryHelper.getHexIdentity(firstObject));
        System.out.println("secondObject Value: " + secondObject + " | Reference: " + memoryHelper.getHexIdentity(secondObject));

        System.out.println();
        equalHelper.compareStringWithDoubleEquals(firstObject, secondObject);
        equalHelper.compareStringWithEquals(firstObject, secondObject);
    }

    public void compareMixedStringReferences() {
        String literalString = "Hello";
        String objectString = new String("Hello");

        System.out.println("Comparing literal and new String object:");
        System.out.println("literalString Value: " + literalString + " | Reference: " + memoryHelper.getHexIdentity(literalString));
        System.out.println("objectString Value: " + objectString + " | Reference: " + memoryHelper.getHexIdentity(objectString));

        System.out.println();
        equalHelper.compareStringWithDoubleEquals(literalString, objectString);
        equalHelper.compareStringWithEquals(literalString, objectString);
    }

    public void demonstrateStringImmutability() {
        String immutableString = "Hello";
        String anotherReference = "Hello";

        System.out.println("Before modification:");
        System.out.println("immutableString Value: " + immutableString + " | Reference: " + memoryHelper.getHexIdentity(immutableString));
        System.out.println("anotherReference Value: " + anotherReference + " | Reference: " + memoryHelper.getHexIdentity(anotherReference));

        anotherReference = anotherReference + " World";

        System.out.println("\nAfter modification:");
        System.out.println("immutableString Value (Unchanged): " + immutableString + " | Reference: " + memoryHelper.getHexIdentity(immutableString));
        System.out.println("anotherReference Value (New Object): " + anotherReference + " | Reference: " + memoryHelper.getHexIdentity(anotherReference));
    }
}
