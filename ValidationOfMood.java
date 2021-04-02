package com.moodanalysertest;

import com.moodanalyser.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidationOfMood {
    @Test
    void givenMessage_WhenSad_ShouldRetunSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenSad_ShouldRetunHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}

