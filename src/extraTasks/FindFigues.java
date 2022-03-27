package extraTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This class solves the following task:
 * among givenints it looks for a pair of ints that in summ will give a certain int k
 * several methods will be proposed (original task ref is JtMuXmmDl9s)
 * @author evgeny
 *
 */
public class FindFigues {
public static void main(String[] args) {
System.out.println("\n\n*********************************\n\n\tMethod1:ForCycle");
System.out.println("\n*********************************\n");

	int[] arr1 = {-3,0,1,3,4};
	int[] arr2 = {-3,0,2,4,5};
	
	
	int[] seq1=FindPairM1(arr2,6);
	for (int elem: seq1) {
		System.out.println(elem);
	}
	
	System.out.println("\n\n*********************************\n\n\tMethod2:HashSets");
	System.out.println("\n*********************************\n");
	int[] seq2=FindPairM2HashSet(arr2,6);
	for (int elem: seq2) {
		System.out.println(elem);
	}
	
	System.out.println("\n\n*********************************\n\n\tMethod3:BinarySearch");
	System.out.println("\n*********************************\n");
	int[] seq3=FindPairM3BinnarySearch(arr2,6);
	for (int elem: seq3) {
		System.out.println(elem);
	}
	
	
	System.out.println("\n\n*********************************\n\n\tMethod4:PointerSearch");
	System.out.println("\n*********************************\n");
	int[] seq4=FindPairM4PointerSearch(arr2,6);
	for (int elem: seq4) {
		System.out.println(elem);
	}
	
	
}

/**
 * This class work is O(n**2);
 * Memory is 0(1)
 * @param figures
 * @param k
 * @return
 */
public static int[] FindPairM1(int[] figures, int k){
	


	 for (int i =0; i<figures.length;i++) {
		 for (int j=i+1;j<figures.length;j++) {
			 if(figures[i]+figures[j]==k) {
				 
				 return new int[] {figures[i],figures[j]};
			 }
		 }
	}
	 
	/* backwards iteration
	 for (int i =figures.length-1; i>=0;i--) {
		 for (int j=i-1;j>=0;j--) {
			 if(figures[i]+figures[j]==k) {
				 
				 return new int[] {figures[i],figures[j]};
			 }
		 }
	}
	*/
	 
	 
	 return new int[0];
	
	
}

/**
 * HashSet method checks if set contains numbers that in sum with an i number of a given array
 * of integers it will give the desired int k, for this we check if equals to k-number is already in a set
 * and  if it is we put this number to a set and then return this k-number and number
 * 
 * WorkTieme is O(n)
 * Memory is O(n);
 * @param figures
 * @param k
 * @return
 */
public static int[] FindPairM2HashSet(int[] figures, int k) {
	Set<Integer> checkSet = new HashSet<>();
	
	for (int i=0;i<figures.length;i++) {
		int numberToFind=k-figures[i];
	if (checkSet.contains(numberToFind)) {
		
		return new int[] {numberToFind, figures[i]};
		
	} 
	checkSet.add(figures[i]);
		
	}

	System.out.println(checkSet.toString());
	
	return new int[0];
}

/**
 * this is a binary search method: we suppose that our array is sorted, 
 * then we take our first figure and looking a pair for it,
 * 
 * its pair should be found in between the smallest and the biggest of the array and we apply this logic to every figure of the array
 * in a binary algorithm we divide on 2 the area of search
 * WorkTime = O(n Log(n)
 * Memory O(1)
 * 
 * @param figures
 * @param k
 * @return
 */
public static int[] FindPairM3BinnarySearch(int[] figures, int k) {
	
	
	
	for(int i=0;i<figures.length;i++) {
		
		int numberToFind = k - figures[i];
		int l = i+1, r=figures.length-1; //l - left border of our search field, r - right border of our search field
		
		while(l<=r) { //while htere is at least one element in our array
			int mid=l+(r-l)/2;
			if (figures[mid] == numberToFind) {
				return new int[] {figures[i],figures[mid]};
			};
			if (numberToFind<figures[mid]) {
				r=mid-1; // if the int we are looking for is smaller than figures[mid] we push our right border to the left
						// otherwise we push left border a step to the right
			}else {
				l=mid+1; 
			}
		}
	}
	return new int[0];
	
}

/**
 * Pointer search
 * 
 * WorkTime = O(n)
 * Memory = O(1)
 * @param figures
 * @param k
 * @return
 */

public static int[] FindPairM4PointerSearch(int[] figures, int k) {
	
	int l= 0,r=figures.length-1;
	
	while(l<r){
		int sum = figures[l]+figures[r];
		if(sum==k)
		return new int[] {figures[l],figures[r]};		
		if(sum<k) {
			l++;
		}
		else
		{
			r--;
		}
			
	}
	
	return new int[] {figures[l],figures[r]}; // returns the somm which is max proche to k
	
}

}
