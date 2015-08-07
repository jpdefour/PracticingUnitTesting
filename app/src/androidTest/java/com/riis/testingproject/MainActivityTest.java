package com.riis.testingproject;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.test.InstrumentationTestCase;
import android.test.UiThreadTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

import static org.mockito.Mockito.*;

/**
 * Created by jdefour on 8/3/2015.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    Activity mainActivity;
    Button changeButton;
    Button crazyButton;
    TextView changeTextView;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        setActivityInitialTouchMode(true);
        mainActivity = getActivity();
        changeButton =  (Button) mainActivity.findViewById(R.id.changeTextButton);
        crazyButton = (Button) mainActivity.findViewById(R.id.crazyButton);
        changeTextView = (TextView) mainActivity.findViewById(R.id.changeText);
    }

    @SmallTest
    @UiThreadTest
    public void testTextChanged() {

        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                changeButton.performClick();
                assertEquals("I got changed!", changeTextView.getText());
            }
        });

    }

    @SmallTest
    @UiThreadTest
    public void testCrazyMethod() {
        mainActivity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Random randomMock = mock(Random.class);
                when(new Random()).thenReturn(randomMock);
//                CrazyStuff crazyStuffMock = mock(CrazyStuff.class);
                crazyButton.performClick();

            }
        });
    }

}
