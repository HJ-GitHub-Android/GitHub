class Animal{
	String name;
	public Animal(){
		name="老狗";
	}
	void show(){
		System.out.printf("父类的输出名为：%s\n",name);
	}
}
class Dog extends Animal{
	String name;
	int age;
	public Dog(){
		name="小狗";
		age=4;
	}
	void show(){
		System.out.printf("子类的输出名为：%s，年龄为：%d\n",name,age);
	}
}
public class 继承 {
	public static void main(String[] args){
		Dog a=new Dog();
		a.show();
		Animal b=new Animal();
		b.show();
	}
}
