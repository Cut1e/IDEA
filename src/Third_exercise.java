import java.util.Scanner;

public class Third_exercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int n,cl=0;
        double c1=0.0;
        System.out.print("Input line" + "\n");
        str = sc.nextLine();
        do {
            System.out.print("Choose options" + "\n");
            n = sc.nextInt();
            switch (n) {
                case (1):
                    System.out.print("All words except the last one by one letter" + "\n");
                    String[] words = str.split(" ");
                    for (int i = 0; i < words.length - 1; i++) {
                        if (words[i].endsWith(words[i].substring(0, 1))) {
                            System.out.print(words[i] + " ");
                            cl++;
                        }
                    }
                    System.out.println("");
                    break;
                case (2):
                    System.out.print("All words except the last one by one letter. Delete first 'W' " + "\n");
                    StringBuffer sb = new StringBuffer(str);
                    int nomer = sb.indexOf("w");
                    if (nomer < -1) {
                        cl++;
                        break;
                    }
                    char[] chArray = str.toCharArray();
                    sb.delete(nomer, nomer + 1);
                    System.out.println(sb);
                    System.out.print("Choose options" + "\n");
                    n = sc.nextInt();
                    break;
                case (3):
                    n = 3;
                    break;
                default:
                    break;
            }
        }
            while(n!=3);
        if(cl!=0)
        c1=15.0/cl;
        sc.close();
        System.out.print("Jilb metric Cl="+cl+" c1="+c1);
    }
    }

