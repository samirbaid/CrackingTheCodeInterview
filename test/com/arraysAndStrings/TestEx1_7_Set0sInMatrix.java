package com.arraysAndStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEx1_7_Set0sInMatrix {

	@Test
	public void test_givenMatrix_returnAllRowsColumns0() {
		int[][] inputMatrix = {
				{1,0,1},
				{1,1,1},
				{1,1,1}
		};
		
		int[][] outputMatrix = {
				{0,0,0},
				{1,0,1},
				{1,0,1}
		};
		
		Ex1_7_Set0sInMatrix.refactorMatrix(inputMatrix, 3, 3);
		
		assertArrayEquals(outputMatrix,inputMatrix);
		
		
	}
	
	@Test
	public void test_givenIdentityMatrix_returnAllRowsColumns0() {
		int[][] inputMatrix = {
				{1,0,0},
				{0,1,0},
				{0,0,1}
		};
		
		int[][] outputMatrix = {
				{0,0,0},
				{0,0,0},
				{0,0,0}
		};
		
		Ex1_7_Set0sInMatrix.refactorMatrix(inputMatrix, 3, 3);
		
		assertArrayEquals(outputMatrix,inputMatrix);
		
		
	}

}
