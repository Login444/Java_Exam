package org.example;

public class Toy {
    private static Integer count = 0;
    private Integer toyId = 0; // id игрушки
    public String toyName; // название игрушки
    public Integer numberOfToys; // колличество указанных игрушек
    public Integer dropProbability; // вероятность выпадения игрушки

    public Toy() {
    }

    public Toy(String toyName, Integer numberOfToys, Integer dropProbability) {
        this.toyId = count++; // автоматически присваиваем id
        this.toyName = toyName;
        this.numberOfToys = numberOfToys;
        this.dropProbability = dropProbability;
    }

    public Integer getToyId() {
        return toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public Integer getNumberOfToys() {
        return numberOfToys;
    }

    public void setNumberOfToys(Integer numberOfToys) {
        this.numberOfToys = numberOfToys;
    }

    public Integer getDropProbability() {
        return dropProbability;
    }

    public void setDropProbability(Integer dropProbability) {
        this.dropProbability = dropProbability;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyId=" + toyId +
                ", toyName='" + toyName + '\'' +
                ", numberOfToys=" + numberOfToys +
                ", dropProbability=" + dropProbability +
                '}';
    }
}
