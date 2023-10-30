package com.example.carslist;
import javafx.collections.ObservableList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Car {
    String name, color, speed;
    public Car(String name, String color, String speed) {
        this.name = name;
        this.color = color;
        this.speed = speed;
    }

    static ArrayList<Car> cars = new ArrayList<>();

    public static ArrayList<Car> getCars() {
        return cars;
    }

    public static void loadFromFile() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("carslist"));
        for (String s: lines) {
            String[] words = s.split(" ");
            Car cat = new Car(words[0], words[1], words[2]);
            cars.add(cat);
        }
        System.out.println(cars);
    }
}


