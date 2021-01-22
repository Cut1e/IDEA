import java.util.Scanner;
public class Fourth_exercise {
    static int nod ( int n, int m)
    {
        if (m % n == 0) return n;
        else return nod(m, n % m);
    }
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n" + "\n");
        n = sc.nextInt();
        System.out.print("Input m" + "\n");
        m = sc.nextInt();
        System.out.println("NOD recursion=" + nod(n, m));
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }
        System.out.println("NOD not recursion=" + n);
    }
}
