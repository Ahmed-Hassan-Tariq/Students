public class Person {

    private String firstName;
    private String lastName;

    private Date dob;


    public Person(String firstName, String lastName, Date dob){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String toString(){
        return ("First Name:" + this.firstName + " Last Name:" + this.lastName + " DOB:" + this.dob);
    }
}
