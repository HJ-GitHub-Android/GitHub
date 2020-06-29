import java.util.Scanner;
public class ½×³Ë {
	public static void main(String[] args){
		long sum=0;
		for (int i=0;i<=20;i++){
			long k=1;
			for (int j=1;j<=i;j++){
				k=k*j;
			}
			sum+=k;
		}
    	System.out.println("1!+2!+3!+....+20!="+sum);
    }
}
