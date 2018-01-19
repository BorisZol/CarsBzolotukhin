package ru.luxoft.dev018.carsbzolotukhin.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bzolotukhin on 19.01.2018.
 */

public class DummyCars extends Cars {

    private List<CarCard> elements = new ArrayList<>();

    public DummyCars(){
        CarCard carCard = new CarCard();

        carCard.setImg("Porsche");
        carCard.setModel("911");
        carCard.setPrice(135000);
        carCard.setWiki("http://en.wikipedia.org/wiki/Porsche_997");
        carCard.setImg("https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/997_Gen2_3.6_PDK.jpg/560px-997_Gen2_3.6_PDK.jpg");

        this.elements.add(carCard);
    }

}
