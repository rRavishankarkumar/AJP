package assingmentAnu.org;

public class MatchParenthesis {
    public static int findClosingParenthesis(String sentence, int openPosition) {
        if (sentence.charAt(openPosition) != '(') {
            throw new IllegalArgumentException("The character at the given position is not an opening parenthesis.");
        }

        int depth = 0; // To track nested parentheses

        for (int i = openPosition; i < sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c == '(') {
                depth++; // Increase depth for an opening parenthesis
            } else if (c == ')') {
                depth--; // Decrease depth for a closing parenthesis

                if (depth == 0) {
                    return i; // Found the matching closing parenthesis
                }
            }
        }

        // If no matching closing parenthesis is found
        throw new IllegalArgumentException("No matching closing parenthesis found.");
    }

    public static void main(String[] args) {
        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
        int openPosition = 10;

        try {
            int closingPosition = findClosingParenthesis(sentence, openPosition);
            System.out.println("The matching closing parenthesis is at position: " + closingPosition);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
