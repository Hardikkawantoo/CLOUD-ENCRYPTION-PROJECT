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
public class cypher {
    static String messageEN(int key, String str){
    char[] chars = str.toCharArray();
    char[] chars1 = new char[chars.length];
    char c;
    for(int i=0;i<chars.length;i++)
    {
        c=chars[i];
        c += key;
        chars1[i]=c;
    }
       String crypttext = new String(chars1);
       return(crypttext);
}
    
    static String messageDE(int key, String str){
    char[] chars = str.toCharArray();
    char[] chars1 = new char[chars.length];
    char c;
    for(int i=0;i<chars.length;i++)
    {
        c=chars[i];
        c -= key;
        chars1[i]=c;
    }
       String crypttext = new String(chars1);
       return(crypttext);
}
}
