package com.atguigu.java4;

/*
 * 
 * ���������أ�overload��
 * 
 * һ ����:��ͬһ�����У���ͬ�ķ�������ͬ���β��б�������
 * 
 * �� ��ͬһ��ͬ��ͬһ�����ͬһ������������ͬ���β��б�(����������)
 * 
 * �� ע�⣺1.�������β��б�ı������޹�
 *   	 2.�����뷽���ķ���ֵ�����޹�
 *   	 3.�����뷽����Ȩ�����η��޹�
 * 
 * �� ���ȷ�����õ����ĸ������������� +���β��б����������ͣ�
 */
public class OverloadTest {

	public static void main(String[] args) {
		
		User u = new User();
		u.add(1,2);
	}
}

//The type User is already defined ��ͬһ�������Ѿ�����ͬ����������
class User{
	
	/*
	public void add(int a,int b){
		System.out.println(a + b);
	}
	*/
	
	public void add(double a,double b){
		System.out.println(a + b);
	}
	
	public void add(double a){
		System.out.println(a);
	}
	/*
	 * �������β��б�ı�����û�й�ϵ
	public void add(double b){
		
	}
	*/
	public void add(int a){
		
	}
	
	/*
	 * �����뷽���ķ���ֵ�����޹�
	public int add(double a){
		return 1;
	}
	*/
	
	/*
	 * �����뷽����Ȩ�����η��޹�
	private void add(double a){
	
	}
	*/
	
	
}
