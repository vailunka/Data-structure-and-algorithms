package oy.tol.tra;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    // TODO: Implement equals(), hashCode() and Comparable interface.
    @Override
    public boolean equals(Object other){
        if(other instanceof Person){
            return this.getFullName().equals(((Person)other).getFullName());
        }
        return false;
    }
    @Override
    public int compareTo(Person other){
        return this.getFullName().compareTo(other.getFullName());
        
    }
    @Override
    public int hashCode(){
        int hash = 5381;
        for(int i = 0; i < getFullName().length(); i++){
            hash = ((hash << 3) + hash) + getFullName().charAt(i);
        }
        return hash;
    }
}
