package exercises;

import java.util.Date;

public class Cat extends Pet {
    /**
     * Для кошек с шерстью
     *
     * @param height         Высота в холке
     * @param weight         Масса
     * @param eyeColor       Цвет глаз
     * @param name           Кличка
     * @param breed          Порода
     * @param isVaccinations Отметка о вакцинации
     * @param bDate          Дата рождения
     * @param coatColor      Цвет шерсти
     */
    public Cat(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, Date bDate, int coatColor) {
        super(height, weight, eyeColor, "meow", name, breed, isVaccinations, coatColor, bDate);
        isFluffy = true;
    }

    /**
     * Для лысых кисок
     *
     * @param height         Высота в холке
     * @param weight         Масса
     * @param eyeColor       Цвет глаз
     * @param name           Кличка
     * @param breed          Порода
     * @param isVaccinations Отметка о вакцинации
     * @param bDate          Дата рождения
     */
    public Cat(Double height, Double weight, int eyeColor, String name, String breed, boolean isVaccinations, Date bDate) {
        super(height, weight, eyeColor, "meow", name, breed, isVaccinations, 0, bDate);
        isFluffy = false;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Кошки (домашние животные)\n" +
                        "Имя = " + getName() + "\n" +
                        "Порода = " + getBreed() + "\n" +
                        "Дата рождения = " + getbDate() + "\n" +
                        "Вакцинация = " + (isVaccinations() ? "есть" : "отсутствует") + "\n" +
                        "Наличие шерсти = " + (isFluffy ? "есть\nЦвет шерсти = " + getCoatColor() : "отсутствует") + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight()
        );
    }

    @Override
    public void showKindness() {
        System.out.println("Purr purr! ハローキティ! ^^");
    }

    public boolean isFluffy() {
        return isFluffy;
    }

    private boolean isFluffy;

}
