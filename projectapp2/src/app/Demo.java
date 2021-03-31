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
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class  Demo{
  public static void main(String[] argv) throws Exception {
    // Generate a 1024-bit Digital Signature Algorithm (DSA) key pair
    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
    keyGen.initialize(1024);
    KeyPair keypair = keyGen.genKeyPair();
    PrivateKey privateKey = keypair.getPrivate();
    System.out.println(privateKey);
    PublicKey publicKey = keypair.getPublic();
    System.out.println(publicKey);
    
    
  }
}