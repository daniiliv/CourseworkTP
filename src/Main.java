import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        // Создать форму ввода.
        SwingUtilities.invokeLater(animalFormUI::new);

        System.out.println("Enter necessary species:\n«cat», «dog», «mouse», «horse», «snake», «fish»\n«e» - for exit)");
        Scanner scanner = new Scanner(System.in);

        AnimalFactory animalFactory = createAnimalBySpecies(scanner.next());

        Animal animal = animalFactory.createAnimal();
    }

    static AnimalFactory createAnimalBySpecies(String species) {
        species = species.toLowerCase();

        switch (species) {

            case "cat":
                return new CatFactory();

            case "dog":
                return new DogFactory();

            case "mouse":
                return new MouseFactory();

            case "horse":
                return new HorseFactory();

            case "snake":
                return new SnakeFactory();

            case "fish":
                return new FishFactory();

            case "e":
                exit(1);

            default:
                throw new RuntimeException(species + " is unknown species!");
        }
    }
}
