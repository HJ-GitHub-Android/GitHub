class Student{
	final String name;
	public Student(String name){
		this.name=name;
	}
	public void introduce(){
		System.out.println("����һ��ѧ�����ҽ�"+name);
	}
}
public class final�ؼ������α��� {
	public static void main(String[] args){
		Student stu=new Student("С��");
		stu.introduce();
	}
}
