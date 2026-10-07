import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int age;

    /**
     *
     * @param firstName
     * @param lastName
     * @param email
     * @param address
     * @param age
     */
    public Student(String firstName, String lastName, String email, String address, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public void chosse(){

        Scanner input = new Scanner(System.in);
        System.out.print(   "1. Add student     \n"     +
                            "2. Show student    \n"     +
                            "3. Search student  \n"     +
                            "4. Update student  \n"     +
                            "5. Add course      \n"     +
                            "6. Add grade       \n"     +
                            "7. Exit");

        switch(input.nextInt()){
            case 1 :
                input.nextLine();

                System.out.println("Enter student first name ");
                setFirstName(input.nextLine());

                System.out.println("Enter student last name ");
                setLastName(input.nextLine());

                System.out.println("Enter student email address ");
                setEmail(input.nextLine());

                System.out.println("Enter student address ");
                setAddress(input.nextLine());

                System.out.println("Enter student age ");
                setAge(input.nextInt());
            case 2 :
                

        }
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    /**
     * A setter method that control the age of a student
     * Print an error massege if the age is invalid
     * @param age the student's age
     */
    public void setAge(int age) {
        if(age >= 0 && age <= 150){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

}
