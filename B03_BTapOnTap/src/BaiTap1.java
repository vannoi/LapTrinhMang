import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        //pt bac 2: ax^2+ bx+c=0
        //bien can co: a,b,c,x1,x2,delta
        /*
        B1 delta =b^2 -4ac

         */
        double a,b,c,x1,x2,delta;
        Scanner sc= new Scanner(System.in);
        System.out.println(" nhap a:");
        a= sc.nextDouble();
        System.out.println(" nhap b: ");
        b= sc.nextDouble();
        System.out.println(" nhap c: ");
        c= sc.nextDouble();
        delta=Math.pow(b,2)-4*a*c;

        if (a==0)
        {
            System.out.println("nhap du lieu sai");
        }
        else {
            if (delta < 0) {
                System.out.println(" pt vo n");
            } else if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println(" pt co n kep x1=x2=" + x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println(" pt co n:");
                System.out.println(" x1=" + x1);
                System.out.println("x2= " + x2);
            }
        }
    }
}
