import java.io.File;
import java.nio.file.Paths;

public class Cat extends Animal {

    /**
     * Файл, куда будет записана информация по животному.
     */
    private final File catFile = Paths.get("/home/daniil/projects/SUAI/CourseworkTP/cat.txt").toFile();

    public Cat() {
        super();
    }

    /**
     * Геттер породы.
     */
    @Override
    public String getBreed() {
        return super.getBreed();
    }

    /**
     * Геттер окраса.
     */
    @Override
    public String getColor() {
        return super.getColor();
    }

    /**
     * Геттер клички.
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Геттер пола животного.
     */
    @Override
    public String getGender() {
        return super.getGender();
    }

    /**
     * Геттер даты рождения.
     */
    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    /**
     * Геттер размеров животного.
     */
    @Override
    public int getSize() {
        return super.getSize();
    }

    /**
     * Геттер имени владельца животного.
     */
    @Override
    public String getNameOfOwner() {
        return super.getNameOfOwner();
    }

    /**
     * Геттер названия питомника.
     */
    @Override
    public String getNurseryName() {
        return super.getNurseryName();
    }

    /**
     * Геттер характера животного.
     */
    @Override
    public String getTemper() {
        return super.getTemper();
    }

    /**
     * Сеттер породы.
     */
    @Override
    public void setBreed(String breed) {
        super.setBreed(breed);
    }

    /**
     * Сеттер окраса.
     */
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    /**
     * Сеттер клички.
     */
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    /**
     * Сеттер пола животного.
     */
    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    /**
     * Сеттер даты рождения.
     */
    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    /**
     * Сеттер размеров животного.
     */
    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    /**
     * Сеттер имени владельца животного.
     */
    @Override
    public void setNameOfOwner(String nameOfOwner) {
        super.setNameOfOwner(nameOfOwner);
    }

    /**
     * Сеттер названия питомника.
     */
    @Override
    public void setNurseryName(String nurseryName) {
        super.setNurseryName(nurseryName);
    }

    /**
     * Сеттер характера животного.
     */
    @Override
    public void setTemper(String temper) {
        super.setTemper(temper);
    }

    /**
     * Метод возвращает файл, в который будет записана информация.
     */
    @Override
    protected File getFile() {
        return catFile;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
