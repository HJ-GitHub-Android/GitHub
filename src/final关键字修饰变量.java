class Student{
	final String name;
	public Student(String name){
		this.name=name;
	}
	public void introduce(){
		System.out.println("我是一个学生，我叫"+name);
	}
}
public class final关键字修饰变量 {
	public static void main(String[] args){
		Student stu=new Student("小明");
		stu.introduce();
	}
}
