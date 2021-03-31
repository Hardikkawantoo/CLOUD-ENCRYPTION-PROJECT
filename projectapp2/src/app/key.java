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
public class key {
    public String key1(String a1,String b1, String A1) {
        BigInteger ID = new BigInteger(a1);
        BigInteger publickey = new BigInteger(b1);
        BigInteger Privatekey = new BigInteger(A1);
        BigInteger ka;
         ka=publickey.modPow(Privatekey,ID);
         //ka=b.modPow(A,a);
         //KeyA=kb.modPow(A,a);
         
         String public_ka = ka.toString();
         return public_ka;
    }
}
