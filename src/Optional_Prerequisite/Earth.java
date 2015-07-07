package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-12.
 */
public class Earth {

    public static void main(String args[]){

        Human human1 = new Human("bob", 17, 72, "green");
        Human human2 = new Human("robert", 12, 56, "brown");
        Human human3 = new Human("paul", 16, 55, "brown");

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
