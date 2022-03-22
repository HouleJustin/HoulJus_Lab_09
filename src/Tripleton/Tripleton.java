/*
 * Name: Justin Houle
 * Date: 2022/03/29
 * Description: Tripleton class
 */
package Tripleton;

/**
 * Tripleton class
 */
public class Tripleton {

    private static Tripleton firstInstance;
    private static Tripleton secondInstance;
    private static Tripleton thirdInstance;
    private static int instanceCounter = 1;

    /**
     * private constructor used to initialize a new tripleton
     */
    private Tripleton(){}

    /**
     * Create new tripleton classes and return them, if more than 3 instance are created then the 4th instance will be equal to the third instance.
     *
     * @return a tripleton
     */
    public static Tripleton getInstance() {
        if (instanceCounter == 1) {
            firstInstance = new Tripleton();
            instanceCounter++;
            return firstInstance;
        } else if (instanceCounter == 2) {
            secondInstance = new Tripleton();
            instanceCounter++;
            return secondInstance;
        } else {
            if (instanceCounter >= 4) {
                instanceCounter++;
                return thirdInstance;
            }
            thirdInstance = new Tripleton();
            instanceCounter++;
            return thirdInstance;
        }

    }

    /**
     * Gets a specific tripleton
     * @param n the specific tripleton to be returned
     * @return a tripleton
     */
    public static Tripleton getInstanceN(int n){
       if(n == 1){
           return firstInstance;
       }
       else if(n == 2){
           return secondInstance;
       }
       else
           if (n > 3){
           return thirdInstance;
       }
       return thirdInstance;
    }
}
