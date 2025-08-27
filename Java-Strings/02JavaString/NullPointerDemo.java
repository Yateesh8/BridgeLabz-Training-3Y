package javaStringLevel1;

public class NullPointerDemo {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }
}
