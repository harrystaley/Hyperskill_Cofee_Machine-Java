class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = java.util.Objects.requireNonNullElse(firstName, "");
    }

    public void setLastName(String lastName) {
        this.lastName = java.util.Objects.requireNonNullElse(lastName, "");
    }

    public String getFullName() {
        if (java.util.Objects.equals(firstName, "") & java.util.Objects.equals(lastName, "")) {
            return "Unknown";
        } else {
            return (firstName + " " + lastName).trim();
        }
    }
}