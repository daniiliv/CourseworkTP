public interface AnimalFactory {

    /**
     * Фабричный метод создания экземпляра одного из подклассов класса Animal.
     */
    Animal createAnimal();

    Animal createAnimal(String breed, String color, String name, String gender, String dateOfBirth, int size, String nameOfOwner, String nurseryName, String temper);
}
