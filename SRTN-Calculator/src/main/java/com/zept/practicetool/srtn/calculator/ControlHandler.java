package com.zept.practicetool.srtn.calculator;

/**
 *
 * @author Allen James Laxamana
 */
public class ControlHandler {
    // Singleton pattern
    private static ControlHandler instance = new ControlHandler();
    private ControlHandler() {}
    public static ControlHandler getInstance() {
        return instance;
    }
}
