package Model;

public class Student {
    private String name;
    private String studentId;
    private double[] grades = new double[5];

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getStudentId() {
        return studentId;
    }
    public void setGrades(double grade, int index) {
        if (index >= 0 && index < grades.length) {
            this.grades[index] = grade;
        } else {

        }
    }
    public double getGrades(int index) {
        if (index >= 0 && index < grades.length) {
            return grades[index];
        } else {
            return 0;
        }
    }

    public double getAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public boolean isApproved() {
        return getAverage() >= 7;
    }
}
