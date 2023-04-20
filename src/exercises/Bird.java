package exercises;

public abstract class Bird extends Animal {
    /**
     * Птицы
     *
     * @param height    Высота
     * @param weight    Вес
     * @param eyeColor  Цвет глаз
     * @param sound     Звук, который издаёт животное
     * @param flightAlt Высота полёта
     */
    public Bird(Double height, Double weight, int eyeColor, String sound, Double flightAlt) {
        super(height, weight, eyeColor, sound);
        this.flightAlt = flightAlt;
    }

    public Double getFlightAlt() {
        return flightAlt;
    }

    public void setFlightAlt(Double flightAlt) {
        this.flightAlt = flightAlt;
    }

    private Double flightAlt;

    public void doFlight() {
        if (flightAlt > 0)
            System.out.println("I'm flying at a height of " + flightAlt + " m above the ground!");
        else
            System.out.println("Too low!");
    }
}
