package Sorting;

public class SelectiongSorting {

	public static int[] selectionSort(int []elements){
		for(int i=0; i< elements.length;i++){
			int min = i;
			for(int j=i; j< elements.length;j++){
				if(elements[min] > elements[j]){
					min = j;
				}
			}
			int temp = elements[i];
			elements[i] = elements[min];
			elements[min] = temp;
		}
		return elements;
	}
	
	public static void main(String args[]){
		int elements [] = {3,4,1,2,6,3,-1,0,45,630 };
		elements = selectionSort(elements);
		for(int i =0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
	
}
