import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Student extends Person {
    private static int indexCounter = 1;
    private String indexNumber;
    private StudyProgramme programme;
    private int currentSemester;
    private String status;
    private Map<String, Integer> grades;
    private int itns;

    public Student(String firstName, String lastName, String email, String address, String phoneNumber, Date birthDate) {
        super(firstName, lastName, email, address, phoneNumber, birthDate);
        this.indexNumber = "s" + indexCounter++;
        this.status = "Candidate";
        this.grades = new HashMap<>();
        this.itns = 0;
    }

    public Student(String john, String doe, String mail, String address, String phoneNumber, Date date) {
        super();
    }

    public void enrollStudent(StudyProgramme programme) {
        this.programme = programme;
        this.currentSemester = 1;
        this.status = "Student";
    }

    public void addGrade(int grade, String subject) {
        grades.put(subject, grade);
        if (grade < 3) {
            itns++;
        }
    }

    public void promoteToNextSemester() {
        if (currentSemester < programme.getNumberOfSemesters() && itns <= programme.getAllowedITNs()) {
            currentSemester++;
            if (currentSemester == programme.getNumberOfSemesters()) {
                status = "Graduate";
            }
        }
    }


    public String getIndexNumber() {
        return indexNumber;
    }

    public StudyProgramme getProgramme() {
        return programme;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public String getStatus() {
        return status;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public int getItns() {
        return itns;
    }
}
