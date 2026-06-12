import java.util.Scanner;

public class OnlineExaminationSystem {
    interface ExamModule {
        void start(String value);
    }

    static class PracticeExam implements ExamModule {
        public void start(String value) {
            System.out.println("Starting practice exam for " + value);
        }
    }

    static class MockExam implements ExamModule {
        public void start(String value) {
            System.out.println("Starting mock exam for " + value);
        }
    }

    static class FinalExam implements ExamModule {
        public void start(String value) {
            System.out.println("Starting final exam for " + value);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student: ");
        String student = scanner.nextLine();

        // Interface reference stores different implementations for runtime polymorphism.
        ExamModule[] services = {new PracticeExam(), new MockExam(), new FinalExam()};
        services[0].start(student);
        services[1].start(student);
        services[2].start(student);
        scanner.close();
    }
}
