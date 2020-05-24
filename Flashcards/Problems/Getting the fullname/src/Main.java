class User {
    
    private String firstName;
    private String lastName;

    public static void main(String[] args) {
//        User tim = new User();
//        tim.setFirstName("Tim");
//        tim.setLastName("Towler");
//        System.out.println(tim.getFullName());
//        // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());
        // Katie (without additional spaces)
    }

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
        if (firstName == null) {
            this.firstName = "";
        } else {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName == null) {
            this.lastName = "";
        } else {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.length() < 1 && lastName.length() < 1) {
            return "Unknown";
        } else if (firstName.length() < 1) {
            return lastName;
        } else if (lastName.length() < 1) {
            return firstName;
        } else {
            return firstName + " " + lastName;
        }
    }
}
