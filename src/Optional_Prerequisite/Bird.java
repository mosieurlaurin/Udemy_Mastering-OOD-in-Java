package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-12.
 */
public class Bird extends Animal {

    public Bird(String name, int age, int weightInPounds, String furColor) {
        super(name, age, weightInPounds, furColor);
    }

    public void move() {
        System.out.println("Flapping wings...");

    }

}
