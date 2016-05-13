package com.zhaodong.pkg1;

public class Sub extends Base {
	public Sub(){
		super(2);
		//super();
		super.a();
		System.out.println("Sub类的初始构造方法");
	}

	public static void main(String[] args) {
		//子类对象构造时会先调用父类的构造方法
		//Sub ob = new Sub();
	}

}
