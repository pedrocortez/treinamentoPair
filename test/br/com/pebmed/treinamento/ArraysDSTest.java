package br.com.pebmed.treinamento;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysDSTest {

	@Test
	public void reverseSample() {
		int[] test = new int[]{1,2,3,4};
		ArraysDS ds = new ArraysDS();
		int[] reverseArray = ds.reverseArray(test);
		
		assertArrayEquals(new int[]{4,3,2,1}, reverseArray);
		
	}

}
