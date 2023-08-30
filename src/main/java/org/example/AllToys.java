package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


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

    public void saveToysToFile(){
        File file = new File("toys_in_market.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))){
            for (Toy toy : toys) {
                writer.write(toy.toString()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
