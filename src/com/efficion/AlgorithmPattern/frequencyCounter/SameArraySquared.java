package com.efficion.AlgorithmPattern.frequencyCounter;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Write a function called same, which accepts two arrays.
 * The function should return trye if every value in the array has its corresponding value
 * squared in the second array. The frequency of values must be the same
 * e.g sameArraySquared(int[1,3,2], int[1,9,4]) should return true
 * sameArraySquared(int[2,2,3], int[4,3,9]) should return false
 * sameArraySquared(int[1,2], int[1,4,9]) should return false
 *
 * Loop over the first array and compare the square of the current value to the element in the second array
 * if element in the second array is a sqaure, remove it and move on
 * if it cannot be found return false earl
 * return true at the end
 * */
public class SameArraySquared {
    public static boolean naiveSameArrSquare(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr2.size() != arr1.size()) return false;

        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                int value = arr1.get(i);
                int squared = value * value;
                int valueTwo = arr2.get(j);
                if (squared == valueTwo) {
                    arr2.remove(j);
                    break;
                }
                return false;
            }
        }
        return arr2.size() == 0;
    }

    ;
private static Integer squared(Integer a, Integer b){
    return a*b;
}
    public static boolean frequencyCounter(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.size() != arr2.size()) return false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer value : arr1) {
            var square = squared(value, value);
            if (map.containsKey(square)) {
                var newValue = map.get(square) + 1;
                map.put(square, newValue);
            } else {
                map.put(square, 1);
            }

        }

        for (int value : arr1) {
            var square = squared(value, value);
            if (!map.containsKey(square)) return false;
            var updatedValue = map.get(square) -1;
            if(updatedValue < 0) return false;
        }

        return true;
    }
}
