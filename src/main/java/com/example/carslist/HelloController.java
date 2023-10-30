package com.example.carslist;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class HelloController {
    ObservableList<Car> carlist;
    @FXML
    private ListView<Car> list;

    public void initialize() throws IOException {
        Car.loadFromFile();
        list.setItems(Car.loadFromFile());
        list.setItems(Car.loadFromFile());
    }
}