package abstractMiniEx;

public class Magazines extends Media{
    private int price;

    public Magazines(String title, int year, int price) {
        super(title, year);
        this.price = price;
    }

    @Override
    public void read() {
        System.out.println("Reading: " + this.title + " (" + this.year + ")");
    }
}
