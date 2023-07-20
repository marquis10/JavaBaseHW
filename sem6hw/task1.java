package sem6hw;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class task1 {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook("Asus", "X200MA", 2167, 4, 240, 20000);
        NoteBook noteBook2 = new NoteBook("Asus", "K52JT", 2666, 6, 240, 27000);
        NoteBook noteBook3 = new NoteBook("Asus", "X415EA", 3000, 8, 512, 37000);
        NoteBook noteBook4 = new NoteBook("Lenovo", "11ADA05", 1400, 4, 128, 21000);
        NoteBook noteBook5 = new NoteBook("Lenovo", "P585", 2300, 6, 320, 25000);
        NoteBook noteBook6 = new NoteBook("Lenovo", "Z50-70", 2600, 8, 500, 30000);
        NoteBook noteBook7 = new NoteBook("HP", "15-ba028ur", 2100, 6, 480, 24000);
        NoteBook noteBook8 = new NoteBook("HP", "G8", 2400, 8, 256, 28000);
        NoteBook noteBook9 = new NoteBook("Acer", "Ryzen 3", 2400, 8, 256, 28500);
        NoteBook noteBook10 = new NoteBook("Acer", "EX215-52-37WL", 3000, 12, 1000, 44000);
        NoteBook noteBook11 = new NoteBook("Dell", "N5110-6926", 2300, 6, 120, 28000);
        NoteBook noteBook12 = new NoteBook("Dell", "Vostro", 3000, 8, 256, 33000);


        Map<Integer, String> mapSpec = new HashMap<>();
        mapSpec.put(1, "producer");
        mapSpec.put(2, "model");
        mapSpec.put(3, "cpu");
        mapSpec.put(4, "ram");
        mapSpec.put(5, "storage");
        mapSpec.put(6, "price");


        Set<Map> nbooks = new HashSet<>();
        nbooks.add(CreatMapNb(noteBook1, mapSpec));
        nbooks.add(CreatMapNb(noteBook2, mapSpec));
        nbooks.add(CreatMapNb(noteBook3, mapSpec));
        nbooks.add(CreatMapNb(noteBook4, mapSpec));
        nbooks.add(CreatMapNb(noteBook5, mapSpec));
        nbooks.add(CreatMapNb(noteBook6, mapSpec));
        nbooks.add(CreatMapNb(noteBook7, mapSpec));
        nbooks.add(CreatMapNb(noteBook8, mapSpec));
        nbooks.add(CreatMapNb(noteBook9, mapSpec));
        nbooks.add(CreatMapNb(noteBook10, mapSpec));
        nbooks.add(CreatMapNb(noteBook11, mapSpec));
        nbooks.add(CreatMapNb(noteBook12, mapSpec));

        FilterNoteBook(nbooks);
    }

    static Map<String, Object> CreatMapNb(NoteBook noteBook, Map<Integer, String> mapSpec){
        Map<String, Object> nb = new HashMap<>();
        for (Map.Entry entry : mapSpec.entrySet()) {
            switch (entry.getValue().toString()) {
                case "producer":
                    nb.put(entry.getValue().toString(), noteBook.getProducer());
                    break;
                case "model":
                    nb.put(entry.getValue().toString(), noteBook.getModel());
                    break;
                case "cpu":
                    nb.put(entry.getValue().toString(), noteBook.getCpu());
                    break;
                case "ram":
                    nb.put(entry.getValue().toString(), noteBook.getRam());
                    break;
                case "storage":
                    nb.put(entry.getValue().toString(), noteBook.getStrorage());
                    break;
                case "price":
                    nb.put(entry.getValue().toString(), noteBook.getPrice());
                    break;
            }
        }
        return nb;
    }

    static void FilterNoteBook(Set<Map> nbooks){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру соответствующую необходимому критерию: ");
        String temp = scanner.nextLine();
        switch (temp) {
            case "1":
                System.out.println("Введите производителя ноутбука(Asus, Lenovo, HP, Acer, Dell): ");
                String temp1 = scanner.nextLine();
                for (var item : nbooks) {
                    if (item.get("producer").equals(temp1)) System.out.println(item);
                }
                break;
            case "2":
                System.out.println("Введите модель ноутбука: ");
                String temp2 = scanner.nextLine();
                for (var item : nbooks) {
                    if (item.get("model").equals(temp2)) System.out.println(item);
                }
                break;
            case "3":
                System.out.println("Введите минимальную частоту процессора: ");
                int temp3 = scanner.nextInt();
                for (var item : nbooks) {
                    if ((int)item.get("cpu") >= temp3) System.out.println(item);
                }
                break;
            case "4":
                System.out.println("Введите минимальный объём оперативной памяти: ");
                int temp4 = scanner.nextInt();
                for (var item : nbooks) {
                    if ((int)item.get("ram") >= temp4) System.out.println(item);
                }
                break;
            case "5":
                System.out.println("Введите минимальный объём накопителя: ");
                int temp5 = scanner.nextInt();
                for (var item : nbooks) {
                    if ((int)item.get("storage") >= temp5) System.out.println(item);
                }
                break;
            case "6":
                System.out.println("Введите минимальную цену: ");
                int temp6 = scanner.nextInt();
                for (var item : nbooks) {
                    if ((int)item.get("price") >= temp6) System.out.println(item);
                }
                break;
        }
        scanner.close();
    }
}