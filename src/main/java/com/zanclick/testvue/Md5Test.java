package com.zanclick.testvue;


import com.google.common.base.Preconditions;
import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

public class Md5Test {
    public static String generateSalt(){
        return generateSalt(8);
    }

    public static String generateSalt(int numBytes){
        Preconditions.checkArgument(numBytes > 0, "numBytes argument must be a positive integer (1 or larger)", (long)numBytes);
        Random ranGen = new SecureRandom();
        byte[] aesKey = new byte[numBytes];
        ranGen.nextBytes(aesKey);
        return encodeHex(aesKey);
    }
    public static String encodeHex(byte[] input) {
        return Hex.encodeHexString(input);

    }
    public  static String  Md5(String text) throws Exception {
        byte[] bytes=(text).getBytes("UTF-8");
        MessageDigest messageDigest=MessageDigest.getInstance("MD5");
        messageDigest.update(bytes);
        bytes=messageDigest.digest();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            if ((bytes[i] & 0xff) < 0x10) {
                sb.append("0");
            }
            sb.append(Long.toString(bytes[i] & 0xff, 16));
        }
        return sb.toString().toLowerCase();
    }
    public static void main(String[] args)  {

        try {
            System.out.println( Md5("admin"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
