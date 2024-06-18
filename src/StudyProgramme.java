public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int allowedITNs;

    public StudyProgramme(String name, String description, int numberOfSemesters, int allowedITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.allowedITNs = allowedITNs;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getAllowedITNs() {
        return allowedITNs;
    }
}
