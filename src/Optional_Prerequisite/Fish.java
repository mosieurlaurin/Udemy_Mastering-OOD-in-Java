package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-12.
 */
public class Fish extends Animal {

    public Fish(String name, int age, int weightInPounds, String furColor) {
        super(name, age, weightInPounds, furColor);
    }

    public void move() {
        System.out.println("Swimming...");

    }

    public void swim(){
        System.out.println("The fish is swimming in the water.");
    }


}
