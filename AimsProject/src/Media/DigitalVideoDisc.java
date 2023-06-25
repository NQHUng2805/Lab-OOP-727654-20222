package AimsProject.Media;

import AimsProject.Playable.Playable;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc() {
        super();
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, cost, length, director);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, cost,director);
    }
         
    @Override
    public String toString() {
        return "DVD: " + this.getTitle()
                + " - Category: " + this.getCategory()
                + " - Director: " + this.getDirector()
                + " - DVD length: " + this.getLength()
                + " - Cost: " + this.getCost() + "$";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public void play() {

        System.out.println("Playing DVD: " + this.getTitle());

        System.out.println("DVD length: " + this.getLength());

    }

}
