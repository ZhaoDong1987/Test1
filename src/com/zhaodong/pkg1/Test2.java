package com.zhaodong.pkg1;

public class Test2 {
	 private String name = "张三";
	 private int age = 20;
	 public Test2() {
	 }

	 public Test2(String name, int age) {
		this.name=name;
	 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			 Test2 p2 = new Test2("小明",22);
			
			  p2.info();
	}
	private void info() {
	
			 System.out.print(this.name + "今年" + this.age + "岁!");
			 
	}



}


