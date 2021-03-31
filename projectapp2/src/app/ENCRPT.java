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
import java.lang.*;
import java.math.BigInteger;
public class ENCRPT {
   public static String Cypher(String text, String key)
   {
       BigInteger CT,CB;
       byte[] bytetext = text.getBytes();
       BigInteger bigInt= new BigInteger(bytetext);
       BigInteger bigInt2= new BigInteger(key);
       CT =bigInt.multiply(bigInt2);
       
       

       String mul= CT.toString();
       return mul;
      
}
   
}
