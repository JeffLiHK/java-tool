package test.util.string;

import org.junit.jupiter.api.Test;
import util.string.StringUtil;

/**
 * @author Jeff Li, Kong Shuen
 * @version v1.0
 * @date 2021/9/12 - 1:11
 * @description
 */
class test1 {

//    void test(){
//        String str = "Welcome";
//        String replaceStr = "~/~";
//        int length = (2) * replaceStr.length() + str.length();
//        System.out.println(StringUtil.format(str, length, 'l', replaceStr));
//        System.out.println(StringUtil.format(str, length, 'r', replaceStr));
//        System.out.println(StringUtil.format(str, length, 'c', replaceStr));
////        System.out.println(StringUtil.format("", 15, 'c', '-'));
////        System.out.println(StringUtil.format(str, 15, 'l', '+'));
////        System.out.println(StringUtil.format(str, 15, 'r', '='));
////        System.out.println(StringUtil.format(str, 15, 'c', '>'));
//    }

    @Test
    void test2() {
        long a = System.currentTimeMillis();
        String str = "Hello World";
        String str2 = StringUtil.format(str, 100000, 'c', " ");
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    @Test
    void test3() {
        long a = System.currentTimeMillis();
        String str = "Hello World";
        String str2 = StringUtil.format(str, 100000, 'c', " ");
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    @Test
    void test4() {
        System.out.println("TESTING");
    }

}
