package author.poem;

/**
 * Author model
 *
 * @author Vinod John
 * @Date 17.12.2023
 */
public class Author {
    private String surname;
    private String nationality;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
