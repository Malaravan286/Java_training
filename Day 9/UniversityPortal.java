interface PortalUser {
    void showDashboard();
}

class StudentUser implements PortalUser {
    public void showDashboard() {
        System.out.println("Student dashboard: view marks, attendance, and courses.");
    }
}

class FacultyUser implements PortalUser {
    public void showDashboard() {
        System.out.println("Faculty dashboard: upload marks and manage classes.");
    }
}

class AdminUser implements PortalUser {
    public void showDashboard() {
        System.out.println("Admin dashboard: manage users and announcements.");
    }
}

public class UniversityPortal {
    public static void main(String[] args) {
        PortalUser[] users = {
            new StudentUser(),
            new FacultyUser(),
            new AdminUser()
        };

        for (PortalUser user : users) {
            user.showDashboard();
        }
    }
}
