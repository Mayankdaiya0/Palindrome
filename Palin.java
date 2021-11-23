import java.util.Scanner;
import static java.lang.Math.pow;
class Test {

    int sv(int n) {
        int s = 0;
        while (n != 0) {
            s += 1;
            n /= 10;
        }
        return s;
    }

    int values(int n) {
        int s = sv(n);
        double a = 10, b =s - 1, d = 0;
        int m=n,p=n;
        while (m != 0) {
            p %= 10;
            d = d + p * (pow(a, b));
            m /= 10;
            p = m;
            b -= 1;
        }

        return (int) d;
    }
}
public class Palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int o = a;
        Test obj = new Test();
        int q= obj.values(a);
        if (q == o)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
