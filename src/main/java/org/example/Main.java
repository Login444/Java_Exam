package org.example;


public class Main {
    public static void main(String[] args) {
        Giveaway giveaway = new Giveaway();
        Toy toy1 = new Toy(1, "Soldier", 10, 20);
        Toy toy2 = new Toy(2, "Barbie", 5, 20);
        Toy toy3 = new Toy(3, "Car", 10, 60);


        giveaway.addToy(toy1);
        giveaway.addToy(toy2);
        giveaway.addToy(toy3);

        giveaway.getArrForLottery();
        giveaway.randomPrize();
        giveaway.getPrize();

        //todo: доделать полноценную программу (меню, запись результатов в файл, принципы ООП

    }
}