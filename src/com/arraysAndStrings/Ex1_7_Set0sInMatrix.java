package com.arraysAndStrings;

import java.util.ArrayList;
import java.util.List;

public class Ex1_7_Set0sInMatrix {

	public static void refactorMatrix(int[][] matrix, int rows, int cols) {
		
		List<Integer> zeroRowArr = new ArrayList<>();
		List<Integer> zeroColArr = new ArrayList<>();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(matrix[i][j] == 0) {
					
					zeroRowArr.add(i);
					zeroColArr.add(j);
				}
			}
		}
		
		for(Integer rowIndex : zeroRowArr) {
			matrix[rowIndex] = new int[cols];
		}
		
		for(Integer colIndex : zeroColArr) {
			for(int i=0;i<rows;i++) {
				matrix[i][colIndex]=0;
			}
		}
	}
	
	public static void main(String args[]) {
		
		int[][] matrix1 = {
				{1,0,1},
				{1,1,1},
				{1,1,1}
		};
		
		int[][] matrix2 = {
				{1,0,1},
				{0,1,1},
				{1,1,1}
		};
		
		refactorMatrix(matrix1, 3, 3);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		refactorMatrix(matrix2, 3, 3);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}


