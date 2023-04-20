package exercises;

import java.util.Date;

public class Dog extends Pet {
    /**
     * Собака
     *
     * @param height         Высота в холке
     * @param weight         Масса
     * @param eyeColor       Цвет глаз
     * @param name           Кличка
     * @param breed          Порода
     * @param isVaccinations Наличие вакцинации
     * @param coatColor      Цвет шерсти
     * @param bDate          Дата рождения
     * @param hasTraining    Наличие дрессировки
     */
    public Dog(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, int coatColor, Date bDate, boolean hasTraining) {
        super(height, weight, eyeColor, "woof-woof", name, breed, isVaccinations, coatColor, bDate);
        this.hasTraining = hasTraining;
    }

    public boolean isHasTraining() {
        return hasTraining;
    }

    private boolean hasTraining;

    public void doTrain() {
        if (!hasTraining)
            hasTraining = Math.random() > 0.3; // С вероятностью 70% дрессировка окончится удачей :-)
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Собаки (домашние животные)\n" +
                        "Имя = " + getName() + "\n" +
                        "Порода = " + getBreed() + "\n" +
                        "Дата рождения = " + getbDate() + "\n" +
                        "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                        "Цвет шерсти = " + getCoatColor() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight() + "\n" +
                        "Дрессировка = " + (hasTraining ? "есть" : "отсутствует")
        );
    }

    @Override
    public void showKindness() {
        System.out.println("Bark bark! 犬は骨が好き!");
    }
}
