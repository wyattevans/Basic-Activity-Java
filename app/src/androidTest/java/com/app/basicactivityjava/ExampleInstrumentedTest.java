package com.app.basicactivityjava;

import android.content.Context;
import android.util.Log;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.app.basicactivityjava.activities.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    private final String simpleTAG = ExampleInstrumentedTest.class.getSimpleName();

    @Test
    public void useAppContext() {
        Log.d(simpleTAG, "useAppContent method hit.");
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("com.app.basicactivityjava", appContext.getPackageName());
    }
}
