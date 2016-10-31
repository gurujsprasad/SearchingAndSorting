package Sorting;

public class InsertionSort {
	public static int[] insertionSort(int []elements){
		if(elements.length == 1)
			return elements;
		else{
			int key = elements[0];
			for(int i = 1; i < elements.length; i++){
				
			}
		}
		return elements;
	}
	
	public static void main(String args[]){
		int elements [] = {3,4,1,2,6,3,-1,0,45,630};
		elements = insertionSort(elements);
		for(int i =0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
}
