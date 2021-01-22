import java.util.Scanner;
import  java.util.ArrayList;

/* public class Tenth_exercise {
    public static class Man
    {
        private int id;
        private String name;
        private int age;
        public  int height;
        public  int weight;
        private int[] demands= new int[6];
        public Man()
        {
            Scanner ab = new Scanner(System.in);
            System.out.println("Введите id жениха");
            this.id=ab.nextInt();
            System.out.println("Введите ФИО жениха");
            this.name=ab.nextLine();
            System.out.println("Введите возраст жениха");
            this.age=ab.nextInt();
            System.out.println("Введите рост жениха");
            this.height=ab.nextInt();
            System.out.println("Введите вес жениха");
            this.weight=ab.nextInt();
        }
        @Override
        public String toString() {

            return "Жених {ID="+id+" ФИО="+name+" Возраст="+age+" Рост="+height+" Вес"+weight+" }";
        }
    }
    public static class Woman
    {
        private int id;
        private String name;
        private int age;
        public  int height;
        public  int weight;
        private int[] demands= new int[6];
        public Woman()
        {
            Scanner ab = new Scanner(System.in);
            System.out.println("Введите id жениха");
            this.id=ab.nextInt();
            System.out.println("Введите ФИО жениха");
            this.name=ab.nextLine();
            System.out.println("Введите возраст жениха");
            this.age=ab.nextInt();
            System.out.println("Введите рост жениха");
            this.height=ab.nextInt();
            System.out.println("Введите вес жениха");
            this.weight=ab.nextInt();
        }
        @Override
        public String toString() {

            return "Жених {ID="+id+" ФИО="+name+" Возраст="+age+" Рост="+height+" Вес"+weight+" }";
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
*/