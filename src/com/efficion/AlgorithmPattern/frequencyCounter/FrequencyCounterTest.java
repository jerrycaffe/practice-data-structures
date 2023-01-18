package com.efficion.AlgorithmPattern.frequencyCounter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FrequencyCounterTest {
    private final ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,23,4));
    private final ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4,9,16));
    ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(2,3,4,5,6,7));
    ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(4,9,16,25,36,49));
    @Test
   public void testNaiveSolution(){


        assertAll(
                ()-> assertFalse(SameArraySquared.naiveSameArrSquare(arr1, arr3),
                        "When array length are different should return false"),
                ()-> assertFalse(SameArraySquared.naiveSameArrSquare(arr2, arr3), "should fail as values are not squared of another"),
                ()-> assertTrue(SameArraySquared.naiveSameArrSquare(arr3, arr4), "should pass if values are squared")

        );


    }
    @Test
    public void testFrequencyCounter(){
        assertAll(
                ()-> assertFalse(SameArraySquared.frequencyCounter(arr1, arr3),
                        "When array length are different should return false"),
                ()-> assertFalse(SameArraySquared.frequencyCounter(arr2, arr3), "should fail as values are not squared of another"),
                ()-> assertTrue(SameArraySquared.frequencyCounter(arr3, arr4), "should pass if values are squared")

        );
    }

}
