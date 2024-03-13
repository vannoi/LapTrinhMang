import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        n=sc.nextInt();
        for(int i=n;i<=n;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
            System.out.println("------------");
            System.out.println("");
        }

    }

}
