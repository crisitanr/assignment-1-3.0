package inheritance;

public class dogAnimal extends Animals implements AnimalsInterface {
    public dogAnimal(String name, String breed) {
        super(name, breed);

    }

    @Override
    public String whatAmI() {
        return "cal";
    }
    @Override
    public String makeSound() {
        return "sound";
    }
}
