import java.util.Scanner;
public class DownwardsAlphabet {
    public static void main(String[] args) {
        int a=65;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=s.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
