public class MouseFactory extends AbstractAnimalFactory {

    private Animal mouse = new Mouse();

    @Override
    protected Animal getCreatedAnimal() {
        return mouse;
    }
}
