public class SnakeFactory extends AbstractAnimalFactory {

    private Animal snake = new Snake();

    @Override
    protected Animal getCreatedAnimal() {
        return snake;
    }
}
