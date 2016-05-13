package test1;

public class Son extends Father {
	//方法的覆盖：子类重写父类的同名方法Override
	//方法覆盖的原则：1.子类方法的参数必须跟父类保持一致
	//2.子类方法的修饰符的方位必须大于等于父类同名方法的修饰符
	public void print(){
		System.out.println("sonprint...");
	}
	public void a(Father obj1){
		obj1.print();
	}

	public static void main(String[] args) {
		//Son s = new Son();
		//s.print();
		//父类   	对象= new 子类（）；
		//Father obj = new Son();
		//obj.print();//只能调用父类中有的成员
		Son obj = new Son();
		obj.a(obj);

	}

}
