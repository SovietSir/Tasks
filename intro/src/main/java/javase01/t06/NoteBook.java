package javase01.t06;

import java.util.Arrays;

import static java.lang.Integer.*;

/**
 * NoteBook class for store NoteEntries
 */
public class NoteBook {


    /**
     * An array, that contains NoteEntries.
     */
    private NoteEntry [] NoteBook;
    private int size;
    private int index = 0;
    private final int reSize = 10;


    /**
     * Initializes a newly created NoteBook with {@code size} parameter.
     *
     * @param size The initial value of the {@code size} field
     */
    NoteBook(int size){
        this.size = size;
        NoteBook = new NoteEntry[size];
    }

    /**
     * Method adds new NoteEntry, initialized by <code>String</code> title
     * and <code>String</code> text parameters into NoteBook. Position of new entry assigns by index variable.
     * @param title to be stored
     * @param text to be stored
     */
    public void addNote(String title, String text) {
        if (index == MAX_VALUE) {
            System.out.println("NoteBook is full. Please, delete note first.");
            return;
        }
        NoteBook[index++] = new NoteEntry(title, text);
        System.out.println("Note successfully added!");
        if (index == size)
            expandNoteBook();
    }

    /**
     * Method removes NoteEntry on <code>int</code> index position in NoteBook array
     * @param index specifying position of removed NoteEntry in NoteBook array
     */
    public void removeNote(int index) {
        if (checkIndex (index)) {
            for (int i = index; i < this.index; i++) {
                NoteBook[i] = NoteBook[i + 1];
            }
            this.index--;
            NoteBook[this.index] = null;
            System.out.println("Note successfully removed!");
        }
    }

    /**
     * Method edits NoteEntry <code>String</code> title on <code>int</code> index position in NoteBook array
     * @param index specifying position of edited NoteEntry in NoteBook array
     * @param title to be replaced in NoteEntry
     */
    public void editNoteTitle(int index, String title) {
        if (checkIndex (index)) {
            NoteBook[index].setTitle(title);
            System.out.println("Note title successfully edited!");
        }
    }

    /**
     * Method edits NoteEntry <code>String</code> text on <code>int</code> index position in NoteBook array
     * @param index specifying position of edited NoteEntry in NoteBook array
     * @param text to be replaced in NoteEntry
     */
    public void editNoteText(int index, String text) {
        if (checkIndex (index)) {
            NoteBook[index].setText(text);
            System.out.println("Note text successfully edited!");
        }
    }

    /**
     * Method outputs all NoteEntries in NoteBook in a textual form
     */
    public void showNotes() {
        if(index == 0) {
            System.out.println("NoteBook is empty. Please, add note first.");
            return;
        }
        for(int i = 0; i < index; i++) {
            System.out.printf("Index: %d  %s%n", i, NoteBook[i]);
        }
    }
    /**
     * Method checks that <code>int</code> index is inside of NoteBook array scope
     * @param index specifying checking index
     */
    public boolean checkIndex (int index) {
        if (index < 0 || index >= this.index) {
            System.out.println("Note with that index not found. Please, enter correct index.");
            return false;
        }
        return true;
    }

    private void expandNoteBook (){
        if (MAX_VALUE - size > reSize)
            size += reSize;
        else
            size = MAX_VALUE;
        NoteBook = Arrays.copyOf(NoteBook, size);
    }

}
