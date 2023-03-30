import java.util.Scanner;
public class Ters_Ucgen {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Ters üçgenin basamak sayısını giriniz:");
        n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=((n-i)*2)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
