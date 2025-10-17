package student;

public class Person {
    private int id;
    private String lastName;
    private String firstName;
    private String phone;
    private String email;
    private static int numberOfPeople = 0;

    public Person() {}

    public Person(String lastName, String firstName, String phone, String email) {
        this.id = ++numberOfPeople;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return id + " " + lastName + " " + firstName + " " + phone + " " + email;
    }
}
