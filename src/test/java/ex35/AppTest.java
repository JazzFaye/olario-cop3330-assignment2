package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void winner(){
        App s = new App();
        List<String> names = new ArrayList<>();
        names.add("Jazz");
        names.add("Jassen");
        names.add("Jet");

        String expected = String.format("The winner is... %s.", "Jazz");
        String actual = s.Winner(names);
        assertEquals(expected,actual);
    }

}