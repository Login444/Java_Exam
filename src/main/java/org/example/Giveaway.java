package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

/**
 * класс для розыгрыша игрушек
 */


public class Giveaway {
    public ArrayList<Toy> toysToWin = new ArrayList<>();
    public int prize;
    public Map <Date, String> winner = new HashMap<>();

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
     * метод для розыгрыша игрушки с учетом шанса её выпадения
     */
    public void randomize(){
        int[] ids = new int[toysToWin.size()];
        int[] chance = new int[toysToWin.size()];
        for (int i = 0; i < toysToWin.size(); i++) {
            ids[i] = toysToWin.get(i).getToyId();
            chance[i] = toysToWin.get(i).getDropProbability();
        }


        int count = IntStream.of(chance).sum();

        Random random = new Random();

        int index = random.nextInt(count);

        for (int i = 0; i < chance.length; i++){
            index -= chance[i];
            if (index < 0){
                this.prize = ids[i];
                break;
            }
        }
    }

    /**
     * забираем выигранную игрушку и уменьшаем оставшееся кол-во таких игрушек
     */
    public void getPrize(){
        Date date = new Date();
        String prizeName = null;
        for (Toy toy : toysToWin) {
            if (toy.getToyId() == this.prize){
                toy.setNumberOfToys(toy.getNumberOfToys()-1);
                prizeName = toy.getToyName();
            }
        }
        System.out.println("Поздравляем, Вы выиграли: " + prizeName);
        winner.put(date, prizeName);
        saveWinnerToFile();
    }

    public void saveWinnerToFile(){
        File file = new File("All_prizes.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))){
            for (Map.Entry<Date, String> entry : winner.entrySet()) {
                writer.write(entry.toString()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
