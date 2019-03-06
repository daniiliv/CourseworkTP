public class FishFactory extends AbstractAnimalFactory {

    private Animal fish = new Fish();

    @Override
    protected Animal getCreatedAnimal() {
        return fish;
    }
}
