package pieroni.lucas.javacore.Modificadorfinal.domain;

public class Buyer {
    private String nameBuyer;

    @Override
    public String toString() {
        return "Buyer [nameBuyer=" + nameBuyer + "]";
    }

    public String getNameBuyer() {
        return nameBuyer;
    }

    public void setNameBuyer(String nameBuyer) {
        this.nameBuyer = nameBuyer;
    }
}
