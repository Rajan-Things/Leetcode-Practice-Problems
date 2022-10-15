import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[i] != nums[j]){
                nums[++i] = nums[j];
            }
        }
        System.out.println(Arrays.toString(nums)+" "+(i+1));

        sc.close();
    }
}
