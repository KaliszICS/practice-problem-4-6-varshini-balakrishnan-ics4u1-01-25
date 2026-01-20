class Person {
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;
    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];

    }
    public String getFirstname() {
        return this.firstname;
    }
    public String setFirstname(String firstname) {
        this.firstname = firstname;
        return this.firstname;
    }
    public String getLastname() {
        return this.lastname;
    }
    public String setLastname(String lastname) {
        this.lastname = lastname;
        return this.lastname;
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