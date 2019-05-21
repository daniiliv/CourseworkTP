import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

/**
 * Пользовательский интерфейс.
 * Окно для ввода информации по животным.
 */
public class animalFormUI implements ActionListener {
    private JLabel jlabChooseAnimal;
    private JLabel jlabWhat;

    private JRadioButton jrbCat;
    private JRadioButton jrbDog;
    private JRadioButton jrbFish;
    private JRadioButton jrbHorse;
    private JRadioButton jrbMouse;
    private JRadioButton jrbSnake;
    private ButtonGroup bg;

    private JLabel jlabBreed;
    private JLabel jlabColor;
    private JLabel jlabName;
    private JLabel jlabGender;
    private JLabel jlabDateOfBirth;
    private JLabel jlabSize;
    private JLabel jlabOwnerName;
    private JLabel jlabNurseryName;
    private JLabel jlabTemper;

    private JTextField jtfBreed;
    private JTextField jtfColor;
    private JTextField jtfName;
    private JTextField jtfGender;
    private JDatePickerImpl dateOfBirthPicker;
    private JTextField jtfSize;
    private JTextField jtfOwnerName;
    private JTextField jtfNurseryName;
    private JTextField jtfTemper;

    private JButton jbtnApply;
    private JLabel jlabUserInfo;

    private String breed;
    private String color;
    private String name;
    private String gender;
    private String dateOfBirth;
    private int size;
    private String nameOfOwner;
    private String nurseryName;
    private String temper;

    private AnimalFactory animalFactory;

    animalFormUI() {

        // Create a new JFrame container.
        JFrame jfrm = new JFrame("Animal Form");


        jfrm.setBounds(100, 100, 730, 489);
        jfrm.getContentPane().setLayout(null);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        jlabChooseAnimal = new JLabel("Choose animal:");

        //Подсказка - какое животное выбрано.
        jlabWhat = new JLabel("Cat");

        //To avoid NPE.
        animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());

        // Create the button group.
        bg = new ButtonGroup();

        // Create the radio buttons. Select the first one.
        jrbCat = new JRadioButton("Cat", true);
        jrbDog = new JRadioButton("Dog");
        jrbFish = new JRadioButton("Fish");
        jrbHorse = new JRadioButton("Horse");
        jrbMouse = new JRadioButton("Mouse");
        jrbSnake = new JRadioButton("Snake");

        // Поля ввода с их обозначениями.
        jlabBreed = new JLabel("Breed");
        jtfBreed = new JTextField(10);

        jlabColor = new JLabel("Color");
        jtfColor = new JTextField(10);

        jlabName = new JLabel("Name");
        jtfName = new JTextField(10);

        jlabGender = new JLabel("Gender");
        jtfGender = new JTextField(10);

        jlabDateOfBirth = new JLabel("Date of Birth");

        //Выпадающий календарь.
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
        dateOfBirthPicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        jlabSize = new JLabel("Height (in cm.)");
        jtfSize = new JTextField(10);

        jlabOwnerName = new JLabel("Owner's name");
        jtfOwnerName = new JTextField(10);

        jlabNurseryName = new JLabel("Nursery name");
        jtfNurseryName = new JTextField(10);

        jlabTemper = new JLabel("Temper");
        jtfTemper = new JTextField(10);

        //Информация для пользователя.
        jlabUserInfo = new JLabel("");

        // Add the radio buttons to the group.
        bg.add(jrbCat);
        bg.add(jrbDog);
        bg.add(jrbFish);
        bg.add(jrbHorse);
        bg.add(jrbMouse);
        bg.add(jrbSnake);

        // Terminate the program when the user closes the application.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Расположение кнопок и текстовых полей.
        jlabChooseAnimal.setBounds(30, 30, 150, 20);

        jrbCat.setBounds(30, 50, 150, 20);
        jrbDog.setBounds(30, 70, 150, 20);
        jrbFish.setBounds(30, 90, 150, 20);
        jrbHorse.setBounds(30, 110, 150, 20);
        jrbMouse.setBounds(30, 130, 150, 20);
        jrbSnake.setBounds(30, 150, 150, 20);

        jlabWhat.setBounds(30, 180, 150, 20);

        jlabBreed.setBounds(270, 30, 150, 20);
        jtfBreed.setBounds(375, 30, 150, 20);

        jlabColor.setBounds(270, 50, 150, 20);
        jtfColor.setBounds(375, 50, 150, 20);

        jlabName.setBounds(270, 70, 150, 20);
        jtfName.setBounds(375, 70, 150, 20);

        jlabGender.setBounds(270, 90, 150, 20);
        jtfGender.setBounds(375, 90, 150, 20);

        jlabDateOfBirth.setBounds(270, 110, 150, 20);
        dateOfBirthPicker.setBounds(375, 110, 150, 20);

        jlabSize.setBounds(270, 130, 150, 20);
        jtfSize.setBounds(375, 130, 150, 20);

        jlabOwnerName.setBounds(270, 150, 150, 20);
        jtfOwnerName.setBounds(375, 150, 150, 20);

        jlabNurseryName.setBounds(270, 170, 150, 20);
        jtfNurseryName.setBounds(375, 170, 150, 20);

        jlabTemper.setBounds(270, 190, 150, 20);
        jtfTemper.setBounds(375, 190, 150, 20);


        jlabUserInfo.setBounds(270, 250, 350, 20);

        // Create the button.
        jbtnApply = new JButton("Apply");

        jbtnApply.setBounds(270, 220, 250, 20);

        // Добавить данный экземпляр в качестве слушателя события.
        jbtnApply.addActionListener(this);

