/*
* Name: Justin Houle
* Date: 2002/03/22
* Description: Course class which creates a new course and assigns a prof to it
*/
package University;

/**
 * Course class which creates a new course and assigns a prof to it
 */
public class Course {

    private String name = null;
    private Prof prof = null;

    /**
     * Constructor for the course class
     * @param aName the name of the class
     * @param aProf the name of the prof
     */
    public Course(String aName, Prof aProf) {
        super();
        name = aName;
        prof = aProf;
    }

    /**
     * get the name of the class/course
     * @return the string value of the name of the course
     */
    public String getName() {
        return name;
    }

    /**
     * the name of the prof
     * @return the name of the prof
     */
    Prof getProf() {
        return prof;
    }
}
