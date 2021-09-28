package ex39;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void sort(){
            int row = 0;
            List<Map<String,String>> records;
            records = App.Emp_records();
            String actual = App.GetTitles(records, row);
            String expected ="Jacquelyn   \t\t| Jackson  \t\t\t| DBA   \t\t\t|\n";
            assertEquals(expected,actual);
    }

}