import java.util.*;

public class insertionSort{
	public static void main(String[] args){
		int[] arrays = {16, 3, 7, 4, 11,10};

		arrays = insertion(arrays);

		for(int num: arrays){
			System.out.println(num);
		}
	}

	public static int[] insertion(int[] arrays){
		int key, j;

		for(int i = 1; i < arrays.length; i++){
			key = arrays[i];
			j = i-1;

			while(j >= 0 && arrays[j] > key){
				arrays[j+1] = arrays[j];
				j--;
			}

			arrays[j+1] = key;
		}

		return arrays;
	}
}