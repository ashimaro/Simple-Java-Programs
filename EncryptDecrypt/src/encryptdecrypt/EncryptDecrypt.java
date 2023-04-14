/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryptdecrypt;

/**
 *
 * @author User
 */
public class EncryptDecrypt {

     static class Lcg {

        private final long modulus;
        private final int multiplier;
        private final int increment;
        private long seed;

        public Lcg(long modulus, int multiplier, int increment, long seed) {
            this.modulus = modulus;
            this.multiplier = multiplier;
            this.increment = increment;
            this.seed = seed;
        }

        public long next() {
            // Y = (a.X + c) mod m
            long val = (multiplier * seed) + increment;
            seed = val % modulus;
            return seed;
        }
    }

    public static void main(String[] args) {
    }

    public static String encrypt(String plainText) throws Exception {
        Lcg lcg = new Lcg(256, 11, 1, 0);
        byte[] bytes = plainText.getBytes("UTF-8");
        int len = bytes.length;
        byte[] xors = new byte[len];
        for (int ix = 0; ix < len; ix += 1) {
            xors[ix] = (byte) ((int) bytes[ix] ^ ((int) lcg.next()));
        }
        return new String(java.util.Base64.getEncoder().encode(xors), "UTF-8");
    }

    public static String decrypt(String base64EncodedValue) throws Exception {
        Lcg lcg = new Lcg(256, 11, 1, 0);
        
        // Decode the input base64-encoded string to obtain the encrypted bytes
        byte[] encryptedBytes = java.util.Base64.getDecoder().decode(base64EncodedValue.getBytes("UTF-8"));
        int len = encryptedBytes.length;
        
        // Create an array of the same length to hold the decrypted bytes
        byte[] decryptedBytes = new byte[len];
        for (int ix = 0; ix < len; ix += 1) {
            decryptedBytes[ix] = (byte) ((int) encryptedBytes[ix] ^ ((int) lcg.next()));
        }
        return new String(decryptedBytes, "UTF-8");
    }

}
