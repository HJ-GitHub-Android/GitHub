import java.util.Scanner;

public class ���֤��֤ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���֤�ţ�");
        String str = sc.next();
        System.out.println("���գ�" + str.substring(6, 10) + "��" + str.substring(10, 12) + "��" + str.substring(12, 14) + "��");
        int s = Integer.parseInt(String.valueOf(str.charAt(16)));
        if (s % 2 == 1) {
            System.out.println("�Ա���");
        } else {
            System.out.println("�Ա�Ů");
        }

    }
}