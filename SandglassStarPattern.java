import java.util.Scanner;

public class SandglassStarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Enter the value of k:");
        int k= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=k;i++){
            for(int s=k;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
