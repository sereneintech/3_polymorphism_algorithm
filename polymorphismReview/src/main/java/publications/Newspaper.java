package publications;

import java.util.ArrayList;

public class Newspaper extends Publication{

    private ArrayList<String> sections;
    private String proprietor;

    public Newspaper(String title, int numberOfPages, String proprietor){
        super(title, numberOfPages);
        this.proprietor = proprietor;
        this.sections = new ArrayList<>();
    }

    public String getCrossWordSolution(){
        return "1 across was really hard!";
    }

    public int calculateMarkup(boolean isSundayEdition){
//        if (isSundayEdition == true){
//            return 5;
//        } else {
//            return 10;
//        }

        return isSundayEdition ? 5 : 10;
    }



    public ArrayList<String> getSections() {
        return sections;
    }

    public void setSections(ArrayList<String> sections) {
        this.sections = sections;
    }

    public String getProprietor() {
        return proprietor;
    }

    public void setProprietor(String proprietor) {
        this.proprietor = proprietor;
    }
}
