package BaseOperation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String str = "Программируем на JAVA";
        char[] symbol = new char[12];
        "Изучаем PASCAL".getChars(0,8,symbol,0);
        str.getChars(str.length() - 4,str.length(),symbol,8);
        System.out.println(symbol);

        for (int i = str.length() - 1; i >= 0 ; i--) {
            System.out.print("|" + str.charAt(i));
        }
        System.out.println();

        byte[] nums;
        nums = "JAVA".getBytes();
        System.out.println(Arrays.toString(nums));
        symbol = "JAVA".toCharArray();
        System.out.println(Arrays.toString(symbol));
    }
}
