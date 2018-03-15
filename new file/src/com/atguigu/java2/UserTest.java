package com.atguigu.java2;

/*
 * 
 * 一 面向对象的落地实现
 *   1.创建相应的java类，提供必要的属性和方法
 *   2.创建类的对象
 *   3.调用对象中的属性或调用对象中的方法（对象.属性  对象.方法）
 * 
 *  结论：
 *  	1.创建一个类的多个对象，每个对象中都拥有各自的属性和方法，两个对象之间互不影响。
 *        比如说给第一个对象中的属性的年纪设置一个值，不会影响到第二个对象中的属性的年纪值
 *      2.对象在内存中的解析
 *      3.匿名对象：只能用一次，一般情况下我们在形参里边调用
 */
public class UserTest {

	public static void main(String[] args) {
		
		//创建对象 = 创建类的实例 = 类的实例化
		User u = new User(); //创建什么类型的对象，就用什么类型来接收
		u.say(); //调用对象中的方法
		u.age = 10; //调用对象中的属性
		u.name = "女班长";
		//int age = u.age;
		System.out.println(u.age);
		System.out.println(u.name);
		
		//-------------------------------
		User u2 = new User();
		u2.age = 20;
		u2.name = "男班长";
		System.out.println(u2.age);
		System.out.println(u2.name);
		
		//------------------
		User u3 = u2;
		u3.age = 30;
		System.out.println("u3age = " + u3.age);
		System.out.println("u2age =" + u2.age);
		
		u.show();
		u2.show();
		
		System.out.println("---------------------------------------");
		//匿名对象:
		new User().say();
		u3.run(new User());
	}
}

class User{
	
	String name;
	int age;
	
	public void say(){
		System.out.println("我是user我怕谁");
	}
	
	public void run(User u){
		System.out.println("大哥跑路了");
	}
	
	public void show(){
		System.out.println("my name is " + name + age);
	}
}

class Person{
	
	String name;
	int age;
}

class Animal{
	String name;
	int age;
}
