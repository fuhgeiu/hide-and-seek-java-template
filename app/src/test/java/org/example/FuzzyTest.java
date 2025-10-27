package org.example;

import org.junit.jupiter.api.Test;


public class FuzzyTest {

    @Test
    public void testFuzzyFinder()
    {

        Fuzzy fuzzy1 = new Fuzzy("red");
        Fuzzy fuzzy2 = new Fuzzy("gold");
        Fuzzy fuzzy3 = new Fuzzy("blue");
        Fuzzy fuzzy4 = new Fuzzy("orange");

        assert(fuzzy1.color.equals("red"));
        assert(fuzzy4.color.equals("orange"));
        assert(fuzzy3.color.equals("blue"));
        assert(fuzzy2.color.equals("gold"));
    }
}