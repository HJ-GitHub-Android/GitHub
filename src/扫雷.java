import java.util.Scanner;
public class ɨ�� {
	public static void main(String[] args) {
	       int[][] thundes={
	            {1,1,1,1},
	            {1,1,1,1},
	            {1,2,1,1},
	            {1,1,1,1}
	       };
	       Scanner in = new Scanner(System.in);
	       //�������� �кź��к�
	       System.out.println("�������к�:");
	       int row=in.nextInt();
	       System.out.println("�������к�:");
	       int col=in.nextInt();
	       int value= thundes[row][col];//�������л�õ�ֵ
	       //�ж��Ƿ�ɨ������
	       for(int i=0;i<thundes.length;i++)
	       {
	           for(int j=0;j<thundes[i].length;j++)
	           {
	               //�ж� value �Ƿ��� �����д��� ���� ���� 2
	               if(value==thundes[i][j]&&value==2)
	               {
	                   System.out.print("��");
	               }
	               else
	               {
	                   System.out.print("* ");
	               }
	           }
	           System.out.println("");
	       }
	    }
}
