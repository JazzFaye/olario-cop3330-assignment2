package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void Valid_Input(){
        App s = new App();
        double actual = s.formula("4");
        int expected = 18;
        assertEquals(expected,actual);
    }
}