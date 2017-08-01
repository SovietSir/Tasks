package javase01.t06;

/**
 * NoteEntry which you can store in NoteBook
 *
 * <p><code>title</code> field, stores title of note</p>
 * <p><code>text</code> field, stores text of note</p>
 */
public class NoteEntry {
    private String title;
    private String text;

    /**
     * Initializes a newly created  object with a two string parameters.
     *
     * @param title The initial value of the {@code title} field
     * @param text The initial value of the {@code text} field
     */
    NoteEntry(String title, String text) {
        this.title = title;
        this.text = text;
    }

    /**
     * Method stores <code>String</code> note title in title field
     *
     * @param title to be stored
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Method stores <code>String</code> note text in text field
     *
     * @param text to be stored
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Method returns stored note title
     *
     * @return <code>String title</code>
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Method returns stored note text
     *
     * @return <code>String text</code>
     */
    public String getText() {
        return this.text;
    }

    /**
     * Method returns stored note in a textual form
     *
     * @return <code>String note</code>
     */
    @Override
    public String toString(){
        return   "Note title: "
                + getTitle()
                + "  Note text: "
                + getText();
    }
}