package ClassPrograms;

public class SentenceFormatter {

    public static String formatParagraph(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        text = text.trim();
        text = text.replaceAll("\\s+", " ");
        text = text.replaceAll("\\s*([.?!])\\s*", "$1 ");

        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : text.toCharArray()) {
            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }

            if (c == '.' || c == '?' || c == '!') {
                capitalizeNext = true;
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        String input = "   hello world!this is   a test.   what is going   on?another sentence here.";
        System.out.println(formatParagraph(input));
    }
}
