package org.example;

public class Toy {
    private Integer toyId; // id игрушки
    public String toyName; // название игрушки
    public Integer numberOfToys; // колличество указанных игрушек
    public Integer dropProbability; // вероятность выпадения игрушки

    //todo: Сделать автоматическое присваивание id игрушке.

    public Toy() {
    }

    public Toy(Integer toyId, String toyName, Integer numberOfToys, Integer dropProbability) {
        this.toyId = toyId;
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
