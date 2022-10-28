public class GradeGetter {

    // no-parameter constructor
    public GradeGetter() { }

    public String letterGrade(int score) {
        String grade = "Z";
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 60) {
            grade = "F";
        }
        return grade;
    }
}