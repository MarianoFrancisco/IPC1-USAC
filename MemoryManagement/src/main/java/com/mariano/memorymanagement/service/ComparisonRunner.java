package com.mariano.memorymanagement.service;

/**
 * @author Mariano Camposeco
 */
public class ComparisonRunner {

    private ComparisonRunner() {
    }

    public static void runAllComparisons() {
        runIntegerComparisons();
        runStringComparisons();
        runObjectComparisons();
    }

    private static void runIntegerComparisons() {
        System.out.println("\n-> Integer Comparisons");
        IntegerComparisonService integerComparison = IntegerComparisonService.getInstance();

        System.out.println("\n--------------------------------------------------");
        integerComparison.compareIntValues();

        System.out.println("\n--------------------------------------------------");
        integerComparison.compareIntegerHeapValues();

        System.out.println("\n--------------------------------------------------");
        integerComparison.compareCachedIntegerValues();
    }

    private static void runStringComparisons() {
        System.out.println("\n-> String Comparisons");
        StringComparisonService stringComparison = StringComparisonService.getInstance();

        System.out.println("\n--------------------------------------------------");
        stringComparison.compareStringLiterals();

        System.out.println("\n--------------------------------------------------");
        stringComparison.compareNewStringObjects();

        System.out.println("\n--------------------------------------------------");
        stringComparison.compareMixedStringReferences();
    }

    private static void runObjectComparisons() {
        System.out.println("\n-> Object Comparisons");
        ObjectComparisonService objectComparison = ObjectComparisonService.getInstance();

        System.out.println("\n--------------------------------------------------");
        objectComparison.observeIdenticalObjects();

        System.out.println("\n--------------------------------------------------");
        objectComparison.observeSameReferenceObjects();

        System.out.println("\n--------------------------------------------------");
        objectComparison.compareObjects();
    }
}
