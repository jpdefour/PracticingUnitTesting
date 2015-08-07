package com.riis.testingproject;

/**
 * Created by jdefour on 8/4/2015.
 *
 * Use this class to be mocked. It does unpredictable things
 */
public class CrazyStuff {

    public int doACrazyThing(int crazyNumber) throws Exception {
        if(crazyNumber > 5){
            return 2;
        } else {
            throw new Exception();
        }
    }
}
