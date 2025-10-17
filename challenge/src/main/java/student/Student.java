package student;

public class Student extends Person {
    private String cne;
    private String studentID;
    private Major major;
    private static int nextId = 1;

    public Student(String lastName, String firstName, String phone, String email, String cne, Major major) {
        super(lastName, firstName, phone, email);
        this.cne = cne;
        this.studentID = "ST" + nextId++;
        this.major = major;
        major.addStudent(this);
    }

    public String getCne() { return cne; }
    public Major getMajor() { return major; }

    public String getFullFormatted() {
        return getLastName().toUpperCase() + ", " +
                getFirstName().substring(0,1).toUpperCase() +
                getFirstName().substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return studentID + " " + getFullFormatted();
    }
}
