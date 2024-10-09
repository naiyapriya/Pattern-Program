import java.util.Scanner;

public class AlphabeticPyramid {
    public static void main(String[] args) {
        int a=65;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int s=n;s>=i;s--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
