package javase01.t06;

import java.util.Arrays;

import static java.lang.Integer.*;

public class NoteBook {

    private int size;
    private int index = 0;
    private final int reSize = 10;
    private NoteEntry [] NoteBook;



    NoteBook(int size){
        NoteBook = new NoteEntry[size];
        this.size = size;
    }

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

    public void editNoteTitle(int index, String title) {
        if (checkIndex (index)) {
            NoteBook[index].setTitle(title);
            System.out.println("Note title successfully edited!");
        }
    }

    public void editNoteText(int index, String text) {
        if (checkIndex (index)) {
            NoteBook[index].setText(text);
            System.out.println("Note text successfully edited!");
        }
    }

    public void showNotes() {
        if(index == 0) {
            System.out.println("NoteBook is empty. Please, add note first.");
            return;
        }
        for(int i = 0; i < index; i++) {
            System.out.printf("Index: %d  %s%n", i, NoteBook[i]);
        }
    }

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
