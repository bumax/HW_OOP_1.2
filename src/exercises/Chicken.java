package exercises;

public class Chicken extends Bird {
    /**
     * Курица
     *
     * @param height   Высота
     * @param weight   Вес
     * @param eyeColor Цвет глаз
     */
    public Chicken(Double height, Double weight, int eyeColor) {
        super(height, weight, eyeColor, "Cluck!", 0.0);
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Курицы (птицы)\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота = " + getHeight()
        );
    }

    @Override
    public void doFlight() {
        System.out.println("Chicken can't fly!");
    }
}
