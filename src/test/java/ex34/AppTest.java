package ex34;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void Employee(){
        App s = new App();
        ArrayList<String> Emp_name = new ArrayList<String>();
        Emp_name.add("John Smith");
        Emp_name.add("Jackie Jackson");
        Emp_name.add("Chris Jones");

        String actual = s.Emp_list(Emp_name);
        String expected = "\nThere are 3 employees:\nJohn Smith\nJackie Jackson\nChris Jones\n";
        assertEquals(expected,actual);
    }
}