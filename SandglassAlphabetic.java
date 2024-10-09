import java.util.Scanner;
public class SandglassAlphabetic {
    public static void main(String[] args) {
        int a=65;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Enter the value of k:");
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s=0;s<i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
        for(int i=0;i<k;i++){
            for(int s=k-1;s>i;s--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
