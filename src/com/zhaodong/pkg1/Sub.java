package com.zhaodong.pkg1;

public class Sub extends Base {
	public Sub(){
		super(2);
		//super();
		super.a();
		System.out.println("Sub��ĳ�ʼ���췽��");
	}

	public static void main(String[] args) {
		//���������ʱ���ȵ��ø���Ĺ��췽��
		//Sub ob = new Sub();
	}

}
