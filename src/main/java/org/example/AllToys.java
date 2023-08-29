package org.example;

import java.util.ArrayList;
import java.util.Scanner;


public class AllToys {
    public ArrayList<Toy> toys = new ArrayList<>();


    public AllToys() {
    }



    public void addNewToy(Toy toy){
        this.toys.add(toy);
    }

    public void showAllToys(){
        for (Toy toy : toys) {
            System.out.println(toy.toString()+"\n");
        }
    }
}
