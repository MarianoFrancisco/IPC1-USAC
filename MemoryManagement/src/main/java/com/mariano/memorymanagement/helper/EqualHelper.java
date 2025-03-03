package com.mariano.memorymanagement.helper;

import com.mariano.memorymanagement.model.CustomObject;

/**
 * @author Mariano Camposeco
 */
public class EqualHelper {
    private static final EqualHelper INSTANCE = new EqualHelper();

    private EqualHelper() {
    }

    public static EqualHelper getInstance() {
        return INSTANCE;
    }

    public void compareIntWithDoubleEquals(int first, int second) {
        System.out.println("int: " + (first == second ? "equal (==)" : "different (==)"));
    }

    public void compareIntegerWithDoubleEquals(Integer first, Integer second) {
        System.out.println("Integer: " + (first == second ? "equal (==)" : "different (==)"));
    }

    public void compareIntegerWithEquals(Integer first, Integer second) {
        System.out.println("Integer: " + (first.equals(second) ? "equal (equals())" : "different (equals())"));
    }

    public void compareStringWithDoubleEquals(String first, String second) {
        System.out.println("String: " + (first == second ? "equal (==)" : "different (==)"));
    }

    public void compareStringWithEquals(String first, String second) {
        System.out.println("String: " + (first.equals(second) ? "equal (equals())" : "different (equals())"));
    }

    public void compareCustomObjectsWithDoubleEquals(CustomObject first, CustomObject second) {
        System.out.println("CustomObject: " + (first == second ? "equal (==)" : "different (==)"));
    }

    public void compareCustomObjectsWithEquals(CustomObject first, CustomObject second) {
        System.out.println("CustomObject: " + (first.equals(second) ? "equal (equals())" : "different (equals())"));
    }
}
