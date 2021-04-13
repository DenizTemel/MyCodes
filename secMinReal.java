package Week3;

import java.util.Arrays;

/*
 * Writen a code that reports the second smallest "value" in a given sequence.
 */
public class secMinReal {

	public static void main(String[] args) {
		int[] secMin = { 3, 5, 28,28, 9, 22, -5 ,-3, 6, 0};
		int firstmin=0;
		int secondmin=0;
		
		Arrays.sort(secMin);
		//To call arrays we use Arrays.toString(string name) command
		System.out.println(Arrays.toString(secMin));
		firstmin=secMin[0];
		
		for(int i=0;i<secMin.length;i++) {
			if(secMin[i]!=firstmin  ) {
				secondmin=secMin[i];
				//It takes the first unequal element and breaks.(It works because we sorted in the beginning.)
				break;
			}
		}
		System.out.println("Second min is:"+secondmin);

	}

}
