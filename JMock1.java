class InvalidMarksException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid Marks !!!";
    }
}

class Student {
    int sid;
    String name;
    int marks;

    public Student(int sid, String name, int marks) throws InvalidMarksException {

        this.sid = sid;
        this.name = name;

        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException();
        }
        this.marks = marks;
    }
}

public class JMock1 {
    public static void main(String[] args) {
        try {
            Student s = new Student(101, "A", 70);
            System.out.println(s.sid + " " + s.name + " " + s.marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}