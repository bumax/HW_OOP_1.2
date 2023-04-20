package exercises;

import java.util.Date;

public class Tiger extends WildAnimal {
    /**
     * Тигры
     *
     * @param height    Высота в холке
     * @param weight    Масса
     * @param eyeColor  Цвет глаз
     * @param wlHabitat Ареал обитания
     * @param fDate     Дата нахождения
     */
    public Tiger(Double height, Double weight, int eyeColor, String wlHabitat, Date fDate) {
        super(height, weight, eyeColor, "grrr", wlHabitat, fDate);
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Тигры (дикие животные)\n" +
                        "Дата нахождения = " + getfDate() + "\n" +
                        "Ареал обитания = " + getWlHabitat() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight()
        );
    }
}
