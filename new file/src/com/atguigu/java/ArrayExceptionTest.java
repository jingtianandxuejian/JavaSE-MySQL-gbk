package com.atguigu.java;

/*
 * 数组常见异常
 * 
 */
public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		//下角标越界:java.lang.ArrayIndexOutOfBoundsException
		int[] numbers = new int[2];
		//System.out.println(numbers[2]);
		
		//空指针:java.lang.NullPointerException
		//例一
		int[] n = new int[2];
		n = null;
		//System.out.println(n[0]);
		
		//例二
		int[][] b = new int[2][];
		System.out.println(b[0]);
		//System.out.println(b[0][0]);
		
		//例三
		String[] s = new String[]{"aa","bb"};
		s[0] = null;
		System.out.println(s[0].toString());
	}
}
