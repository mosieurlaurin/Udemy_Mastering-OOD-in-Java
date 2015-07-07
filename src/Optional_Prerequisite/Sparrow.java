package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-24.
 */
public class Sparrow extends Bird implements Flyable {

    public Sparrow(String name, int age, int weightInPounds, String furColor) {
        super(name, age, weightInPounds, furColor);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
