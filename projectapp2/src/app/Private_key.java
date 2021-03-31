/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author hkawa
 */
import java.math.BigInteger;
import java.util.Random;
public class Private_key {
    
    static String Pkey() {
        Random rand = new Random();
        BigInteger result = new BigInteger(44,rand); 
        String result_String = result.toString(); 
        return result_String;
    }
    
}
