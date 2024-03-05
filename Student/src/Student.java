public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;
    private int index;


    public Student(String studentID, String studentName, int numberOfActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numberOfActivities];
    }
    // Getter and Setter
    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { this.studentID = studentID; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String[] getExtraActivities() {
        return extraActivities;
    }
    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities; }

    // Add extra Activity
    public void addExtraActivity(String activity) {
        this.extraActivities[index] = activity;;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID +
               ", Name: " + studentName +
               ", Activities: " + String.join(", ", extraActivities);
    }
}
