package com.atguigu.java4;

/*
 * 
 * 方法的重载（overload）
 * 
 * 一 定义:在同一个类中，相同的方法名不同的形参列表构成重载
 * 
 * 二 两同一不同：同一个类和同一个方法名，不同的形参列表(个数，类型)
 * 
 * 三 注意：1.重载与形参列表的变量名无关
 *   	 2.重载与方法的返回值类型无关
 *   	 3.重载与方法的权限修饰符无关
 * 
 * 四 如何确定调用的是哪个方法？方法名 +　形参列表（个数，类型）
 */
public class OverloadTest {

	public static void main(String[] args) {
		
		User u = new User();
		u.add(1,2);
	}
}

//The type User is already defined 在同一个包下已经有相同类名的类了
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
	 * 重载与形参列表的变量名没有关系
	public void add(double b){
		
	}
	*/
	public void add(int a){
		
	}
	
	/*
	 * 重载与方法的返回值类型无关
	public int add(double a){
		return 1;
	}
	*/
	
	/*
	 * 重载与方法的权限修饰符无关
	private void add(double a){
	
	}
	*/
	
	
}
