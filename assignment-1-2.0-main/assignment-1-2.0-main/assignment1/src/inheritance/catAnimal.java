package inheritance;

public class catAnimal extends Animals implements AnimalsInterface{
        public catAnimal(String name, String breed) {
                super(name, breed);

        }
        @Override
        public String whatAmI() {
                return "cat";
        }
        @Override
        public String makeSound() {
                return "meow";
        }

}
