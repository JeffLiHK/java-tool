package util.string;

/**
 * @author Jeff Li, Kong Shuen
 * @version v1.0
 * @create 2/11/2021 - 21:26
 * @description
 */
public class test {     // "    Jeff    "
    public static void main(String[] args) {
        String str = "Jeff";
        str = StringUtil.format(str, 10, 'c', '#');
        System.out.println("-------------");
        System.out.println(str+"");
        System.out.println("-------------");
    }
}
