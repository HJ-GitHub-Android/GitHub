class School{
	String name;
	int students;
	public School(){
		name="江西软件职业技术大学";
		students=40000;
	}
	void show(){
		System.out.printf("父类的输出名为：%s\n",name);
		System.out.println("学校的学生有："+students);
	}
}
class Stu extends School{
	String name;
	int boy,girl;
	public Stu(){
		name="大学生";
		boy=30000;
		girl=10000;
	}
	void show(){
		System.out.printf("子类的输出名为：%s，男大学生有：%d，女大学生有：%d\n",name,boy,girl);
	}
}
public class 继承1 {
	public static void main(String[] args){
		Stu a=new Stu();
		a.show();
		School b=new School();
		b.show();
	}
}
