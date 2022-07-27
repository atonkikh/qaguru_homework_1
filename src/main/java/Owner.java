public class Owner {
    String name;
    int age;
    int experience;

    public Owner(String ownerName, int ownerAge, int ownerExperience) {
        name = ownerName;
        age = ownerAge;
        experience = ownerExperience;
    }

    void discountPossibility(){
        if (experience >=3)
        {
            System.out.println("Вы можете получить скидку на страховку");
        } else {
            System.out.println("Вы не можете получить скидку на страховку");
        }
    }
}
