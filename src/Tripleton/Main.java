/*
* Name: Justin Houle
* Date: 2022/03/29
* Description: Main class used to test the tripleton class
*/
package Tripleton;

/**
 * Main class used to test the tripleton class
 */
public class Main {

    /**
     * initialize tripletons and out put there address
     * @param args command line arguments
     */
    public static void main(String[] args){
        Tripleton instance1 = Tripleton.getInstance();
        Tripleton instance2 = Tripleton.getInstance();
        Tripleton instance3 = Tripleton.getInstance();
        Tripleton instance4 = Tripleton.getInstance();

        System.out.println("\nTest for initialization");
        System.out.println("instance 1: " + instance1);
        System.out.println("instance 2: " + instance2);
        System.out.println("instance 3: " + instance3);
        System.out.println("instance 4: " + instance4);


        System.out.println("\nTest for get Nth instance:");
        System.out.println("Get instance 1: " + Tripleton.getInstanceN(1));
        System.out.println("Get instance 2: " + Tripleton.getInstanceN(2));
        System.out.println("Get instance 3: " + Tripleton.getInstanceN(3));
        System.out.println("Get instance 4: " + Tripleton.getInstanceN(4));
    }
}
