package my.util;
import java.util.*;
public class Common{
	//int型配列をシャッフルするメソッド
	public static void arrShuffle(int[] arr){
		for(int i=0;i<arr.length-1;i++){
				int index = new Random().nextInt(arr.length-i);
				int temp = arr[index];
				arr[index] = arr[arr.length-1-i];
				arr[arr.length-1-i] = temp;
		}
	}

	public static int[] arrClone(int[] arr){
		int[] cloneArr = new int[arr.length];
		for(int i=0;i<cloneArr.length;i++){
			cloneArr[i] = arr[i];
		}
		return cloneArr;
	}


	public static void arrSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void arrSort(int[] arr,boolean isDesc){
		if(isDesc){
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i] < arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static int[] arrRandomRange(int min, int max, int count){
		int[] arrRandom = new int[count];
		for(int i=0;i<arrRandom.length;i++){
			arrRandom[i] = new Random().nextInt(max)-min;
		}
		return arrRandom;
	}
}
