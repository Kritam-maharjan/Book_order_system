package Modules;

public class Mammals {
   public int Chamber = 4;
   public boolean Hairbody = true;
   public String spicies;

    public Mammals(String spicies) {
        this.spicies = spicies;
    }

    public void Greeting() {
        System.out.println("Hello, I'm this " + this.spicies);
    }
}
