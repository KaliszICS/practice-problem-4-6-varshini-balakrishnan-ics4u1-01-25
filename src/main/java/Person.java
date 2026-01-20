class Person {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;
    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];

    }
    public String getFirstName() {
        return this.firstName;
    }
    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String setLastName(String lastName) {
        this.lastName = lastName;
        return this.lastName;
    }
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }
    public void addSibling(Person person) {
        Person[] newSiblings = new Person[this.siblings.length + 1];
        for (int i = 0; i < this.siblings.length; i ++) {
            newSiblings[i] = this.siblings[i];
        }
        newSiblings[newSiblings.length - 1] = person;
        this.siblings = newSiblings;
        this.numberOfSiblings++;
    }
    public Person[] getSiblings() {
        return this.siblings;
    }

}