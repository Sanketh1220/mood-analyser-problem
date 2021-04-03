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

	@Test
    void givenMessage_WhenItIsNull_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
        System.out.println("This is NULL case.");
    }

	 @Test
    void givenMessage_AsNull_Should_Return_Respective_Message() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e){
            Assertions.assertEquals(MoodAnalysisException.exceptionType.given_null_input, e.type);
        }
    }

    @Test
    void givenMessage_Invalid_Should_Return_Respective_Message() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e){
            Assertions.assertEquals(MoodAnalysisException.exceptionType.getGiven_empty_input, e.type);
        }
    }
}

