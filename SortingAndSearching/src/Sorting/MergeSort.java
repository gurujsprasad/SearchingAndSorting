package Sorting;

public class MergeSort {

	public static void merge(int []elements, int p, int q, int r){
		
		int n1 = q-p+1;
		int n2 = r-q;
		int [] l1 = null;
		int [] l2 = null;
		for (int i = 0; i< n1 ; i++){
			l1[i] = elements[p+i-1];
		}
		for (int j = 0; j < n2; j++){
			l2[j] = elements[q+j];
		}
		
	}
	
	public static int[] mergeSort(int []elements, int p, int r){
		
		if (p<r){
			int q = (p+r)/2;
			mergeSort(elements, p, q);
			mergeSort(elements,q+1,r);
			merge(elements, p, q, r);
			
		}
		return elements;
	}
	
	public static void main(String args[]){
		int elements [] = {3,4,1,2,6,630,3,-1,0,45};
		elements = mergeSort(elements,0,elements.length);
		for(int i =0; i<elements.length; i++){
			System.out.println(elements[i]);
		}
	}
	
}
