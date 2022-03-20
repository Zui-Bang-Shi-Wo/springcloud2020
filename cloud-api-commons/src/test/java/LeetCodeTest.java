import java.util.Scanner;

public class LeetCodeTest {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            int i = romanToInt(next);
            System.out.println(i);
        }
    }
    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result=0;
        if (s.length()==2) {
            if ((s.startsWith("I") && (s.charAt(1)=='V' || s.charAt(1)=='X')) ||(s.startsWith("X") && (s.charAt(1)=='L' || s.charAt(1)=='C')) ||(s.startsWith("C") && (s.charAt(1)=='C' || s.charAt(1)=='M'))){
                return covert(String.valueOf(s.charAt(1)))-covert(String.valueOf(s.charAt(0)));
            }
        }
        for(int i=0;i<chars.length;i++){
            result+=covert(String.valueOf(chars[i]));
        }
        return result;
    }

    public static int covert(String s) {
        int result = 0;
        switch (s) {
            case "I":
                result= 1;
            break;
            case "V":
                result= 5;
            break;
            case "X":
                result= 10;
            break;
            case "L":
                result= 50;
            break;
            case "C":
                result= 100;
            break;
            case "D":
                result= 500;
            break;
            case "M":
                result= 1000;
            break;
            default:
                System.out.println("无效字符！");
                break;
        }
        return result;
    }
}
