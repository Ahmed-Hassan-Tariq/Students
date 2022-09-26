public class Owner {
    private String firstName;
    private String lastName;
    private String contact;
    private int age;
    private String gender;

    public Owner(String firstName, String lastName, String contact, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.contact = contact;
        this.age = age;
        this.gender = gender;
    }

    public String getOwnerInfo(){
        return String.format("----------Owner Information----------" +
        "%nFirstName: %s%nLastName: %s%nContact: %s%nAge: %d%nGender: %s",
        this.firstName, this.lastName, this.contact, this.age, this.gender);
    }
}
