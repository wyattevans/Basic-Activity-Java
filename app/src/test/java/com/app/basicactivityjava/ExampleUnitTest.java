package com.app.basicactivityjava;

import android.util.Log;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    private final String simpleTAG = ExampleUnitTest.class.getSimpleName();

    @Test
    public void addition_isCorrect() {
        Log.d(simpleTAG, "useAppContent method hit.");
        assertEquals(4, 2 + 2);
    }
}