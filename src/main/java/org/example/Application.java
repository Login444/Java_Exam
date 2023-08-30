package org.example;

import java.util.Scanner;

public class Application {
    public Scanner intInput = new Scanner(System.in);
    public Scanner stringInput = new Scanner(System.in);
    public AllToys allToys = new AllToys();
    public Giveaway giveaway = new Giveaway();

    public void start() {
        menu();
        int n = intInput.nextInt();
        while (n != 7) {
            if (n == 1) {
                allToys.addNewToy(createToy());
                allToys.saveToysToFile();
            }
            if (n == 2) {
                allToys.showAllToys();
            }
            if (n == 3) {
                addToyTogiveaway();
            }
            if (n == 4) {
                addAllToysToGiveaway();
            }
            if (n == 5) {
                giveaway.randomize();
            }
            if (n == 6) {
                giveaway.getPrize();
            }
            menu();
            n = intInput.nextInt();
        }
    }


    public void addToyTogiveaway(){
        System.out.println("Введите id игрушки которую нужно добавить к розыгрышу: ");
        int id = intInput.nextInt();
        for (Toy toy : allToys.toys) {
            if (toy.getToyId() == id){
                giveaway.addToy(toy);
            }
        }
    }

    public void addAllToysToGiveaway(){
        for (Toy toy : allToys.toys) {
            giveaway.addToy(toy);
        }
    }



    public void menu(){
        System.out.println("Выберите действие:" +
                "\n1.Создать игрушку" +
                "\n2.Показать все имеющиеся игрушки" +
                "\n3.Добавить одну игрушку к розыгрышу" +
                "\n4.Добавить все имеющиеся игрушки к розыгрышу" +
                "\n5.Разыграть игрушку" +
                "\n6.Забрать игрушку" +
                "\n7.Выход");
    }

    public Toy createToy(){
        System.out.println("Введите название игрушки: ");
        String newToyName = stringInput.nextLine();
        System.out.println("Введите количество игрушек на складе: ");
        Integer numberOfNewToys = intInput.nextInt();
        System.out.println("Введите вероятность выпадения игрушки: ");
        Integer dropProbOfNewToy = intInput.nextInt();
        Toy newToy = new Toy(newToyName, numberOfNewToys, dropProbOfNewToy);
        return newToy;
    }

}
