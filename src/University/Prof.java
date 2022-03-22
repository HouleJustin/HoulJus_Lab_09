/*
 * Name: Justin Houle
 * Date: 2002/03/22
 * Description: Prof class which extends the observable superclass
 */
package University;
import java.util.ArrayList;
import java.util.Date;
import java.util.Observer;

/**
 * Prof class which extends the observable superclass
 */
public class Prof extends java.util.Observable {
    private String name = null;
    private Integer roomNumber;
    private Date midterm= null; // a bit artifical admittedly
    private ArrayList<Observer> pupiles = new ArrayList<>();

    /**
     * initialize a new prof with his/her name
     * @param aName the name of the prof
     */
    public Prof(String aName) {
        super();
        name = aName;
    }

    /**
     * obtain the date for the upcoming midterm
     *
     * @return the date of the midterm
     */
    public Date getMidterm() {
        return midterm;
    }

    /**
     * Get the name of the prof
     * @return the string value of the prof's name
     */
    public String getName() {
        return name;
    }

    /**
     * set the date for the upcomming midterm and update the students
     * @param date the date of the upcoming midterm
     */
    public void setMidterm(Date date) {
        midterm = date;
        // see why it is useful to have getters and setters!
        // we can now notify observers of the change
        setChanged();
        notifyObservers( date );
    }

    /**
     * Set the loctaion of the upcoming midterm and update the students
     * @param roomNum the rooms loctaion
     */
    public void setRoomNumber(int roomNum) {
        roomNumber = (Integer) roomNum;
        // see why it is useful to have getters and setters!
        // we can now notify observers of the change
        setChanged();
        notifyObservers( roomNumber );
    }

    /**
     * adds a student to the list of students that will take the exam
     *
     * @param student the students taking the exam
     */
    public void takingMidterm(Observer student){
        pupiles.add(student);
    }

    /**
     * a list of all students taking the exam
     * @return the list of all students taking the exam
     */
    public ArrayList<Observer> studentsInMidterm(){
            return pupiles;
    }

}


