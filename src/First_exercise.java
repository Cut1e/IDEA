import java.util.Scanner;

public class First_exercise {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,sum1=0,sum2=0,sum=0;
        System.out.println("Input array's length");
        n=sc.nextInt();
        double[] mas =new double[n];
        double[] mas2=new double[n];
        double x_=0,y_=0,kof;
        for (int i=0;i<n;i++)
        {
            mas[i]=Math.round(Math.random()*5+1);
            mas2[i]=Math.round(Math.random()*5+1);
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            System.out.print(mas2[i]+" ");
        }
        for (int i=0;i<n;i++)
        {
            sum1+=mas[i];
            sum2+=mas2[i];
        }
        x_+=(1.0/n)*sum1;
        y_+=(1.0/n)*sum2;
        for(int i=0;i<n;i++)
        {
            sum+=(mas[i]-x_)*(mas2[n-1]-i-y_);
        }
        kof=1.0/n*sum;
        System.out.println("\n" +
                "Covariance coefficient="+kof);
        sc.close();
    }
}
