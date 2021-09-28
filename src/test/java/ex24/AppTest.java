package ex24;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test
    void isAnagram_true() {
        App s = new App();
        boolean actual = s.isAnagram("I am Lord Voldemort", "Tom Marvolo Riddle");
        boolean expected = true;
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void isAnagram_false() {
        App s = new App();
        boolean actual = s.isAnagram("Elvis", "Rock");
        boolean expected = false;
        assertEquals(actual, expected);

    }

}