package com.atguigu.java3;

/*
 * 
 * ����
 * 
 * �����ķ��ࣺ
 * 			һ �������ͷ��� �������������� �� �����������ͣ��࣬�ӿڣ����飩
 *          �� ����λ�÷��ࣺ��Ա���� vs �ֲ�����
 *          
 * ��Ա�����;ֲ������Ĳ�ͬ
 *   
 *   	��ͬ��1.������������ʽ �� ��������  ������ = ����ֵ;
 *           2.������������ʹ��
 *           3.����������
 *      ��ͬ��
 *      	1.λ�ã��ֲ����������ڷ����ڣ��������βΣ��������ڣ����������βΣ��������
 *                 ��Ա��������������ڲ��������Ƚṹ�⡣
 *          2.��ʼ��ֵ���ֲ�����û��Ĭ��ֵ����Ա������Ĭ��ֵ
 *          		Ĭ��ֵ������ -- > 0
 *          			  ������ --> 0.0
 *          			  �ַ��� ---> \u0000
 *          			  ������ --> false
 *          3.Ȩ�����η�����Ա������������Ȩ�����η�,�ֲ�����û��Ȩ�����η���
 *          			Ȩ�����η���public private ȱʡ��  protected
 *          4.�ڴ��е����򣺳�Ա�����ڶ��У��ֲ�������ջ�С�
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
		System.out.println(name + " " +  age + " " + isMan); //��Ա������Ĭ��ֵ
	}
	
	public void say(String n,int a){
		
	}
}
