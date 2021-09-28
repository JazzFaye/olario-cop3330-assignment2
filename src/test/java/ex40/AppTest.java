package ex40;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void filter(){
        List<Map<String,String>> list;
        list =App.Emp_records();
        int row = 0;
        String search = "jac";
        String actual = App.GetTitles(list, row, search);
        String expected = "Jacquelyn   \t\t| Jackson  \t\t\t| DBA   \t\t\t|\n";
        assertEquals(expected, actual);
    }

}