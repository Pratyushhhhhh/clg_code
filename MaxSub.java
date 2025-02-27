import java.util.*;

class MaxSub 
{
    static int maxSubSum(int[] arr) 
	{
        int maxSum = arr[0], currSum = arr[0];
        for (int i = 1; i < arr.length; i++) 
	{
            currSum = Math.max(arr[i], currSum + arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Max Subarray Sum: " + maxSubSum(arr));
    }
}
