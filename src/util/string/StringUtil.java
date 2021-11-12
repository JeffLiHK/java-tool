package util.string;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

/**
 * @author Jeff Li, Kong Shuen
 * @description
 *
 * StringUtil.format("Hello", 11, 'c'(opt, default left), '-'(opt, default space))
 * --> "---Hello---"
 *
 * StringUtil.format("Hello", 11, 'r', '<~')
 *  * --> "<~<~<~Hello"
 *
 * @date 2021/9/10 - 22:18
 */

public class StringUtil {

    /**
     * @param str   the original String
     * @param length   the total length of new String
     * @return a length-bit new String that original String place the left, free places will be filled space.
     */
    public static String format(String str, int length){
        return formatBody(str, length, 'l', ' ');
    }

    public static String format(Integer Int, int length){
        String str = Int.toString();
        return formatBody(str, length, 'l', ' ');
    }

    public static String format(Float Float, int length){
        String str = Float.toString();
        return formatBody(str, length, 'l', ' ');
    }

    public static String format(Double Double, int length){
        String str = Double.toString();
        return formatBody(str, length, 'l', ' ');
    }

    public static String format(String str, int length, char direction){
        return formatBody(str, length, direction, ' ');
    }

    public static String format(Integer Int, int length, char direction){
        String str = Int.toString();
        return formatBody(str, length, direction, ' ');
    }

    public static String format(Float Float, int length, char direction){
        String str = Float.toString();
        return formatBody(str, length, direction, ' ');
    }

    public static String format(Double Double, int length, char direction){
        String str = Double.toString();
        return formatBody(str, length, direction, ' ');
    }

    /**
     *
     * @param direction the place where the original String: 'l'-left, 'r'-right, 'c'-centre
     * @param replaceChar the char that will be filled in all free place in the new String
     * @return String
     */
    public static String format(String str, int length, char direction, char replaceChar){
        return formatBody(str, length, direction, replaceChar);
    }

    public static String format(Integer Int, int length, char direction, char replaceChar){
        String str = Int.toString();
        return formatBody(str, length, direction, replaceChar);
    }

    public static String format(Float Float, int length, char direction, char replaceChar){
        String str = Float.toString();
        return formatBody(str, length, direction, replaceChar);
    }

    public static String format(Double Double, int length, char direction, char replaceChar){
        String str = Double.toString();
        return formatBody(str, length, direction, replaceChar);
    }

    /**
     * @param replaceStr the String will be repeated as a circe
     * @return String
     */
    public static String format(String str, int length, char direction, String replaceStr){
        return formatBody(str, length, direction, replaceStr);
    }

    public static String format(Integer Int, int length, char direction, String replaceStr){
        String str = Int.toString();
        return formatBody(str, length, direction, replaceStr);
    }

    public static String format(Float Float, int length, char direction, String replaceStr){
        String str = Float.toString();
        return formatBody(str, length, direction, replaceStr);
    }

    public static String format(Double Double, int length, char direction, String replaceStr){
        String str = Double.toString();
        return formatBody(str, length, direction, replaceStr);
    }

    private static String formatBody(String str, int length, char direction, char replaceChar){
        if (str == null || str.equals(""))
            return repeatStr("", length,direction, String.valueOf(replaceChar));

        char[] c;

        if (length <= str.length()){
            c = str.toCharArray();
            return String.copyValueOf(c, 0, length);
        }

        length -= str.length();

        return repeatStr(str, length, direction, String.valueOf(replaceChar));
    }

    private static String formatBody(String str, int length, char direction, String replaceStr){
        if (str == null) str = "";
        if (length <= str.length()){
            char[] c;
            c = str.toCharArray();
            return String.copyValueOf(c, 0, length);
        }

        length -= str.length();

        return repeatStr(str, length, direction, replaceStr);
//        switch (direction){
//            case 'l':
//                return repeatStr(str, length, 'l', replaceStr);
//            case 'r':
//                return repeatStr(str, length, 'r', replaceStr);
//            case 'c':
//                return repeatStr(str, length, 'c', replaceStr);
//        }
//        return null;

    }

    private static String repeatStr(String str, int count, char direction, String replaceStr){
        String str2 = "";
        int strCount = count / replaceStr.length();
        int charCount = count % replaceStr.length();
        for (int i = 0; i < strCount; i++) {
            str2 = str2.concat(replaceStr);
        }
        for (int i = 0; i < charCount; i++) {
            str2 = str2.concat(String.valueOf(replaceStr.charAt(i)));
        }

        switch (direction){
            case 'l':
                return str.concat(str2);
            case 'r':
                return str2.concat(str);
            case 'c':
                int lengthL;
                int lengthR;
                if (str2.length() % 2 == 0){
                    lengthL = str2.length() / 2;
                    lengthR = lengthL;
                } else {
                    lengthL = str2.length() / 2;
                    lengthR = (str2.length() / 2) + 1;
                }
                char[] c = str2.toCharArray();
                String strL = String.copyValueOf(c, 0, lengthL);
                String strR = String.copyValueOf(c, lengthL, lengthR);
                return strL.concat(str.concat(strR));

        }
        throw new InputMismatchException("The direction parameter only can be a char of 'l' , 'r' or 'c'."  );

    }

    // old version
//    private static String repeatCharL(String str, int count, char replaceChar){
//        String replaceStr = String.valueOf(replaceChar);
//        for (int i = 0; i < count; i++) {
//            str = str.concat(replaceStr);
//        }
//        return str;
//    }
//
//    private static String repeatCharR(String str, int count, char replaceChar){
//        String replaceStr = String.valueOf(replaceChar);
//        String str2 = "";
//        for (int i = 0; i < count; i++) {
//            str2 = str2.concat(replaceStr);
//        }
//        str2 = str2.concat(str);
//        return str2;
//    }
//
//    private static String repeatCharC(String str, int count, char replaceChar){
//        if (count % 2 == 0){
//            return repeatCharR(repeatCharL(str, count/2, replaceChar), count/2, replaceChar);
//        }
//        return repeatCharR(repeatCharL(str, count/2, replaceChar), (count/2) + 1, replaceChar);
//    }
}

