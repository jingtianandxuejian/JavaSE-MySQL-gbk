package com.atguigu.java3;

/*
 * 
 * 属性
 * 
 * 变量的分类：
 * 			一 安照类型分类 ：基本数据类型 和 引用数据类型（类，接口，数组）
 *          二 安照位置分类：成员变量 vs 局部变量
 *          
 * 成员变量和局部变量的不同
 *   
 *   	相同：1.变量的声明格式 ： 数据类型  变量名 = 变量值;
 *           2.都是先声明后使用
 *           3.都有作用域
 *      不同：
 *      	1.位置：局部变量声明在方法内，方法的形参，构造器内，构造器的形参，代码块内
 *                 成员变量声明在类的内部，方法等结构外。
 *          2.初始化值：局部变量没有默认值，成员变量有默认值
 *          		默认值：整形 -- > 0
 *          			  浮点型 --> 0.0
 *          			  字符型 ---> \u0000
 *          			  布尔型 --> false
 *          3.权限修饰符：成员变量可以声明权限修饰符,局部变量没有权限修饰符。
 *          			权限修饰符：public private 缺省的  protected
 *          4.内存中的区域：成员变量在堆中，局部变量在栈中。
 */
public class FieldTest {

	public static void main(String[] args) {
		String name = "a";
		int age = 0;
		System.out.println(age);
		
		User u = new User();
		u.say();
	
	}
}

class User{
	protected String name;
	public int age;
	private boolean isMan;
	
	/*
	public User(){
		
	}
	*/
	
	public void say(){
		System.out.println(name + " " +  age + " " + isMan); //成员变量有默认值
	}
	
	public void say(String n,int a){
		
	}
}
