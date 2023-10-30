package com.example.carslist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    ObservableList<Car> carlist = FXCollections.observableArrayList();
    @FXML
    private ListView<Car> list;
    static ArrayList<Car> cars = new ArrayList<>();
    public  ArrayList<Car> getCars() {
        return cars;
    }

    public void initialize() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("carslist"));
        for (String s : lines) {
            String[] word = s.split(" ");
            Car cat = new Car(word[0], word[1], word[2]);
            carlist.add(cat);

        }
        list.setItems(carlist);

    }
}