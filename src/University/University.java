/*
 * Name: Justin Houle
 * Date: 2002/03/22
 * Description: main class used to test a small univeristy class
 */
package University;

import java.util.Date;

/**
 * main class used to test a small univeristy class
 */
public class University {

    /**
     * Main tests
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // a prof
        Prof p = new Prof("JBond");

        // a course
        Course c = new Course("CS317", p);

        // a secretary
        Secretary secretary = new Secretary();
        secretary.registerToProf(p);

        // create 4 students
        Student s1 = new Student("Kramer");
        Student s2 = new Student("Elaine");
        Student s3 = new Student("Jerry");
        Student s4 = new Student("George");

        // register all students to the course
        s1.registerToCourse(c);
        s2.registerToCourse(c);
        s3.registerToCourse(c);
        s4.registerToCourse(c);

        // set a date for the upcoming midterm
        p.setMidterm(new Date());

        // output all students that will be taking the midterm
        System.out.println("\n");
        for (int i = 0; i < p.studentsInMidterm().size(); i++) {
            System.out.println("Students in midterm: " + p.studentsInMidterm().get(i));
        }
    }
}
