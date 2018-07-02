package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

/**
 * Created by Baraa Hesham on 7/2/2018.
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    Context context;

    @Test
    public void testTaskString() throws InterruptedException {
        assertTrue(true);
        final CountDownLatch latch = new CountDownLatch(1);
        context = InstrumentationRegistry.getContext();
        EndpointsAsyncTask testTask = new EndpointsAsyncTask(context, null) {
            @Override
            protected void onPostExecute(String s) {
                assertNotNull(s);
                if (s != null && !s.equals("")) {
                    assertTrue(s.length() > 0);
                    latch.countDown();
                }
            }
        };
        testTask.execute();
        latch.await();

    }
}