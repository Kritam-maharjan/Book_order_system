package Models;

public class Daughter extends Parent{
    public String name ;

    public Daughter(String caste, String house, int bankBalance, boolean married, String name) {
        super(caste, house, bankBalance, married);
        this.name = name;
    }
}
