import java.util.*;

class MostOcc 
{
	static int mostFreq(int[] arr) 
	{
        int n = arr.length;
        int maxC = 0, maxE = arr[0];

        for (int i = 0; i < n; i++) 
	{
            int c = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) c++;
            }
            if (c > maxC) {
                maxC = c;
                maxE = arr[i];
            }
        }
        return maxE;
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
	System.out.println("Most Frequent Element: " + mostFreq(arr1));
	}
}
