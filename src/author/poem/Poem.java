package author.poem;

/**
 * Poem model
 *
 * @author Vinod John
 * @Date 17.12.2023
 */
public class Poem {
    private Author creator;
    private int stropheNumbers;

    public Author getCreator() {
        return creator;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setStropheNumbers(int stropheNumbers) {
        this.stropheNumbers = stropheNumbers;
    }
}
