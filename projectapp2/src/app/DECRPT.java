/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.math.BigInteger;

/**
 *
 * @author hkawa
 */
public class DECRPT {
    public static String DECypher(String text, String key)
   {
       BigInteger CT;
       byte[] bytetext = text.getBytes();
       BigInteger bigInt= new BigInteger(bytetext);
       BigInteger bigInt2= new BigInteger(key);
       CT =bigInt.divide(bigInt2);
       String mul= new String(CT.toByteArray());
       
       
    return mul;
}
}
