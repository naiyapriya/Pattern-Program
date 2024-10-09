import java.util.Scanner;

public class RightPascalAlphabetic {
    public static void main(String[] args) {
        int a=65;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=s.nextInt();
        System.out.print("Enter the value of k:");
        int k=s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
        for(int i=k;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
