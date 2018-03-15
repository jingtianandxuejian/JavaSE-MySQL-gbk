package com.atguigu.java3;

/**
 * 
 * @author Administrator
 * 
 * 方法
 * 一 方法的格式
 * 			权限修饰符   返回值类型   方法名（形参列表）{
 * 				 方法体;
 * 			}
 * 
 * 1.权限修饰符：private 缺省 protected public 四种权限修饰符（现在只用public）
 * 2.返回值类型：void / 具体的数据类型
 * 			  void:没有返回值
 * 			    具体的数据类型：基本数据类型也可以是引用数据类型
 * 			    注意：如果返回值是一个具体的数据类型，那么在方法体的最后必须（ return 具体的类型）;
 * 3.方法名：严格遵守标识符的规则和规范。尽量做到见名知意：类似 print() sort()
 * 4.形参列表:形参列表中的类型可以是基本数据类型也可以是引用数据类型，多个参数之间用”,“隔开.
 * 5.方法体：方法功能语句的具体实现
 * 
 * 二 举例
 * 		public void say(){};
 * 		public void say(String name){}
 * 		public int getAge(){return 20;}
 * 		public int getAge(int a){return a;}
 * 
 *注意：1.方法内可以调用属性。2.方法内可以调用本类方法，但不要自己调用自己（递归方法有退出的条件）
 */
public class MethodTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.say();
		//int age = stu.getAge();
		//System.out.println(age);
		//stu.show(18, "小玲玲", 12.3);
	}
}

class Student{
	
	public String name;
	public int age;
	
	
	public void say(){
		System.out.println("学生上课说话");
		//say();
	}
	
	public int getAge(){ //如果返回值是一个具体的数据类型，那么在方法体的最后必须 return 具体的类型;
		//return 20;
		
		//如果返回值是一个具体的数据类型，必须在执行语句中有return的操作，否则编译不通过
		if(age > 20){
			return 20;
		}else{
			return 0;
			//System.out.println("aaa"); //注意：return 后面不能再写语句
		}
		
		//return 0;
	}
	
	//形参列表中的类型，可以是基本数据类型也可以是引用数据类型，多个参数之间用”,“隔开
	public void show(int age,String name,double d){ 
		say();
		System.out.println(age + " " + name + " " + d);
	}
	
}
