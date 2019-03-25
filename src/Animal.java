import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Animal implements AnimalInterface {
    private String breed;
    private String color;
    private String name;
    private String gender;
    private String dateOfBirth;
    private int size;
    private String nameOfOwner;
    private String nurseryName;
    private String temper;

    Animal() {
        super();
    }

    /**
     * Геттер породы.
     */
    @Override
    public String getBreed() {
        return breed;
    }

    /**
     * Геттер окраса.
     */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Геттер клички.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Геттер пола животного.
     */
    @Override
    public String getGender() {
        return gender;
    }

    /**
     * Геттер даты рождения.
     */
    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Геттер размеров животного.
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Геттер имени владельца животного.
     */
    @Override
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    /**
     * Геттер названия питомника.
     */
    @Override
    public String getNurseryName() {
        return nurseryName;
    }

    /**
     * Геттер характера животного.
     */
    @Override
    public String getTemper() {
        return temper;
    }

    /**
     * Сеттер породы.
     */
    @Override
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * Сеттер окраса.
     */
    @Override
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Сеттер клички.
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Сеттер пола животного.
     */
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Сеттер даты рождения.
     */
    @Override
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Сеттер размеров животного.
     */
    @Override
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Сеттер имени владельца животного.
     */
    @Override
    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    /**
     * Сеттер названия питомника.
     */
    @Override
    public void setNurseryName(String nurseryName) {
        this.nurseryName = nurseryName;
    }

    /**
     * Сеттер характера животного.
     */
    @Override
    public void setTemper(String temper) {
        this.temper = temper;
    }

    /**
     * Метод возвращает файл определённого вида животного.
     */
    protected abstract File getFile();

    /**
     * Метод записи всех полей класса в файл.
     */
    void writeInFile() {
        StringBuilder sb = new StringBuilder();

        sb.append("id: ").append(hashCode()).append("\n")
                .append("Breed: ").append(getBreed()).append("\n")
                .append("Color: ").append(getColor()).append("\n")
                .append("Name: ").append(getName()).append("\n")
                .append("Gender: ").append(getGender()).append("\n")
                .append("Date of Birth: ").append(getDateOfBirth()).append("\n")
                .append("Height: ").append(getSize()).append(" (cm.)").append("\n")
                .append("Owner's name: ").append(getNameOfOwner()).append("\n")
                .append("Nursery name: ").append(getNurseryName()).append("\n")
                .append("Temper: ").append(getTemper()).append("\n");

        System.out.println(sb);

        //параметр false - перезапись файла. true - добавить в конец файла
        try (FileWriter writer = new FileWriter(getFile(), false)) {
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
