package com.marcelocastro.security.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;;
import javax.xml.bind.DatatypeConverter;

public class SHAUtil {


  public static String sha1(String input) {
    String sha1 = null;
    try {
      MessageDigest msdDigest = MessageDigest.getInstance("SHA-1");
      msdDigest.update(input.getBytes("UTF-8"), 0, input.length());
      sha1 = DatatypeConverter.printHexBinary(msdDigest.digest());
    } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    return sha1;
  }
}
