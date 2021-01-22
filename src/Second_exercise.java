import java.util.Scanner;

public class Second_exercise {
    static double abs2(double[][]mas,int i,int m)
    {
        double p1=0;
        for (int k=1;k<m;k++) {
            for (int j = 0; j < i; j++) {
                p1 += mas[j][k];
            }
        }
        return p1;
    }
    static double abs(double[][]mas,int i,int m)
    {
        double p1=1;
        for (int k=1;k<i;k++) {
            for (int j = 0; j < m; j++) {
                p1 *= mas[k][j];
            }
        }
        return p1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[][] mas=new double[n][m];
        double[][] mas1=new double[n][m];
        double[][] mas2=new double[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = Math.round(Math.random() * 5 + 1);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                mas1[i][j] = mas[i][j] * abs(mas, n, m);
                mas2[i][j] = mas[i][j] + abs2(mas, n, m);
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas1[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mas2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
