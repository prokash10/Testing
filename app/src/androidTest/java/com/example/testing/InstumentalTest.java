package com.example.testing;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class InstumentalTest {
    @Rule
    public ActivityTestRule<MainActivity> testRule=
            new ActivityTestRule<>(MainActivity.class);
    public String result="10";

    @Test
    public void TestAdd(){
        String stringToBeTyped;
        onView(withId(R.id.etfirst)).perform(typeText("6"));
        onView(withId(R.id.etfirst)).perform(typeText("4"));

        onView(withId(R.id.tvresult)).check(matches(withText(result)));


    }
}
