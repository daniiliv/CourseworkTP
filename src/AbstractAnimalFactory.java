import java.util.Scanner;

public abstract class AbstractAnimalFactory implements AnimalFactory {


    protected abstract Animal getCreatedAnimal();

    /**
     * Фабричный метод создания экземпляра одного из подклассов класса Animal.
     */
    @Override
    public Animal createAnimal() {

        Animal anyAnimal = getCreatedAnimal();

        String speciesName = anyAnimal.getFile().getName();

        int pointIndex = speciesName.lastIndexOf('.');

        speciesName = speciesName.substring(0, pointIndex);

        System.out.println("Enter information about " + speciesName);

        System.out.print("Breed: ");
        Scanner scanner = new Scanner(System.in);
        anyAnimal.setBreed(scanner.next());

        System.out.print("Color: ");
        scanner = new Scanner(System.in);
        anyAnimal.setColor(scanner.next());

        System.out.println("Name: ");
        scanner = new Scanner(System.in);
        anyAnimal.setName(scanner.next());

        System.out.println("Gender: ");
        scanner = new Scanner(System.in);
        anyAnimal.setGender(scanner.next());

        System.out.println("Date of Birth: (in format dd/MM/YYYY)");
        scanner = new Scanner(System.in);
        anyAnimal.setDateOfBirth(scanner.next());

        System.out.println("Size: ");
        scanner = new Scanner(System.in);
        anyAnimal.setSize(scanner.nextInt());

        System.out.println("Owner's name: ");
        scanner = new Scanner(System.in);
        anyAnimal.setNameOfOwner(scanner.next());

        System.out.println("Nursery name: ");
        scanner = new Scanner(System.in);
        anyAnimal.setNurseryName(scanner.next());

        System.out.println("Temper: ");
        scanner = new Scanner(System.in);
        anyAnimal.setTemper(scanner.next());

        anyAnimal.writeInFile();

        return anyAnimal;
    }

    public Animal createAnimal(String breed, String color, String name, String gender, String dateOfBirth, int size, String ownerName, String nurseryName, String temper) {
        Animal anyAnimal = getCreatedAnimal();

        anyAnimal.setBreed(breed);
        anyAnimal.setColor(color);
        anyAnimal.setName(name);
        anyAnimal.setGender(gender);
        anyAnimal.setDateOfBirth(dateOfBirth);
        anyAnimal.setSize(size);
        anyAnimal.setNameOfOwner(ownerName);
        anyAnimal.setNurseryName(nurseryName);
        anyAnimal.setTemper(temper);

        anyAnimal.writeInFile();

        return anyAnimal;
    }
}
