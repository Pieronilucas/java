package pieroni.lucas.javacore.Modificadorfinal.domain;

public class Car {
    private String name;
    public static final double MAX_SPEED;
    public final Buyer BUYER = new Buyer();
    static {
        MAX_SPEED = 150;
    }

    public final void print(){
        System.out.println(this.name);
    }

    public Buyer getBUYER() {
        return BUYER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
