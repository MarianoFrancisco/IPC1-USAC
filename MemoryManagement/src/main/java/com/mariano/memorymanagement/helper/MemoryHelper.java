package com.mariano.memorymanagement.helper;

/**
 * @author Mariano Camposeco
 */
public class MemoryHelper {
    private static final MemoryHelper INSTANCE = new MemoryHelper();

    private MemoryHelper() {
    }

    public static MemoryHelper getInstance() {
        return INSTANCE;
    }

    public String getHexIdentity(Object obj) {
        return "0x" + Integer.toHexString(System.identityHashCode(obj));
    }
}
