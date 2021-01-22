import java.util.*;

public class Fifth_exercise {
    static int partition(int[] array, int begin, int end) {
        int pivot = end;
        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (array[i] < array[pivot]) {
                int temp = array[counter];
                array[counter] = array[i];
                array[i] = temp;
                counter++;
            }
        }
        int temp = array[pivot];
        array[pivot] = array[counter];
        array[counter] = temp;
        return counter;
    }
    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }
        public static void bubble(int[] mas) {
            int [] array=new int[mas.length];
            for (int i=1;i<array.length;i++)
            {
                array[i]=mas[i];
            }
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j - 1] > array[j]) {
                        int tmp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = tmp;
                    }
                }
            }

        }
    static void returnReversArray(int[] arr){
        int temp;
        for (int i = arr.length-1, j = 0; i >=arr.length/2 ; i--,j++) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }
        public static void inserts(int[] mas) {
        int [] array=new int[mas.length];
        for (int i=1;i<array.length;i++)
        {
            array[i]=mas[i];
        }
            for (int i = 1; i < array.length; i++) {
                int current = array[i];
                int j = i - 1;
                while(j >= 0 && current < array[j]) {
                    array[j+1] = array[j];
                    j--;
                }
                array[j+1] = current;
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.print("Input array's length" + "\n");
            int n = sc.nextInt();
            int mas[] = new int[n];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = random.nextInt(100);
            }
            int low = 0;
            int high = mas.length - 1;
            long time = System.nanoTime();
            time = System.nanoTime();
            bubble(mas);
            time = System.nanoTime() - time;
            System.out.printf("Bubble %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            inserts(mas);
            time = System.nanoTime() - time;
            System.out.printf("Inserts %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            quickSort(mas,low,high);
            time = System.nanoTime() - time;
            System.out.printf("QuickSort %,9.3f ms\n", time/1_000_000.0);
            System.out.println("\n"+"Sort array");
            time = System.nanoTime();
            bubble(mas);
            time = System.nanoTime() - time;
            System.out.printf("Bubble %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            inserts(mas);
            time = System.nanoTime() - time;
            System.out.printf("Inserts %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            quickSort(mas,low,high);
            time = System.nanoTime() - time;
            System.out.printf("QuickSort %,9.3f ms\n", time/1_000_000.0);
            returnReversArray(mas);
            System.out.println("\n"+"Reverse sort array");
            time = System.nanoTime();
            bubble(mas);
            time = System.nanoTime() - time;
            System.out.printf("Bubble %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            inserts(mas);
            time = System.nanoTime() - time;
            System.out.printf("Inserts %,9.3f ms\n", time/1_000_000.0);
            time = System.nanoTime();
            quickSort(mas,low,high);
            time = System.nanoTime() - time;
            System.out.printf("QuickSort %,9.3f ms\n", time/1_000_000.0);
        }
    }

