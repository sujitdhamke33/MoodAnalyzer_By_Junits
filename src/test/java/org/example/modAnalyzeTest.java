package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class modAnalyzeTest {

    @Test
    void analyzeSadMood() {
        modAnalyze sad = new modAnalyze();
        String result = sad.analyzeMood("I am in the sad Mood");
        Assertions.assertEquals("SAD", result);
    }
    @Test
    void analyzeAnySadMood() {
        modAnalyze sad = new modAnalyze();
        String result = sad.analyzeMood("I am in the any Mood");
        Assertions.assertEquals("HAPPY", result);
    }
}