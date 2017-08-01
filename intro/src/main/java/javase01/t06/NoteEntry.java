package javase01.t06;

public class NoteEntry {
    private String title;
    private String text;

    NoteEntry(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return this.title;
    }

    public String getText() {
        return this.text;
    }

    @Override
    public String toString(){
        return   "Note title: "
                + getTitle()
                + "  Note text: "
                + getText();
    }
}