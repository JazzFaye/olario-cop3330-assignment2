package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void No_Errors(){

        App s = new App();
        String actual = s.validateInput("Jazz", "Faye","90000","PH-9000" );
        String expected = "There were no errors found.";
        assertEquals(expected,actual);
    }
   @Test
    void Invalid_Names(){
        App s = new App();
        String actual = s.validateInput("J", "F", "90000", "PH-9000");
        String expected = "The first name must be at least 2 characters long.\n"
                        + "The last name must be at least 2 characters long.\n";
        assertEquals(expected, actual);
   }
   @Test
    void Invalid_ZIP(){
        App s = new App();
        String actual = s.validateInput("Jazz", "Faye", "ABCDE","PH-9000");
        String expected = "The zipcode must be 5 digits long.\n";
        assertEquals(expected, actual);
   }
   @Test
    void Invalid_ID(){
        App s = new App();
        String actual = s.validateInput("Jazz","Faye","90000","P9-9000");
        String expected = "The employee ID must be in the format of AA-1234.\n";
        assertEquals(expected,actual);
   }
   @Test
    void Names_Empty(){
        App s = new App();
        String actual = s.validateInput("", "", "90000","PH-9000");
        String expected = "The first name must be at least 2 characters long.\n" + "The first name must be filled in.\n" +
                          "The last name must be at least 2 characters long.\n" + "The last name must be filled in.\n";
        assertEquals(expected, actual);
   }

}

