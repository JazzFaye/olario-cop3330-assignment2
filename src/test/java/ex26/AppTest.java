package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void creditcard(){
        PaymentCalculator s = new PaymentCalculator();
        double actual = s.calculateMonthsUntilPaidOff(5000, 12, 100);
        double expected = 70;
        assertEquals(expected,actual);
    }

}