package ex31;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void Calculate() {
        App s = new App();
        int actual = s.TargetHeartRate(65,22);
        int expected = 191;
        assertEquals(expected,actual);
    }
}