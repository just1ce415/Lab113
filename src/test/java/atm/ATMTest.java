package atm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    void process() {
        ATM atm = new ATM();
        boolean excepted = false;
        try{
            atm.process(127);
        } catch (IllegalArgumentException e){
            excepted = true;
        }
        assertTrue(excepted);
    }
}