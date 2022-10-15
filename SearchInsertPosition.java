import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int mid = 0;
        boolean flag = false;
        int st = 0;
        int en = nums.length - 1;
        while(st <= en){
            mid = (st+en)/2;

            if(nums[mid] == target){
                flag = true;
                break;
            }else if(nums[mid] > target){
                en = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        if(flag){
            System.out.println(mid);
        }else{
            System.out.println(en+1);
        }
    }
}
