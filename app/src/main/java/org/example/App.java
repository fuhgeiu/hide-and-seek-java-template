package org.example;

import java.util.ArrayList;

public class App {

    public static void main(String args[]) {

        FuzzyListGenerator generator = new FuzzyListGenerator();
        FuzzyFinder finder = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        int testOne = finder.linearSearch(sortedFuzzies);
        int testTwo = finder.binarySearch(sortedFuzzies);

        int testThree = finder.linearSearch(randomFuzzies);
        int testFour = finder.binarySearch(randomFuzzies);


        FuzzyListGenerator generator1 = new FuzzyListGenerator(7000);
        FuzzyFinder finder1 = new FuzzyFinder();

        ArrayList<Fuzzy> sortedFuzzies1 = generator1.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies1 = generator1.randomizedRainbowFuzzies();


        int testFive = finder1.linearSearch(sortedFuzzies1);

        System.out.println("linear search with sorted list  " + testFive);


        int testSix = finder1.binarySearch(sortedFuzzies1);

        System.out.println("binary search with sorted list  " + testSix);


        int testSeven = finder1.linearSearch(randomFuzzies1);

        System.out.println("linear search with random lsit  " + testSeven);


        int testEight = finder1.binarySearch(randomFuzzies1);

        System.out.println("binary search with random list  " + testEight);
    }

}
