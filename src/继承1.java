class School{
	String name;
	int students;
	public School(){
		name="�������ְҵ������ѧ";
		students=40000;
	}
	void show(){
		System.out.printf("����������Ϊ��%s\n",name);
		System.out.println("ѧУ��ѧ���У�"+students);
	}
}
class Stu extends School{
	String name;
	int boy,girl;
	public Stu(){
		name="��ѧ��";
		boy=30000;
		girl=10000;
	}
	void show(){
		System.out.printf("����������Ϊ��%s���д�ѧ���У�%d��Ů��ѧ���У�%d\n",name,boy,girl);
	}
}
public class �̳�1 {
	public static void main(String[] args){
		Stu a=new Stu();
		a.show();
		School b=new School();
		b.show();
	}
}
