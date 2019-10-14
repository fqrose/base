package basicDataType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String[] args) {



//        String s1 = "a";
//        String s2 = "a";
//
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//
//        String s3 = new String("b");
//        String s4 = new String("b");
//        System.out.println(s3==s4);
//        System.out.println(s3.equals(s4));

        System.out.println(lineToHump("tax_user_name"));

    }

    public static String lineToHump(String str) {
        Pattern linePattern = Pattern.compile("_(\\w)");
        str = str.toLowerCase();
        Matcher matcher = linePattern.matcher(str);
        StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }



}
