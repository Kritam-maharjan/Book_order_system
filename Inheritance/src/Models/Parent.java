package Models;

public class Parent extends G_parent{
    public String house = "Chhauni";
    int bankBalance = 1234;
    boolean married;

    public Parent(String caste, String house, int bankBalance, boolean married) {
        super(caste);
        this.house = house;
        this.bankBalance = bankBalance;
        this.married = married;
    }

}
