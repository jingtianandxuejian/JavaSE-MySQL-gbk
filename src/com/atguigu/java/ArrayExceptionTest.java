package com.atguigu.java;

/*
 * ���鳣���쳣
 * 
 */
public class ArrayExceptionTest {

	public static void main(String[] args) {
		
		//�½Ǳ�Խ��:java.lang.ArrayIndexOutOfBoundsException
		int[] numbers = new int[2];
		//System.out.println(numbers[2]);
		
		//��ָ��:java.lang.NullPointerException
		//��һ
		int[] n = new int[2];
		n = null;
		//System.out.println(n[0]);
		
		//����
		int[][] b = new int[2][];
		System.out.println(b[0]);
		//System.out.println(b[0][0]);
		
		//����
		String[] s = new String[]{"aa","bb"};
		s[0] = null;
		System.out.println(s[0].toString());
	}
}
