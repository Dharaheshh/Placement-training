
import java.util.*;

class undoredo {

    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();

    String text = "";

    void type(String s) {
        undoStack.push(text);     // save current state
        text += s;
        redoStack.clear();        // new edit kills redo history
    }

    void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        }
    }

    void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        }
    }

    void display() {
        System.out.println(text);
    }

    public static void main(String[] args) {

        undoredo editor = new undoredo();

        editor.type("Hello");
        editor.display();          // Hello

        editor.type(" World");
        editor.display();          // Hello World

        editor.type("!");
        editor.display();          // Hello World!

        editor.undo();
        editor.display();          // Hello World

        editor.undo();
        editor.display();          // Hello

        editor.redo();
        editor.display();          // Hello World
    }
}