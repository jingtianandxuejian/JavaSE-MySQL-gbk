package com.atguigu.java3;

/**
 * 
 * @author Administrator
 * 
 * ����
 * һ �����ĸ�ʽ
 * 			Ȩ�����η�   ����ֵ����   ���������β��б�{
 * 				 ������;
 * 			}
 * 
 * 1.Ȩ�����η���private ȱʡ protected public ����Ȩ�����η�������ֻ��public��
 * 2.����ֵ���ͣ�void / �������������
 * 			  void:û�з���ֵ
 * 			    ������������ͣ�������������Ҳ������������������
 * 			    ע�⣺�������ֵ��һ��������������ͣ���ô�ڷ�����������루 return ��������ͣ�;
 * 3.���������ϸ����ر�ʶ���Ĺ���͹淶��������������֪�⣺���� print() sort()
 * 4.�β��б�:�β��б��е����Ϳ����ǻ�����������Ҳ�����������������ͣ��������֮���á�,������.
 * 5.�����壺�����������ľ���ʵ��
 * 
 * �� ����
 * 		public void say(){};
 * 		public void say(String name){}
 * 		public int getAge(){return 20;}
 * 		public int getAge(int a){return a;}
 * 
 *ע�⣺1.�����ڿ��Ե������ԡ�2.�����ڿ��Ե��ñ��෽��������Ҫ�Լ������Լ����ݹ鷽�����˳���������
 */
public class MethodTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.say();
		//int age = stu.getAge();
		//System.out.println(age);
		//stu.show(18, "С����", 12.3);
	}
}

class Student{
	
	public String name;
	public int age;
	
	
	public void say(){
		System.out.println("ѧ���Ͽ�˵��");
		//say();
	}
	
	public int getAge(){ //�������ֵ��һ��������������ͣ���ô�ڷ������������ return ���������;
		//return 20;
		
		//�������ֵ��һ��������������ͣ�������ִ���������return�Ĳ�����������벻ͨ��
		if(age > 20){
			return 20;
		}else{
			return 0;
			//System.out.println("aaa"); //ע�⣺return ���治����д���
		}
		
		//return 0;
	}
	
	//�β��б��е����ͣ������ǻ�����������Ҳ�����������������ͣ��������֮���á�,������
	public void show(int age,String name,double d){ 
		say();
		System.out.println(age + " " + name + " " + d);
	}
	
}
