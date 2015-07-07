package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-12.
 */
public abstract class Animal {

    String name;
    int age;
    int weightInPounds;
    String furColor;

    public Animal(String name, int age, int weightInPounds, String furColor) {
        this.name = name;
        this.age = age;
        this.weightInPounds = weightInPounds;
        this.furColor = furColor;
    }

    public void describe(){
        System.out.println("This animal is a "+name);
        System.out.println("It is "+age + " years old!");
        System.out.println("It weights "+weightInPounds);
        System.out.println("Its fur is colored "+furColor);
    }

    public void sleep(){
        System.out.println("The "+name + " is sleeping now, shhh...");
    }

    public void eat(){
        System.out.println("Look, the "+name + " is eating!");
    }

    public abstract void move();
}
