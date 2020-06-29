import java.util.Scanner;
public class 扫雷 {
	public static void main(String[] args) {
	       int[][] thundes={
	            {1,1,1,1},
	            {1,1,1,1},
	            {1,2,1,1},
	            {1,1,1,1}
	       };
	       Scanner in = new Scanner(System.in);
	       //键盘输入 行号和列号
	       System.out.println("请输入行号:");
	       int row=in.nextInt();
	       System.out.println("请输入列号:");
	       int col=in.nextInt();
	       int value= thundes[row][col];//从数组中获得的值
	       //判断是否扫到了雷
	       for(int i=0;i<thundes.length;i++)
	       {
	           for(int j=0;j<thundes[i].length;j++)
	           {
	               //判断 value 是否在 数组中存在 并且 等于 2
	               if(value==thundes[i][j]&&value==2)
	               {
	                   System.out.print("雷");
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
