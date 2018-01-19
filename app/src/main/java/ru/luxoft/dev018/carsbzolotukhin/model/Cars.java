package ru.luxoft.dev018.carsbzolotukhin.model;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by bzolotukhin on 19.01.2018.
 */

public class Cars {

    private List<CarCard> elements = new ArrayList<>();

    public List<CarCard> getElements() {
        return elements;
    }

    public void setElements(List<CarCard> elements) {
        this.elements = elements;
    }
}
