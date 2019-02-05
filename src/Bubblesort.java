import java.util.Arrays;

public class Bubblesort {

	static int[] sortbubble(int arr[]) {

		int c=0;

		int n=arr.length;

		for(int i=0;i<n;i++) {

			for(int j=1;j<(n-1);j++) {

					if(arr[j-1]>arr[j]) {

								c=arr[j-1];

								arr[j-1]=arr[j];

								arr[j]=c;

		}

		}

		}

		return arr;

		}

		public static void main(String[] args) {

		// TODO Auto-generated method stub

		int arr[]= {99,10,100,56,5,1,0,120,265};

		System.out.print("Original array\n");

		System.out.print(Arrays.toString(arr));

		System.out.println("\n"+ Arrays.toString((sortbubble(arr))));

		}

		}