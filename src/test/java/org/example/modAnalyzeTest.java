package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class modAnalyzeTest {



    @Test
    void analyzeHappyExcepMood() {
        modAnalyze happy = new modAnalyze();
        String result = happy.analyzeMood();
        Assertions.assertEquals("HAPPY", result);
    }

}