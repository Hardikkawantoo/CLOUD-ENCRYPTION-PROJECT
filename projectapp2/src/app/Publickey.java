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
public class Publickey {
   
    public static String Pkey(String a1,String b1, String A1) {
        BigInteger a = new BigInteger(a1);
        BigInteger b = new BigInteger(b1);
        BigInteger A = new BigInteger(A1);
        BigInteger ka;
         ka=b.modPow(A,a);
         String public_ka = ka.toString();
         
         return public_ka;
    }
   
}