package com.zhaodong.pkg1;

public class Base {
	/*public Base(){
		System.out.println("Base��ĳ�ʼ���췽��");
	}*/
	public Base(int x){
		System.out.println("Base������ع��췽��");
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
