package Models;

public class Son extends Parent{
    public String name ;

    public Son(String caste, String house, int bankBalance, boolean married, String name) {
        super(caste, house, bankBalance, married);
        this.name = name;
    }
}
