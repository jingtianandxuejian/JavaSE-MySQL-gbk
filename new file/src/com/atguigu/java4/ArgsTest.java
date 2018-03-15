package com.atguigu.java4;

/*
 * �ɱ�������β�
 * 
 * һ ��ʽ����int ... numbers��;
 * 
 * �� ˵����
 * 	1.�ɱ�������βη�����ͬ�����β��б�ͬ�ķ�����������
 *  2.�ɱ�������βη�����ͬ��������Ĳ�������������
 *  3.�ɱ��βκ��ܷ���������������β��б�ɱ��βα��������󣩣�������벻ͨ��
 *  4.һ���β��б���ֻ����һ���ɱ��β�
 * 
 */
public class ArgsTest {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.add(new int[]{1,2,3,4,5});
		stu.add(1,2,3,4,5);
	}
}

class Student{
	
	
	public void add(int a,int b){
		System.out.println(a + b);
	}
	
	public void add(int a,int b,int c){
		System.out.println(a + b + c);
	}
	
	/*
    public void add(int[] numbers){
    	int sum = 0;
    	for(int i = 0 ; i < numbers.length ; i++){
    		sum += numbers[i];
    	}
    	System.out.println(sum);
    }
    */
    
	
    public void add(int a,int b,int ... numbers){
    	System.out.println("a=" + a + " b= " + b);
    	int sum = 0;
    	for(int i = 0 ; i < numbers.length ; i++){
    		System.out.println("numbers = " + numbers[i]);
    		sum += numbers[i];
    	}
    	System.out.println(sum);
    }
   
	
	//�ɱ��βκ��ܷ������������ɱ��βα��������󣩣�������벻ͨ��
	/*
	 public void add(int ... numbers,int a,int b){
	    	System.out.println("a=" + a + " b= " + b);
	    	int sum = 0;
	    	for(int i = 0 ; i < numbers.length ; i++){
	    		System.out.println("numbers = " + numbers[i]);
	    		sum += numbers[i];
	    	}
	    	System.out.println(sum);
	    }
	*/
	
	//The variable argument type int of the method add must be the last parameter
	/*
	 public void add(int ... numbers,int ... ){
	    	System.out.println("a=" + a + " b= " + b);
	    	int sum = 0;
	    	for(int i = 0 ; i < numbers.length ; i++){
	    		System.out.println("numbers = " + numbers[i]);
	    		sum += numbers[i];
	    	}
	    	System.out.println(sum);
	    }
	*/
	 public void add(String a,double b,int ... numbers){
	    	System.out.println("a=" + a + " b= " + b);
	    	int sum = 0;
	    	for(int i = 0 ; i < numbers.length ; i++){
	    		System.out.println("numbers = " + numbers[i]);
	    		sum += numbers[i];
	    	}
	    	System.out.println(sum);
	    }
	
}
