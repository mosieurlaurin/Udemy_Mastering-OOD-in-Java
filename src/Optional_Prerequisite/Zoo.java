package Optional_Prerequisite;

/**
 * Created by mosieurlaurin on 2015-06-12.
 */
public class Zoo {

    public static void main(String args[]){

        Animal blackSparrow1 = new Sparrow("Bob Sparrow", 1, 1, "dark");
        //blackSparrow1.move();

        Animal blueFish1 = new Fish("Bobfish", 1, 1, "grey");
        //blueFish1.move();

        moveAnimal(blueFish1);
        moveAnimal(blackSparrow1);

    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}