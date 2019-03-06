public class CatFactory extends AbstractAnimalFactory {

    private Animal cat = new Cat();

    @Override
    protected Animal getCreatedAnimal() {
        return cat;
    }
}
