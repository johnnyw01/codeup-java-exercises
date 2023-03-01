package abstractMiniEx;

abstract public class Media {
    protected String title;
    protected int year;

    public Media(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void checkOut() {
        System.out.println("This " + this.getClass().getSimpleName()+ " is now checked out.");
    }

    public abstract void read();


}
