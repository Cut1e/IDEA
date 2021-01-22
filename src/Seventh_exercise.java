import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import  java.util.ArrayList;
import java.io.*;
import java.lang.String;

public class Seventh_exercise {
    public static class Sotrudnik {
        private String FIO;
        private int time;
        private int tarif;

        public Sotrudnik() {
            Scanner ab = new Scanner(System.in);
            System.out.println("Введите фамилии рабочего");
            this.FIO = ab.nextLine();
            System.out.println("Введите отработанное время");
            this.time = ab.nextInt();
            System.out.println("Введите тарифную ставку");
            this.tarif = ab.nextInt();
        }

        public static double Zadanie(int time, int tarif) {
            double standart;
            double zar;
            if (time < 144)
                zar = (time * tarif) * 0.12;
            else {
                standart = (144 * tarif) * 0.12;
                time = time - 144;
                zar = (time * (tarif * 2)) * 0.12;
                zar = zar + standart;
            }
            return zar;
        }
        public  Sotrudnik(String fio,int time,int tarif)
        {
            this.FIO=fio;
            this.time=time;
            this.tarif=tarif;
        }
        @Override
        public String toString() {

            return "Работник { ФИО=" + FIO + " Колличество часов=" + time + " Ставка=" + tarif + " }";
        }

        public String Zapis() {
            return this.FIO + "|" + this.time + "|" + this.tarif + "|"+System.lineSeparator();
        }
    }
        public static void ZapisFile(ArrayList<Sotrudnik> info ) throws IOException
        {
            FileWriter writer = new FileWriter("D:\\Example.txt");
            writer.write("FIO|TIME|Tarif"+System.lineSeparator());
            for(Sotrudnik Perebor:info)
                writer.write(Perebor.Zapis());
            writer.flush();
            writer.close();
        }
    public static ArrayList<Sotrudnik> ReadFiles(ArrayList<Sotrudnik> sotrud) throws IOException
    {
        List<String> lines= Files.readAllLines(Paths.get("D:\\Example.txt"));
        String Words[];
        int i=0;
        sotrud.clear();
        for (String Perebor:lines)
        {Words=Perebor.split("\\|");
            if(i!=0)
                sotrud.add(new Sotrudnik((Words[0]),Integer.parseInt(Words[1]),Integer.parseInt(Words[2])));
            i++;
        }
        return sotrud;
    }
        public static void main(String[] args) throws IOException {
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
            System.out.println("7-Записать в ФАЙЛ");
            System.out.println("8-Прочитать из ФАЙЛА");
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
                case 7: ZapisFile(List);
                    System.out.println("Запись прошла успешно");
                    break;
                case 8: List=ReadFiles(List);
                    System.out.println("Чтение прошло успешно");
                break;
                default : break;
            }
        } while (menu!=0);
    }

}
