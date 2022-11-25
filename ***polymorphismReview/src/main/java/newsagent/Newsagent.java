package newsagent;

import interfaces.ISell;
import publications.Publication;

import java.util.ArrayList;

public class Newsagent {

    private ArrayList<ISell> stock;

    public Newsagent(){
        this.stock = new ArrayList<>();
    }

    public void addItemToStock(ISell publication){
        this.stock.add(publication);
    }

}
