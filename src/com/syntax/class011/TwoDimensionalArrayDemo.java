package com.syntax.class011;

public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		
		// new char[how many rows][how many columns];
		
		char[][] $array= new char[3][4]; //instead of $ we can use _ too
		
		//add values to first row
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		
		//2nd row
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		
		//3rd row
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='E';
		$array[2][3]='R';
		
		System.out.println($array[1][3]);//I would like to print 'Z'
		
		System.out.println("--------------Another way to create a 2D Array--------------------");
		
		int [][] array= {
				{10,20,30},
				{1,2,3},
				{100,200,300}	
				
		};
		
		System.out.println(array[2][1]);//200
		System.out.println(array[0][0]);//10
		System.out.println("The size of array of integers = "+array.length);
		
		for (int i = 0; i < $array.length; i++) {
			for (int j = 0; j < $array[i].length; j++) {
				System.out.print($array[i][j]);
			}
			System.out.println();
		}
		

	}

}
