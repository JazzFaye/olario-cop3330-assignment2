package ex33;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    //I'm not really sure on how to do the test on this one.
    @Test
    void EightBall(){
        App s = new App();
        String actual = s.Magic8Ball();
        String expected = "No.";
        assertEquals(actual, expected);
    }

}