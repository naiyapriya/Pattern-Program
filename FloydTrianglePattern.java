import java.util.Scanner;
public class FloydTrianglePattern {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value of n:");
            int n = sc.nextInt();
            int s=0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(j+s+" ");
                }
                s++;
                System.out.println();
            }
        }
    }


