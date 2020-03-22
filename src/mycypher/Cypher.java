/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycypher;

import java.util.HashMap;

/**
 *
 * @author SaltO
 */
public class Cypher {
    
    // A simple cypher program that takes a string and encrypts/decrypts it.
   
    
     // <Alphabet Value, Cypher Value>
    private HashMap<Character, Character> encryptMap = new HashMap();
    // <Cypher Value, Alphabet Value>
    private HashMap<Character, Character> decryptMap = new HashMap();
    // 26 letters. It is important that alphabet and cypherValues have same length. 
    // Better solution can be made.
    private char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char[] cypherValues = "øælkjhgfdsaqwertyuiopåzxcv".toCharArray();
    
    
    Cypher() {
        // Fills up the HashMap with key, value pairs that represent the cypher values. 
        // Used to encrypt and decrypt. 
      fillEncryptMap();
      fillDecryptMap();
    }
    
   // Fills the HashMap with alphabet and cypher values as key, value pair.
    private void fillEncryptMap() {
         for (int i = 0; i < alphabet.length - 1; i++) {
           encryptMap.put(alphabet[i], cypherValues[i]);
        }
         
         
        
    }
     // Fills the HashMap with cypher and alphabet values as key, value pair.
    private void fillDecryptMap() {
        for (int i = 0; i < alphabet.length - 1; i++) {
            decryptMap.put(cypherValues[i], alphabet[i]);
        }
         
    }
    
    public String encrypt(String normalText) {
        char[] inputArray = normalText.toLowerCase().toCharArray();
        String textEncrypted = "";
        for(char input : inputArray) {
            // If a character is not part of the HashMap(The values that are available for encryption), then we just add it without encryption.
            if(encryptMap.get(input) == null) {
                textEncrypted += input;
            } else {
            textEncrypted += encryptMap.get(input);
            }
        }
        return textEncrypted.toUpperCase();
    }
    
    public String decrypt(String encryptedText) {
        char[] inputArray = encryptedText.toLowerCase().toCharArray();
        String textDecrypted = "";
        for(char input : inputArray) {
            // If a character is not part of the HashMap(The values that are available for encryption), then we just add it without encryption.
            if(decryptMap.get(input) == null) {
                textDecrypted += input;
            } else {
            textDecrypted += decryptMap.get(input);
        }
        }
        return textDecrypted.toUpperCase();
    }
    
    // Used to validate if character the user input is part of the valid encryption values.
    
    
    
    
 
    
  
    
}
