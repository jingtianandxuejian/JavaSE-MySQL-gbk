package com.atguigu.java4;

/*
 * 可变个数的形参
 * 
 * 一 格式：（int ... numbers）;
 * 
 * 二 说明：
 * 	1.可变个数的形参方法与同名但形参列表不同的方法构成重载
 *  2.可变个数的形参方法与同类型数组的参数不构成重载
 *  3.可变形参后不能放其它参数（多个形参列表可变形参必须放在最后），否则编译不通过
 *  4.一个形参列表中只能有一个可变形参
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
   
	
	//可变形参后不能放其它参数（可变形参必须放在最后），否则编译不通过
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
