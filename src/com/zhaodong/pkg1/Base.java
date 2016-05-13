package com.zhaodong.pkg1;

public class Base {
	/*public Base(){
		System.out.println("Base类的初始构造方法");
	}*/
	public Base(int x){
		System.out.println("Base类的重载构造方法");
	}
	public void a(){
		System.out.println("Base.a()");
	}
	public void  b(){
		this.a();
	}
	public static void main(String[] args){
		Base obj=new Base(1);
		obj.b();
	}
}
