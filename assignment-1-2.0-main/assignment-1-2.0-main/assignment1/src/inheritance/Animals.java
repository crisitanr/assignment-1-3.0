package inheritance;

public class Animals implements AnimalsInterface {
    String name;
    String breed;

    public Animals(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }


   // public void Animals(String name, String breed){
    //        this.name = name;
    //        this.breed = breed;
    //
    //    }

    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }


    @Override
    public String whatAmI() {
        return "Animal";
    }

    @Override
    public String makeSound() {
        return "sound";
    }

    @Override
    public String toString() {
        return whatAmI() + " "+
                getName()+ " " +
                getBreed()+ " "+
                makeSound();
    }
}
