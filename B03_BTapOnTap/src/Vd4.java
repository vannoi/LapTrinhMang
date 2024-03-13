import java.util.Scanner;

public class Vd4 {
    public static void main(String[] args) {
        int x ;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap x: ");
        x=sc.nextInt();
        String check  = (x%2==0)?"Số chẵn":"Số lẻ";
        System.out.println(check);
    }

}
