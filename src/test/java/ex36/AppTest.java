package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void GetAverage(){
        App s = new App();
        List<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("1000");
        num.add("300");

        double expected = s.GetAverage(num);
        double actual = 400;
        assertEquals(expected, actual);
    }
    @Test
    void GetMin(){
        App s = new App();
        List<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("300");
        num.add("1000");

        double expected = s.GetMinimum(num);
        double actual = 100;
        assertEquals(expected,actual);
    }
    @Test
    void GetMax(){
        App s = new App();
        List<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("300");
        num.add("1000");

        double expected = s.GetMaxmimum(num);
        double actual = 1000;
        assertEquals(actual,expected);
    }
    @Test
    void GetSt_dev(){
        App s = new App();
        List<String> num = new ArrayList<>();
        num.add("100");
        num.add("200");
        num.add("300");
        num.add("1000");

        String expected = s.GetSt_dev(num);
        String actual = "The Standard deviation is: 353.55";
        assertEquals(expected, actual);
    }

}