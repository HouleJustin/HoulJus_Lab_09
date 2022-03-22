/*
 * Name: Justin Houle
 * Date: 2002/03/22
 * Description: Student class which observe the prof class
 */
package University;

/**
 * Student class which observe the prof
 */
public class Student implements java.util.Observer {
    String name = null;
    Course course = null; //assuming one course for simplicity's sake
    Integer roomNumber;

    /**
     * initialize a new student to the university
     *
     * @param aName the name of that student
     */
    public Student(String aName) {
        super();
        name = aName;
    }

    /**
     * get the name of the student
     *
     * @return the string value of the students name
     */
    String getName() {
        return name;
    }

    /**
     * Adds the student to the course
     *
     * @param aCourse the course that the student will join
     */
    public void registerToCourse(Course aCourse) {
        course = aCourse;
        course.getProf().addObserver(this);
    }

    /**
     * Overrides the superclass "toString()" from java methods.
     *
     * @return The string of students taking the exam.
     */
    @Override
    public String toString() {
        return this.name;
    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an Observable object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     *            method.
     */
    public void update(java.util.Observable o, Object arg) {
        if (arg instanceof Integer) {
            roomNumber = (Integer) arg;
            System.out.println("Student " + name + " has a midterm in room number: " + roomNumber);
            return;
        }
        System.out.println("Student " + name + " says  ..Doh got it dude!");
        System.out.println(((Prof) o).getName() + " says " + arg);
        ((Prof) o).takingMidterm(this);
    }
}
