import java.util.Scanner;
import  java.util.ArrayList;

public class Sixth_exercise {
    public static class Sotrudnik
    {
        private String FIO;
        private int time;
        private int tarif;
        public Sotrudnik()
        {
            Scanner ab = new Scanner(System.in);
            System.out.println("Input FIO worker");
            this.FIO=ab.nextLine();
            System.out.println("Input work time");
            this.time=ab.nextInt();
            System.out.println("Input tariff rate");
            this.tarif=ab.nextInt();
        }
        public static double Zadanie(int time, int tarif)
        {
            double standart;
            double zar;
            if(time<144)
                zar=(time*tarif)*0.12;
            else {
                standart=(144*tarif)*0.12;
                time = time - 144;
                zar = (time * (tarif * 2)) * 0.12;
                zar=zar+standart;
            }
            return  zar;
        }
        @Override
        public String toString() {

            return "Работник { ФИО="+FIO+" Колличество часов="+time+" Ставка="+tarif+" }";
        }
    }
    public static void main(String[] args) {
        ArrayList <Sotrudnik> List= new ArrayList<Sotrudnik>();
        int menu;
        int indexVstavki;
        Scanner ab = new Scanner(System.in);
        do {
            System.out.println("1-Добавление объекта в конец");
            System.out.println("2-Добавление объекта по индексу");
            System.out.println("3-Вывод элементов на экран");
            System.out.println("4-Удаление объекта");
            System.out.println("5-Установить новое значение по индексу");
            System.out.println("6-Расчет ЗП");
            System.out.println("0-Выход");
            menu=ab.nextInt();
            switch (menu) {
                case 1: List.add(new Sotrudnik()); break;
                case 2: System.out.println("Введите индекс элемента для вставки"); indexVstavki=ab.nextInt();
                    List.add(indexVstavki, new Sotrudnik()); break;
                case 3: System.out.println(List.toString()); break;
                case 4: System.out.println("Введите индекс элемента для удаления"); indexVstavki=ab.nextInt();
                    List.remove(indexVstavki); break;
                case 5: System.out.println("Введите индекс элемента для изменения"); indexVstavki=ab.nextInt();
                    List.set(indexVstavki, new Sotrudnik()); break;
                case 6:
                    for (Sotrudnik Perebor:List)
                    {
                        System.out.println(Sotrudnik.Zadanie(Perebor.time, Perebor.tarif));

                    }
                    break;
                default : break;
            }
        } while (menu!=0);
    }

}
