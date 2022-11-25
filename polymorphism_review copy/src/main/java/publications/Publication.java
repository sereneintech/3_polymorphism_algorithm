package publications;

import interfaces.ISell;

import java.util.ArrayList;

public abstract class Publication implements ISell {

    private String title;
    private int numberOfPages;
    private ArrayList<String> awards;

    public Publication(String title, int numberOfPages){
        this.title = title;
        this.numberOfPages =  numberOfPages;
        this.awards = new ArrayList<>();
    }

    public int countAwards(){
        return this.awards.size();
    }

    public int calculateMarkup(){
        return 10;
    }


    //Getters & Setters


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public ArrayList<String> getAwards() {
        return awards;
    }

    public void setAwards(ArrayList<String> awards) {
        this.awards = awards;
    }
}
