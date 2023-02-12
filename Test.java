import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fak1=1,fak2=1,fak3=1;
        System.out.print("Kümenin Eleman Sayısı:");
        int n = input.nextInt();
        System.out.print("Grup Sayısı:");
        int r = input.nextInt();

        for(int i =1;i<=n;i++)
        {
            fak1*=i;
        }
        for(int i =1;i<=r;i++)
        {
            fak2*=i;
        }
        for(int i=1;i<=(n-r);i++)
        {
            fak3*=i;
        }
        System.out.print("Kombiyasyon:"+" "+(int)(fak1/(fak2*fak3)));







    }
}
