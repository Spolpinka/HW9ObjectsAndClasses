public class Author {
    private String firstName; //имя автора
    private String lastName; // фамилия автора

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString (){
        return this.getFirstName() + " " + this.getLastName();
    }
    public boolean equals(Author author) {
        if (this == author) return true;
        if (author == null || getClass() != author.getClass()) return false;
        Author author1 = (Author) author;
        return (firstName == author1.firstName) && (lastName == author1.lastName);
    }
@Override
    public int hashCode (){
        int result = firstName == null ? 0 : firstName.hashCode();
        result = result * 31 + (lastName == null ? 0 : lastName.hashCode());
        return result;
    }
}
