import com.softwareengineering.assignment1.Student;
import com.softwareengineering.assignment1.Module;
import com.softwareengineering.assignment1.CourseProgramme;

public class StudentDriver {
    private static Student John, Jack, Sarah, Tom, Rachel;
    private static Module CT101, CT205, BS491, SC103, SC164, AT527, NS510;
    private static CourseProgramme CSIT, COMM, SCI, ARTS, NURS;

    public static void main(String[] args) {
        // Add New Courses, with Start Date and End Date
        newCourses();
        // Add New Modules and Module Code
        newModules();
        // Add Students for Test
        registerStudents();
        // Add Related Modules to Courses
        addModuleToCourse();

        // Print Courses and Related Modules
        courseAndModules(CSIT);
        courseAndModules(COMM);
        courseAndModules(SCI);
        courseAndModules(ARTS);
        courseAndModules(NURS);

        // Print Student Details, including Username and Registered Course
        studentDetails(John);
        studentDetails(Jack);
        studentDetails(Sarah);
        studentDetails(Tom);
        studentDetails(Rachel);
    }

    private static void newCourses() {
        CSIT = new CourseProgramme("CSIT", 31, 8, 2017, 1, 6, 2021);
        COMM = new CourseProgramme("Commerce", 31, 8, 2017, 1, 6, 2020);
        SCI = new CourseProgramme("Science", 31, 8, 2017, 1, 6, 2020);
        ARTS = new CourseProgramme("Arts", 31, 8, 2017, 1, 6, 2020);
        NURS = new CourseProgramme("Nursing", 24, 8, 2017, 30, 6, 2022);
    }

    private static void newModules() {
        CT101 = new Module("Introduction to Programming", "101");
        CT205 = new Module("Software Engineering", "205");
        BS491 = new Module("International Business", "491");
        SC103 = new Module("Biology", "103");
        SC164 = new Module("Physics", "164");
        AT527 = new Module("Psychology", "527");
        NS510 = new Module("Nursing Introduction", "510");
    }

    private static void registerStudents() {
        John = new Student("JohnSmith", 00001, 21, 5, 2002, CSIT);
        Jack = new Student("JackSparrow", 00002, 4, 7, 1998, COMM);
        Sarah = new Student("SarahPalin", 00003, 31, 01, 1994, SCI);
        Tom = new Student("TomJones", 00004, 5, 12, 2000, ARTS);
        Rachel = new Student("RachelGreen", 00005, 16, 3, 1999, NURS);
    }

    private static void addModuleToCourse() {
        CSIT.addModules(CT101);
        CSIT.addModules(CT205);
        COMM.addModules(BS491);
        SCI.addModules(SC103);
        SCI.addModules(SC164);
        ARTS.addModules(AT527);
        NURS.addModules(NS510);
    }

    private static void courseAndModules(CourseProgramme course) {
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Registered Modules: ");
        for (Module element : course.getModuleList()) {
            System.out.println(element.getModuleID() + ": " + element.getModuleName());
        }
        System.out.println("\n");
    }

    private static void studentDetails(Student student) {
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Username: " + student.getUsername());
        System.out.println("Course: " + student.getCourse().getCourseName());
        System.out.println("Modules: ");
        for (Module element : student.getModules()) {
            System.out.println(element.getModuleName());
        }
        System.out.println("\n");
    }
}
