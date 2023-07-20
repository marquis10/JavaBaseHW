package sem6;

import java.util.HashSet;
import java.util.Set;

/* Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является:
1. Информационной системой ветеринарной клиники.
2. Архивом выставки котов.
3. Информационной системой Театра кошек Ю.Д. Куклачёва.
Можно записать в текстовом виде, не обязательно реализовывать в java. 

1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, 
выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).*/
public class task3Cat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", "Нина", "Домашняя", 8);
        Cat cat2 = new Cat("Маркиз", "Александр", "Персидская", 6);
        Cat cat3 = new Cat("Маркиз", "Александр", "Персидская", 6);

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(cat1.getName());
        System.out.println(cat2.getAge());
        System.out.println(cat1.toString());
        System.out.println(cat2);
        System.out.println(set);
        System.out.println(cat2.equals(cat3));
    }
}