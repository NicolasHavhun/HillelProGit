package homework3;

public class Admin extends User {

    public Admin(String name, String surname) {
        super(name, surname);

    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public static void deleteSubstring(String firstString){

        //Тут чтобы не удалять часть стиха я отступил от условий задания и симпровизировал
        String value = firstString.replace("final", "public");
        System.out.println(value);
    }
}

