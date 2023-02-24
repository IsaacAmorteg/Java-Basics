public class SportsCheck {
    public static void main(String[] args) {

        String name;
        int age;
        boolean plays_Sport;
        String nameOfSport = "Cycling";
        char nameInitial = 'I';
        name = "Isaac";
        plays_Sport = false;
        age = 26;
        System.out.println(plays_Sport);

        if (plays_Sport) System.out.println("Yes, " + name + " practices " + nameOfSport + ".");
        else {
            System.out.println("No, "+ name + " doesn't practice any sport.");
            plays_Sport = true;
            System.out.println("However, I've set him to start with " + nameOfSport + " from now on.");
            System.out.println(plays_Sport);
        }
        System.out.println("Isaac is now a cyclist.");
        String sportIs = "Cyclist";

        if (plays_Sport == true && sportIs.equals("Cyclist"))
            System.out.println(name + " " + age + " years old. Was successfully updated as a " + sportIs + ".");
        else {
            System.out.println(nameInitial + " is deleted.");
        }
    }
}
