import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println(foo(str));
        
        sc.close();
    }

    public static boolean foo(String str) {
        int len = str.length();
        for (int i = 0; i < len; i++)
            if (str.charAt(i) != str.charAt(len - i - 1)) return false;
        return true;
    }
}