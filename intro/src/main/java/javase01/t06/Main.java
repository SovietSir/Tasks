package javase01.t06;

import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    private static final int SIZE = 3;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        NoteBook NoteBook = new NoteBook(SIZE);

        int index;
        String title;
        String text;

        while (true) {
            System.out.print( "1 - Add note\n" +
                                "2 - Remove note\n" +
                                "3 - Edit note title\n" +
                                "4 - Edit note text\n" +
                                "5 - Show all notes\n" +
                                "6 - Exit\n" +
                                "Choose action by number:");
            int action = valueOf(scanner.nextLine());
            switch (action) {
                case 1:
                    NoteBook.addNote(inputTitle(), inputText());
                    break;
                case 2:
                    NoteBook.removeNote(inputIndex ());
                    break;
                case 3:
                    if(NoteBook.checkIndex((index = inputIndex())))
                        NoteBook.editNoteTitle(index, inputTitle ());
                    break;
                case 4:
                    if(NoteBook.checkIndex((index = inputIndex())))
                        NoteBook.editNoteText(index, inputText ());
                    break;
                case 5:
                    NoteBook.showNotes();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Your choice is incorrect. Try again, please.");
                    break;
            }
        }
    }

    private static String inputTitle () {
        System.out.print("Input note title, please: ");
        return scanner.nextLine();
    }

    private static String inputText () {
        System.out.print("Input note text, please: ");
        return scanner.nextLine();
    }

    private static int inputIndex () {
        System.out.print("Input note index, please: ");
        return valueOf(scanner.nextLine());
    }
}