        jtfBreed.addActionListener(this);
        jtfColor.addActionListener(this);
        jtfName.addActionListener(this);
        jtfGender.addActionListener(this);
        dateOfBirthPicker.addActionListener(this);
        jtfSize.addActionListener(this);
        jtfOwnerName.addActionListener(this);
        jtfNurseryName.addActionListener(this);
        jtfTemper.addActionListener(this);

        jtfSize.addCaretListener(e -> {
            if (!isStringInt(jtfSize.getText())) {
                jlabUserInfo.setForeground(Color.RED);
                jlabUserInfo.setText("Incorrect height format!");
            } else {
                jlabUserInfo.setText("");
            }
        });


        /**
         * Нажата кнопка Apply.
         * Получаем значения полей ввода, передаём в метод createAnimal() с параметрами.
         */
        jbtnApply.addActionListener(e -> {
            boolean correct = true;
            String[] fields = new String[9];

            fields[0] = breed = jtfBreed.getText();
            fields[1] = color = jtfColor.getText();
            fields[2] = name = jtfName.getText();
            fields[3] = gender = jtfGender.getText();
            fields[4] = dateOfBirth = dateOfBirthPicker.getJFormattedTextField().getText();
            fields[5] = nameOfOwner = jtfOwnerName.getText();
            fields[6] = nurseryName = jtfNurseryName.getText();
            fields[7] = temper = jtfTemper.getText();
            fields[8] = jtfSize.getText();

            try {
                size = Integer.parseInt(jtfSize.getText());
            } catch (NumberFormatException ex) {
                size = -1;
            }

            for (String field : fields) {
                if (field.isEmpty()) {
                    jlabUserInfo.setForeground(Color.RED);
                    jlabUserInfo.setText("Fill in all the fields!");
                    correct = false;
                } else if (size == -1) {
                    jlabUserInfo.setForeground(Color.RED);
                    jlabUserInfo.setText("Incorrect height format!");
                    correct = false;
                }
            }
            if (correct) {
                animalFactory.createAnimal(breed, color, name, gender, dateOfBirth, size, nameOfOwner, nurseryName, temper);
                jlabUserInfo.setForeground(Color.GREEN);
                jlabUserInfo.setText("Information has been added to file successfully.");
            }

        });


        //Изменения переключателей выбора животных
        //Обрабатываются методом ActionPerformed()
        jrbCat.addActionListener(this);
        jrbDog.addActionListener(this);
        jrbFish.addActionListener(this);
        jrbHorse.addActionListener(this);
        jrbMouse.addActionListener(this);
        jrbSnake.addActionListener(this);

        jfrm.getContentPane().add(jlabChooseAnimal);

        jfrm.getContentPane().add(jrbCat);
        jfrm.getContentPane().add(jrbDog);
        jfrm.getContentPane().add(jrbFish);
        jfrm.getContentPane().add(jrbHorse);
        jfrm.getContentPane().add(jrbMouse);
        jfrm.getContentPane().add(jrbSnake);

        jfrm.getContentPane().add(jtfBreed);
        jfrm.getContentPane().add(jlabBreed);

        jfrm.getContentPane().add(jtfColor);
        jfrm.getContentPane().add(jlabColor);

        jfrm.getContentPane().add(jtfName);
        jfrm.getContentPane().add(jlabName);

        jfrm.getContentPane().add(jtfGender);
        jfrm.getContentPane().add(jlabGender);

        jfrm.getContentPane().add(dateOfBirthPicker);
        jfrm.getContentPane().add(jlabDateOfBirth);

        jfrm.getContentPane().add(jtfSize);
        jfrm.getContentPane().add(jlabSize);

        jfrm.getContentPane().add(jtfOwnerName);
        jfrm.getContentPane().add(jlabOwnerName);

        jfrm.getContentPane().add(jtfNurseryName);
        jfrm.getContentPane().add(jlabNurseryName);

        jfrm.getContentPane().add(jtfTemper);
        jfrm.getContentPane().add(jlabTemper);

        jfrm.getContentPane().add(jlabWhat);
        jfrm.getContentPane().add(jbtnApply);

        jfrm.getContentPane().add(jlabUserInfo);

        // Display the frame.
        jfrm.setVisible(true);

    }


    /**
     * Обработчик нажатий клавиш.
     */
    public void actionPerformed(ActionEvent ie) {

        /**
         * Обработка выбора животного.
         */
        if (jrbCat.isSelected()) {
            jlabWhat.setText("Cat");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        } else if (jrbDog.isSelected()) {
            jlabWhat.setText("Dog");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        } else if (jrbFish.isSelected()) {
            jlabWhat.setText("Fish");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        } else if (jrbHorse.isSelected()) {
            jlabWhat.setText("Horse");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        } else if (jrbMouse.isSelected()) {
            jlabWhat.setText("Mouse");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        } else {
            jlabWhat.setText("Snake");
            animalFactory = Main.createAnimalBySpecies(jlabWhat.getText());
        }


    }

    /**
     * Проверка корректности ввода поля Size;
     *
     * @param str - Строка с размером.
     * @return true, если ввод корректен, либо строка пуста. false - если брошено исключение.
     */
    private boolean isStringInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return str.isEmpty();
        }
    }

    /**
     * Форматирование даты.
     */
    public class DateLabelFormatter extends JFormattedTextField.AbstractFormatter {

        private String datePattern = "dd-MM-yyyy";
        private SimpleDateFormat dateFormatter = new SimpleDateFormat(datePattern);

        @Override
        public Object stringToValue(String text) throws ParseException {
            return dateFormatter.parseObject(text);
        }

        @Override
        public String valueToString(Object value) {
            if (value != null) {
                Calendar cal = (Calendar) value;
                return dateFormatter.format(cal.getTime());
            }

            return "";
        }

    }
}