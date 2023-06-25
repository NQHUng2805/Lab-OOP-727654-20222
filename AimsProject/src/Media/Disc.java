package AimsProject.Media;

public class Disc extends Media {

    private int length;
    private String director;

    public Disc() {
        super();
    }

    public Disc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public Disc(String title, String category) {
        super(title, category);
    }

    public Disc(String title) {
        super(title);
    }

    public Disc(String title, int length, String director) {
        super(title);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, int length, String director) {
        super(title, category);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost, int length, String director) {
        super(title, category, cost);
        this.length = length;
        this.director = director;
    }

    public Disc(String title, String category, float cost, String director) {
        super(title, category, cost);
        this.director = director;
    }

    //getters
    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

}
