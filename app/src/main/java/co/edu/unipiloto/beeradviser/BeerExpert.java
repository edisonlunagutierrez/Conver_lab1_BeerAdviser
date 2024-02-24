package co.edu.unipiloto.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color){
        List<String> beers = new ArrayList<>();

        switch (color){
            case "light":
                beers.add("Aguila light (Ligera)");
                beers.add("Aguila zero (Ligera)");
                break;
            case "amber":
                beers.add("Club roja (Rubia)");
                beers.add("Tecate (Rubia)");
                break;
            case "brown":
                beers.add("Club trigo (Oscura)");
                beers.add("Poker (Oscura)");
                break;
            case "dark":
                beers.add("Club negra (Negra)");
                beers.add("Leona (Negra)");
                break;
        }
        return beers;
    }
}
