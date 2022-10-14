import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String[] strs = new String[n];
        for(int i=0; i<n; i++){
            strs[i] = sc1.nextLine();
        }
        String ans = "";
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[n-1];
        for(int i=0; i<f.length(); i++){
            if(f.charAt(i) != l.charAt(i)){
                break;
            }
            ans += f.charAt(i);
        }
        System.out.println(ans);
    }
}
