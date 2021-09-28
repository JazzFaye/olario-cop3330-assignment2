package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void even_numbers(){
        App s = new App();
        var even = new ArrayList<Integer>();
        even.add(2);
        even.add(4);
        even.add(6);
        even.add(8);
        String actual = s.EvenNumbers(even);
        String expected = "The even numbers are 2 4 6 8";
        assertEquals(expected,actual);
    }

}