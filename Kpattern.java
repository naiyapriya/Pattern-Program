import java.util.Scanner;

public class Kpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=s.nextInt();
        System.out.print("Enter the value of k:");
        int k=s.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
