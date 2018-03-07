package fpp.lab2;


import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class TestProg6 {

    @Test
    public void testForDuplicate(){

        String[] duplicatesArray = {"horse", "dog", "cat", "horse","dog"};
        String[] expectedResult = { "cat", "horse","dog"};
        assertEquals(expectedResult, Prog6.removeDups(duplicatesArray));
    }


}
