import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for(int i=0; i<n; i++){
            digits[i] = sc.nextInt();
        }

        int i;
        for(i=digits.length-1; i >=0 && digits[i] == 9; i--){
            digits[i] = 0;
        }

        if(i == -1){
            digits = new int[digits.length+1];
            digits[i+1] = 1;
            System.out.println(Arrays.toString(digits));
        }else{
            digits[i]++;
            System.out.println(Arrays.toString(digits));
        }
    }
}
