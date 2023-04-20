package exercises;

import java.util.Date;

public abstract class WildAnimal extends Animal {
    /**
     * Дикое животное
     *
     * @param height    Высота
     * @param weight    Вес
     * @param eyeColor  Цвет глаз
     * @param sound     Звук, который издаёт животное
     * @param wlHabitat Место обитания
     * @param fDate     Дата нахождения
     */
    public WildAnimal(Double height, Double weight, int eyeColor, String sound, String wlHabitat, Date fDate) {
        super(height, weight, eyeColor, sound);
        this.wlHabitat = wlHabitat;
        this.fDate = fDate;
    }

    public String getWlHabitat() {
        return wlHabitat;
    }

    public void setWlHabitat(String wlHabitat) {
        this.wlHabitat = wlHabitat;
    }

    public Date getfDate() {
        return fDate;
    }

    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    private String wlHabitat;
    private Date fDate;
}
