import java.util.Scanner;

public class LengthOfLastWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strs = s.split(" ");
        System.out.println(strs[strs.length-1].length());
    }
}
