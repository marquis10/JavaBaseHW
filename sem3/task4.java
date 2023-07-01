package sem3;
//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, 
// что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях
//  - названия книг. Напишите метод для заполнения данной структуры.
// фантастика, марсианин
// приключения, индиана джонс
// классика, поэзия Пушкина
// детектив, шерлок холмс

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        List<ArrayList<String>> catalog = new ArrayList<>();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите жанр: название или q для выхода ->");
        // String input = "";
        // while (!input.equals("q")) {
        // }
        addBook("Фантастика", "Трудно быть богом", catalog);
        addBook("Фантастика", "Марсианин", catalog);
        addBook("Детектив", "Убийство в восточном экспрессе", catalog);
        System.out.println(catalog);
    }

    static void addBook(String type, String name, List<ArrayList<String>> catalog){
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).get(0).equals(type)) {
                catalog.get(i).add(name);
                return;
            }
        }
        ArrayList<String> t = new ArrayList<>();
        t.add(type);
        t.add(name);
        catalog.add(t);
    }
}