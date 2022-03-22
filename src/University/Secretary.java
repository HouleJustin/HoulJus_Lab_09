/*
 * Name: Justin Houle
 * Date: 2002/03/22
 * Description: Secretary class which assigns dates for the prof and its midterms
 */
package University;

import java.util.Date;
import java.util.Random;

/**
 * Secretary class which assigns dates for the prof and its midterms
 */
public class Secretary implements java.util.Observer{

    private Date date;
    private Random rn = new Random();

    /**
     * default constructor for Secretary class
     */
    public Secretary() {}

    /**
     * assigns the secretary to a prof as an observer to the prof
     *
     * @param p the professor
     */
    public void registerToProf(Prof p){
        p.addObserver(this);
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an Observable object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param   o     the observable object.
     * @param   arg   an argument passed to the <code>notifyObservers</code>
     *                 method.
     */
    public void update(java.util.Observable o, Object arg) {
        if(arg instanceof Integer){
            return;
        }
        else{
            date = (Date) arg;
            ((Prof) o).setRoomNumber(rn.nextInt(10)+1);
        }

    }
}
