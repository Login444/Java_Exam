package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * класс для розыгрыша игрушек
 */


public class Giveaway {
    public ArrayList<Toy> toysToWin = new ArrayList<>();
    public String[] arrForLottery = new String[10];
    public String prize;

    public Giveaway() {
    }

    /**
     * добавляем игрушки в список для розыгрыша
     * @param toy
     */
    public void addToy(Toy toy){
        this.toysToWin.add(toy);
    }

    /**
     * создаем массив с именами игрушек учавствующих в розыгрыше, где кол-во каждой игрушки пропорционально
     * вероятности её выпадения
     */
    public void getArrForLottery(){
        for (Toy toy : toysToWin) {
            int n = toy.getDropProbability() / 10;
            while (n != 0){
                Random random = new Random();
                int i = random.nextInt(10);
                while (this.arrForLottery[i] != null){
                    i = random.nextInt(10);
                }
                this.arrForLottery[i] = toy.getToyName();
                n--;
            }
        }
    }

    /**
     * случайным образом разыгрываем игрушку
     */
    public void randomPrize(){
        Random random = new Random();
        int n = random.nextInt(10);
        this.prize = this.arrForLottery[n];
    }
    //todo: придумать как сделать рандом с вероятностью по другому; что делать если вероятность выпадения 25%?

    /**
     * забираем выигранную игрушку и уменьшаем оставшееся кол-во таких игрушек
     */
    public void getPrize(){
        for (Toy toy : toysToWin) {
            if (toy.getToyName() == this.prize){
                toy.setNumberOfToys(toy.getNumberOfToys()-1);
            }
        }
        System.out.println("Поздравляем, Вы выиграли: " + this.prize);
    }


}
