package sem6;

import java.util.List;

public class Cat {
    private String name;
    private String owner;
    private String breed;
    private int age;
    private List<String> healthHistory;

    public Cat(String name, String owner, String breed, int age){
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }

    // getter
    public String getName(){
        return name;
    }

    // getter
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "name: " + name + " owner: " + owner + " breed: " + breed + " age: " + age;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Cat)) return false;
        //return name.equals(((Cat)o).name); // Можно использовать конструкцию явного приведения типа
        //Но легче сделать так
        Cat cat = (Cat)o;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    @Override
    public int hashCode(){
        return 2*name.hashCode() + 3*owner.hashCode() + 4*breed.hashCode() + 5*age;
    }
}