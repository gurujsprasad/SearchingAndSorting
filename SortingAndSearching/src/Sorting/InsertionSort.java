package Sorting;

public class InsertionSort {
	public static int[] insertionSort(int []elements){
		if(elements.length == 1)
			return elements;
		else{
			for(int i = 1; i < elements.length; i++){
				int key = elements[i];
				int j = i-1;
				while(j>=0 && elements[j] > key){
					elements[j+1] = elements[j];
					j = j-1;
				}
				elements[j+1] = key;
			}
		}
		return elements;
	}
	
	public static void main(String args[]){
		int elements [] = {3,4,1,2,6,630,3,-1,0,45};
		elements = insertionSort(elements);
		for(int i =0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
}
