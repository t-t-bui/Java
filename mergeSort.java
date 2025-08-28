import java.util.*;

public class mergesort{
	public static void main(String[] args){
		int [] arry = {10, 3, 5, 2, 6, 7, 4, 8};

		arry = mergeSort(arry);

		for(int i = 0; i < arry.length; i++){
			System.out.println(arry[i]);
		}
	}

	public static int[] mergeSort(int[] array){
		int mid = array.length / 2;
		int [] left = new int[mid];
		int [] right = new int[mid];

		int j = 0;

		if(array.length > 1){
			for(int i = 0; i < mid; i++){
				left[i] = array[i];
			}

			for(int i = mid; i < array.length; i++){
				right[j] = array[i];
				j++;
			}

			mergeSort(left);
			mergeSort(right);

			int l = 0, m = 0, n = 0;
			while(l < left.length && m < right.length){
				if(left[l] <= right[m]){
					array[n] = left[l];
					l++;
				} else {
					array[n] = right[m];
					m++;
				}

				n++;
			}

			while(l < left.length){
				array[n] = left[l];
				l++;
				n++;
			}

			while(m < right.length){
				array[n] = right[m];
				m++;
				n++;
			}
		}

		return array;
	}
}