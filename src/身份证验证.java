import java.util.Scanner;

public class 身份证验证 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身份证号：");
        String str = sc.next();
        System.out.println("生日：" + str.substring(6, 10) + "年" + str.substring(10, 12) + "月" + str.substring(12, 14) + "日");
        int s = Integer.parseInt(String.valueOf(str.charAt(16)));
        if (s % 2 == 1) {
            System.out.println("性别：男");
        } else {
            System.out.println("性别：女");
        }

    }
}