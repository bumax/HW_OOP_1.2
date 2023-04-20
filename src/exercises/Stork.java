package exercises;

public class Stork extends Bird {
    /**
     * Аист
     *
     * @param height    Высота
     * @param weight    Вес
     * @param eyeColor  Цвет глаз
     * @param flightAlt Высота полёта
     */
    public Stork(Double height, Double weight, int eyeColor, Double flightAlt) {
        super(height, weight, eyeColor, "%like a rusty door%", flightAlt);
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Аист (птицы)\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота = " + getHeight() + "\n" +
                        "Высота полёта = " + getFlightAlt()
        );
    }
}
