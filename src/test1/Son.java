package test1;

public class Son extends Father {
	//�����ĸ��ǣ�������д�����ͬ������Override
	//�������ǵ�ԭ��1.���෽���Ĳ�����������ౣ��һ��
	//2.���෽�������η��ķ�λ������ڵ��ڸ���ͬ�����������η�
	public void print(){
		System.out.println("sonprint...");
	}
	public void a(Father obj1){
		obj1.print();
	}

	public static void main(String[] args) {
		//Son s = new Son();
		//s.print();
		//����   	����= new ���ࣨ����
		//Father obj = new Son();
		//obj.print();//ֻ�ܵ��ø������еĳ�Ա
		Son obj = new Son();
		obj.a(obj);

	}

}
