package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void Add() {
        App s = new App();
        String actual  = s.result(5);
        String expected = "The total is 5";
        assertEquals(expected,actual);

    }

}