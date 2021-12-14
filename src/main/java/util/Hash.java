package util;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

public class Hash {

    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : array) {
                sb.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 10);
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            e.getMessage();
        }
        return null;
    }

    public static String argon2Hash(String password) {
        Argon2 argon2= Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        System.out.println(argon2.hash(1,1024,1,password));
        return argon2.hash(1,1024,1,password);
    }

    public static boolean argon2Verify(String password1,String password2) {
        Argon2 argon2= Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argon2.verify(password1,password2);
    }
}
