package org.example;

import java.util.ArrayList;


public class FuzzyFinder {


    FuzzyFinder () {}

    public int linearSearch (ArrayList<Fuzzy> ListToBeSearched) {

        for (int i = 0; i < ListToBeSearched.size(); i++) {

            if (ListToBeSearched.get(i).color == "gold") {return i;}
            if (ListToBeSearched.get(i).color == "Gold") {return i;}
        }

        return -1;
    }

    public int binarySearch (ArrayList<Fuzzy> ListToBeSorted) {

        int low = 0;
        int high = ListToBeSorted.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            Fuzzy midFuzzy = ListToBeSorted.get(mid);

            int comparison = midFuzzy.color.compareToIgnoreCase("gold");

            if (comparison == 0) {return mid;}
            else if (comparison < 0) {low = mid + 1;}
            else {high = mid - 1;}
        }

        return -1;
    }

}