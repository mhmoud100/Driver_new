package com.pinkcar.providers.listeners;

import java.util.ArrayList;
import java.util.List;

public class Connect {
    private static boolean myBoolean;
    private static List<com.pinkcar.providers.listeners.ConnectionChangeListener> listeners = new ArrayList();

    public static boolean getMyBoolean() {
        return myBoolean;
    }

    public static void setMyBoolean(boolean value) {
        myBoolean = value;

        for (com.pinkcar.providers.listeners.ConnectionChangeListener l : listeners) {
            l.OnMyBooleanChanged();
        }
    }

    public static void addMyBooleanListener(com.pinkcar.providers.listeners.ConnectionChangeListener l) {
        listeners.add(l);
    }
}
