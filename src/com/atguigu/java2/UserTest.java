package com.atguigu.java2;

/*
 * 
 * һ �����������ʵ��
 *   1.������Ӧ��java�࣬�ṩ��Ҫ�����Ժͷ���
 *   2.������Ķ���
 *   3.���ö����е����Ի���ö����еķ���������.����  ����.������
 * 
 *  ���ۣ�
 *  	1.����һ����Ķ������ÿ�������ж�ӵ�и��Ե����Ժͷ�������������֮�以��Ӱ�졣
 *        ����˵����һ�������е����Ե��������һ��ֵ������Ӱ�쵽�ڶ��������е����Ե����ֵ
 *      2.�������ڴ��еĽ���
 *      3.��������ֻ����һ�Σ�һ��������������β���ߵ���
 */
public class UserTest {

	public static void main(String[] args) {
		
		//�������� = �������ʵ�� = ���ʵ����
		User u = new User(); //����ʲô���͵Ķ��󣬾���ʲô����������
		u.say(); //���ö����еķ���
		u.age = 10; //���ö����е�����
		u.name = "Ů�೤";
		//int age = u.age;
		System.out.println(u.age);
		System.out.println(u.name);
		
		//-------------------------------
		User u2 = new User();
		u2.age = 20;
		u2.name = "�а೤";
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
		//��������:
		new User().say();
		u3.run(new User());
	}
}

class User{
	
	String name;
	int age;
	
	public void say(){
		System.out.println("����user����˭");
	}
	
	public void run(User u){
		System.out.println("�����·��");
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
