package sem5hw;

public class task1 {
    public static void main(String[] args) {
        phone();
    }

    static void phone(){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Архип Чижанов", "3225490");
        phoneBook.add("Григорий Осетров", "3225491");
        phoneBook.add("Екатерина Щербакова", "3225492");
        phoneBook.add("Александр Кузьмин", "3225493");
        phoneBook.add("Архип Чижанов", "3225494");
        phoneBook.add("Александр Кузьмин", "3225495");
        phoneBook.add("Анна Корсакова", "3225496");
        phoneBook.add("Анна Корсакова", "3225497");
        phoneBook.add("Александр Кузьмин", "3225498");
        phoneBook.add("Архип Чижанов", "3225499");
        phoneBook.add("Екатерина Щербакова", "3225500");
        phoneBook.add("Анастасия Солодова", "3225501");
        phoneBook.add("Дмитрий Пешков", "3225502");
        phoneBook.add("Архип Чижанов", "3225503");

        System.out.println("Телефонная книга");
        System.out.println(phoneBook.getAll());
        System.out.println("Отсортированная телефонная книга");
        System.out.println(phoneBook.getSort());
    }
}