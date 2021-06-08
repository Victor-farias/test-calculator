package com.test;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;


public class MatcherTest {

    @Test
    public void givenCollection_chekIfEmpty() {
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkIsNull() {
        String str = null;
        assertThat(str, Matchers.isEmptyOrNullString());
    }

}
