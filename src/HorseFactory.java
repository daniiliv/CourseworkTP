public class HorseFactory extends AbstractAnimalFactory {

    private Animal horse = new Horse();

    @Override
    protected Animal getCreatedAnimal() {
        return horse;
    }
}
