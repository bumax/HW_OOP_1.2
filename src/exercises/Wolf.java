package exercises;

import java.util.Date;

public class Wolf extends WildAnimal {
    /**
     * Волки
     *
     * @param height    Высота в холке
     * @param weight    Масса
     * @param eyeColor  Цвет глаз
     * @param wlHabitat Ареал обитания
     * @param fDate     Дата нахождения
     * @param isLeader  Вожак стаи?
     * @return
     */
    public Wolf(Double height, Double weight, int eyeColor, String wlHabitat, Date fDate, boolean isLeader) {
        super(height, weight, eyeColor, "Оu ou ouooooo!", wlHabitat, fDate);
        this.isLeader = isLeader;
    }

    @Override
    public void printInfo() {
        System.out.println(
                "Класс = Волки (дикие животные)\n" +
                        "Дата нахождения = " + getfDate() + "\n" +
                        "Ареал обитания = " + getWlHabitat() + "\n" +
                        "Цвет глаз = " + getEyeColor() + "\n" +
                        "Вес = " + getWeight() + "\n" +
                        "Высота в холке = " + getHeight() + "\n" +
                        "Вожак в стае = " + (isLeader ? "да" : "нет")
        );
    }

    public boolean isLeader() {
        return isLeader;
    }

    public void setLeader(boolean leader) {
        isLeader = leader;
    }

    private boolean isLeader;
}
