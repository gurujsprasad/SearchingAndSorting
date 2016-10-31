package Sorting;

public class BubbleSort {

	public static int[] bubbleSort(int []elements){
		for(int i=0; i< elements.length;i++){			
			for(int j=0; j< elements.length-1-i ;j++){
				if(elements[j] > elements[j+1]){
					int temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
		return elements;
	}
	
	public static void main(String args[]){
		int elements [] = {3,4,1,2,6,3,-1,0,45,630};
		elements = bubbleSort(elements);
		for(int i =0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
}
