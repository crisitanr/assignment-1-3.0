package inheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mainAnimals {
    public static class main {
        private void go() throws FileNotFoundException{
            List<Animals> animals = new ArrayList<>();
            Scanner in = new Scanner(new File("C:\\Users\\cris\\Downloads\\animals2.txt"));
            while (in.hasNextLine()){
                String[] fields = in.nextLine().split(",");
                switch (fields[0]){
                        case "A" -> animals.add(new Animals(fields[1], fields[2]));
                        case "B" -> animals.add(new catAnimal(fields[1], fields[2]));
                        case "C" -> animals.add(new dogAnimal(fields[1], fields[2]));
                }
            }
            in.close();
            animals.forEach(System.out::println);
        }
        public static void main (String[] args) throws FileNotFoundException {
            new main().go();
        }
    }

}
