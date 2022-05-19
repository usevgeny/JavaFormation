package CodingGames;
import java.util.*;
// this code is checking whether an array of ints contains ro not a K integer
public class BinaryS {
static boolean exists(int[] ints,int k) throws Exception {
	
	if(ints.length==0) {
		throw new Exception("an array must not be null");
		
	}
	Arrays.sort(ints);
	Arrays.binarySearch(ints, k);
	if(Arrays.binarySearch(ints, k)>0) {
		
		return true;
	}
	
	return false;
}

	public static void main(String[] args) throws Exception {
		
		
		BinaryS c = new BinaryS();
		int[] sample = {12,6,89,8,7,15};
		//c.exists(sample, 0);
		
		System.out.println(c.exists(sample, 15)?("Number exists"):("Number does not exist"));
	}



}
