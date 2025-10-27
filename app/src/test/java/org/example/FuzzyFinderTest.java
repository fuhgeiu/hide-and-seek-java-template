package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class FuzzyFinderTest {


    @Test
    public void testFuzzyFinder()
    {

        // unsorted
        ArrayList<Fuzzy> fuzzies = new ArrayList<>();

            fuzzies.add(new Fuzzy("red"));
            fuzzies.add(new Fuzzy("orange"));
            fuzzies.add(new Fuzzy("yellow"));
            fuzzies.add(new Fuzzy("green"));
            fuzzies.add(new Fuzzy("blue"));
            fuzzies.add(new Fuzzy("indigo"));
            fuzzies.add(new Fuzzy("violet"));

        Collections.shuffle(fuzzies);

        fuzzies.add(new Fuzzy("gold"));

        FuzzyFinder fuzzyFinder = new FuzzyFinder();

        assertEquals(fuzzyFinder.linearSearch(fuzzies),7);


        // sorted
        ArrayList<Fuzzy> fuzzies1 = new ArrayList<>();

            fuzzies1.add(new Fuzzy("red"));
            fuzzies1.add(new Fuzzy("orange"));
            fuzzies1.add(new Fuzzy("yellow"));
            fuzzies1.add(new Fuzzy("green"));
            fuzzies1.add(new Fuzzy("blue"));
            fuzzies1.add(new Fuzzy("indigo"));
            fuzzies1.add(new Fuzzy("violet"));

        fuzzies1.add(new Fuzzy("gold"));

        fuzzies1.sort((f1, f2) -> f1.color.compareTo(f2.color));

        assertEquals(fuzzyFinder.linearSearch(fuzzies1), 1);
    }

}