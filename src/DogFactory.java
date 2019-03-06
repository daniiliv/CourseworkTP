public class DogFactory extends AbstractAnimalFactory {

    private Animal dog = new Dog();

    @Override
    protected Animal getCreatedAnimal() {
        return dog;
    }
}
