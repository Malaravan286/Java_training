import java.util.LinkedList;

class CourseRegistration {
    String studentName;
    String courseName;

    CourseRegistration(String studentName, String courseName) {
        this.studentName = studentName;
        this.courseName = courseName;
    }
}

public class UniversityCourseRegistration {
    public static void main(String[] args) {
        LinkedList<CourseRegistration> registrations = new LinkedList<CourseRegistration>();

        registrations.add(new CourseRegistration("Anu", "Java"));
        registrations.add(new CourseRegistration("Bala", "Data Structures"));
        registrations.addFirst(new CourseRegistration("Class Representative", "Java"));

        for (CourseRegistration registration : registrations) {
            System.out.println(registration.studentName + " registered for " + registration.courseName);
        }
    }
}
