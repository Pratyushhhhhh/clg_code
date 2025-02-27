import java.util.*;

class CountOcc 
{
        static void countOccurrences(int[] arr) 
	{
        int n = arr.length;
        boolean[] visited = new boolean[n];
        System.out.println("Element occurrences:");
        for (int i = 0; i < n; i++) 
	{
            if (visited[i]) continue;
            
            int count = 1;
            for (int j = i + 1; j < n; j++) 
	    {
                if (arr[i] == arr[j]) 
		{
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    	}
	
	static int sLarge(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
        }

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
	countOccurrences(arr1);
	System.out.println("Second Largest: " + sLarge(arr1));
	}
}
	