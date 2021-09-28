package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void very_weak(){
        App s = new App();
        int actual = s.PasswordValidator("12345");
        int expected = 1;
        assertEquals(expected, actual);
    }
    void weak(){
        App s = new App();
        int actual = s.PasswordValidator("ABCDEF");
        int expected = 2;
        assertEquals(expected, actual);
    }
    void strong(){
        App s = new App();
        int actual = s.PasswordValidator("acb123xyz");
        int expected = 3;
        assertEquals(expected, actual);
    }
    void very_strong(){
        App s = new App();
        int actual = s.PasswordValidator("1337h@xor");
        int expected = 4;
        assertEquals(expected,actual);
    }
}