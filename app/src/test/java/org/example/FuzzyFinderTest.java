package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyFinderTest {


    @Test
    public void testFuzzyFinder()
    {

        ArrayList<Fuzzy> fuzzies = new ArrayList<>();

            fuzzies.add(new Fuzzy("red"));
            fuzzies.add(new Fuzzy("orange"));
            fuzzies.add(new Fuzzy("yellow"));
            fuzzies.add(new Fuzzy("green"));
            fuzzies.add(new Fuzzy("blue"));
            fuzzies.add(new Fuzzy("indigo"));
            fuzzies.add(new Fuzzy("violet"));

        fuzzies.add(new Fuzzy("gold"));

        Collections.shuffle(fuzzies);

        FuzzyFinder fuzzyFinder = new FuzzyFinder();




        ArrayList<Fuzzy> fuzzies1 = new ArrayList<>();

            fuzzies.add(new Fuzzy("red"));
            fuzzies.add(new Fuzzy("orange"));
            fuzzies.add(new Fuzzy("yellow"));
            fuzzies.add(new Fuzzy("green"));
            fuzzies.add(new Fuzzy("blue"));
            fuzzies.add(new Fuzzy("indigo"));
            fuzzies.add(new Fuzzy("violet"));

        fuzzies.add(new Fuzzy("gold"));

        fuzzies.sort((f1, f2) -> f1.color.compareTo(f2.color));
    }

}