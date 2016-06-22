import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by user on 6/22/16.
 */
public class Exercise06 {
    public static void main(String[] args) {
        int num = 12345;
//        String numStr = String.valueOf(num);
//        int length = numStr.length();
//        char[] numArray = new char[6];
//        numArray = numStr.toCharArray();
//        int i = 0;
//        int n = 4;
//        for (char numChar:numArray)
//             {
//
//            char thischar = numArray[0];
//                 numArray[6] = thischar;
//             ch
//        }
        char[] chars = String.valueOf(num).toCharArray();
        char[] reverseChars = new char[chars.length];

        int n = chars.length - 1;
        for (char c : chars) {
            reverseChars[n] = c;
            n--;
        }

        String reverseStr = String.valueOf(reverseChars);
        int reverseNum = Integer.valueOf(reverseStr);
        System.out.println(reverseNum);
    }


    public static void viaStringBuilder(int num) {
        StringBuilder s = new StringBuilder(String.valueOf(num));
        int reverseNum = Integer.valueOf(s.reverse().toString());
        System.out.println(reverseNum);
    }

    public static void solveViaMath(int num){
        int reverseNum = 0;
        while (num != 0){
            reverseNum = reverseNum*10;
            reverseNum = reverseNum + num % 10;
            num = num /10;
        }
        System.out.println(reverseNum);
    }

}
