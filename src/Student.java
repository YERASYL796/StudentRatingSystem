public class Student implements Comparable<Student> {
    private final String name;
    private final double gpa;
    private final int score;

    public Student(String name, double gpa, int score) {
        this.name = name;
        this.gpa = gpa;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString() {
        return name + " | GPA: " + gpa + " | Score: " + score;
    }
}