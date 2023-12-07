package ru.zagrebin.TestTask.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainServiceTest {

    private final static String str = "abbcccccd";
    private final static String expected = "\"c\": 5, \"b\": 2, \"a\": 1, \"d\": 1";

    private MainService mainService = new MainService();

    @Test
    void counterSymbols() {
        final String actual = mainService.counterSymbols(str);

        assertNotNull(actual);
        assertEquals(actual, expected);
    }
}