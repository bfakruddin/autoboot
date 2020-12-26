package com.utilities;

import org.apache.commons.codec.binary.Base64;

public class Utils {
    /**
     * Method: EncyptPassword
     * @author Baba Fakruddin D (Baba Fakruddin Dudekula)
     * @category Security related
     * @param strOrgPwd as String
     * @return String
     */
    public static String EncyptPassword(String strOrgPwd){
        byte[] encoded = Base64.encodeBase64(strOrgPwd.getBytes());
        return new String(encoded);
    }

    /**
     * Method: DecryptPassword
     * @author Baba Fakruddin D (Baba Fakruddin Dudekula)
     * @category Security related
     * @paraxn encrypted password as String
     * @return byte[]
     * */
    public static byte[] DecryptPassword(String strEncryptPwd) {
        byte[] decoded =Base64.decodeBase64(strEncryptPwd.getBytes());
        return decoded;
    }
}
