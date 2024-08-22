package functionDemo;

public class Employe {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private int age;

    public String getMobileNo() {
        return this.mobileNo=mobileNo;
    }

    public int getAge() {
        return this.age=age;
    }

    public String getFirstName() {
        return this.firstName=firstName;
    }

    public String getLastName() {
        return this.lastName=lastName;
    }


    public Employe(String firstName, String lastName, String mobileNo, int age) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.age=age;
    }


}





