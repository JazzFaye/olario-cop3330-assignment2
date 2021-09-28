package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void Test(){
        App s = new App();
        int i = 12;
        int j = 12;
        String actual = String.format("%5d",i * j);
        String expected = s.Output(i,j);
        assertEquals(expected,actual);
    }
}