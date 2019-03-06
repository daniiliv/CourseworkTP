/**
 * Интерфейс животное.
 */
public interface AnimalInterface {

    /**
     * Геттер породы.
     */
    String getBreed();

    /**
     * Геттер окраса.
     */
    String getColor();

    /**
     * Геттер клички.
     */
    String getName();

    /**
     * Геттер пола животного.
     */
    String getGender();

    /**
     * Геттер даты рождения.
     */
    String getDateOfBirth();

    /**
     * Геттер размеров животного.
     */
    int getSize();

    /**
     * Геттер имени владельца животного.
     */
    String getNameOfOwner();

    /**
     * Геттер названия питомника.
     */
    String getNurseryName();

    /**
     * Геттер характера животного.
     */
    String getTemper();

    /**
     * Сеттер породы.
     */
    void setBreed(String breed);

    /**
     * Сеттер окраса.
     */
    void setColor(String color);

    /**
     * Сеттер клички.
     */
    void setName(String name);

    /**
     * Сеттер пола животного.
     */
    void setGender(String gender);

    /**
     * Сеттер даты рождения.
     */
    void setDateOfBirth(String dateOfBirth);

    /**
     * Сеттер размеров животного.
     */
    void setSize(int size);

    /**
     * Сеттер имени владельца животного.
     */
    void setNameOfOwner(String nameOfOwner);

    /**
     * Сеттер названия питомника.
     */
    void setNurseryName(String nurseryName);

    /**
     * Сеттер характера животного.
     */
    void setTemper(String temper);
}
