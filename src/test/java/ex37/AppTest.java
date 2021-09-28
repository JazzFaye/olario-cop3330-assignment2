package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void password(){
        App s = new App();
        int length = 8;
        int numbers = 2;
        int chars = 2;
        int letters;
        if (length - numbers - chars > 0){
            letters = length - numbers - chars;
        }
        String actual = s.GeneratePassword(length,numbers,chars);
    }
}