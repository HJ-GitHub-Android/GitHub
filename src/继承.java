class Animal{
	String name;
	public Animal(){
		name="�Ϲ�";
	}
	void show(){
		System.out.printf("����������Ϊ��%s\n",name);
	}
}
class Dog extends Animal{
	String name;
	int age;
	public Dog(){
		name="С��";
		age=4;
	}
	void show(){
		System.out.printf("����������Ϊ��%s������Ϊ��%d\n",name,age);
	}
}
public class �̳� {
	public static void main(String[] args){
		Dog a=new Dog();
		a.show();
		Animal b=new Animal();
		b.show();
	}
}
