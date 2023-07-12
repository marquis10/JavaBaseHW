package sem5.task1_passports;

public class task0 {
    public static void main(String[] args) {
        pass();
    }

    static void pass(){
        Passport passport = new Passport();
        passport.add("123456", "Ivanov");
        passport.add("321456", "Vasiljev");
        passport.add("234561", "Petrova");
        passport.add("234432", "Ivanov");
        passport.add("654321 ", "Petrova");
        passport.add("234567", "Ivanov");

        System.out.println(passport.getByLastName("Ivanov"));
        System.out.println(passport.getByPassNum("321456"));
        System.out.println(passport.getAll());
    }
}

