import java.util.Scanner;
public class 矩阵对角线的和 {
	public static void main(String[] args){
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(arr[0][0]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][2]);
	}
}