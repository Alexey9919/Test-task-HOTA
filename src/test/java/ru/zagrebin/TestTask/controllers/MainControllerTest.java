package ru.zagrebin.TestTask.controllers;

import org.junit.jupiter.api.Test;
import ru.zagrebin.TestTask.services.MainService;

import static org.junit.jupiter.api.Assertions.*;

class MainControllerTest {
    private final static String str = "abbcccccd";
    private final static String expected = "\"c\": 5, \"b\": 2, \"a\": 1, \"d\": 1";

    private MainController mainController = new MainController(new MainService());

    @Test
    void shouldGetTheResult() {
        final String actual = mainController.counter(str);

        assertNotNull(actual);
        assertEquals(actual, expected);
    }
}