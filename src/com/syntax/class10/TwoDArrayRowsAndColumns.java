package com.syntax.class10;

public class TwoDArrayRowsAndColumns {

	public static void main(String[] args) {
		
		
		int[][]  values = {{1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}};
		
		for (int i=0; i<values.length; i++) {
			
			for (int num=0; num<values[i].length; num++ ) {
				
				System.out.print(values[i][num]+" ");
			}
			
		}
		
 
	}

}
