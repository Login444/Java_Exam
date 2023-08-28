package org.example;


public class Main {
    public static void main(String[] args) {
        Giveaway giveaway = new Giveaway();
        Toy toy1 = new Toy("Soldier", 10, 34);
        Toy toy2 = new Toy("Barbie", 5, 33);
        Toy toy3 = new Toy("Car", 10, 33);


        giveaway.addToy(toy1);
        giveaway.addToy(toy2);
        giveaway.addToy(toy3);

        giveaway.randomize();

        System.out.println(toy1.toString()+"\n"+toy2.toString()+"\n"+toy3.toString());


        giveaway.getPrize();

        System.out.println(toy1.toString()+"\n"+toy2.toString()+"\n"+toy3.toString());

        // TODO: 28.08.2023 сделать меню, сделать возможность добавления игрушек к розыгрышу группой, следовать принципам ООП

    }
}