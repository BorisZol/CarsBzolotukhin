package ru.luxoft.dev018.carsbzolotukhin.model;

/**
 * Created by bzolotukhin on 19.01.2018.
 */

public class CarCard {

    /***data example***

     "{
     "manufacturer": "Porsche",
     "model": "911",
     "price": 135000,
     "wiki": "http://en.wikipedia.org/wiki/Porsche_997",
     "img": "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/997_Gen2_3.6_PDK.jpg/560px-997_Gen2_3.6_PDK.jpg"

     from handyaudit.ru/cars.json
     }*/

    private String manufacturer;
    private String model;
    private int price;
    private String wiki;
    private String img;


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getWiki() {
        return wiki;
    }

    public void setWiki(String wiki) {
        this.wiki = wiki;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

}
