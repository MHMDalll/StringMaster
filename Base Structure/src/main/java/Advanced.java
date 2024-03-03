import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content
     * 
     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input
     * and change it with the newWord
     * 
     */
    public String wordCensor(String sentence, String word, String newWord) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String w : words) {

            if (w.equals(word)) {
                sb.append(newWord);
            }

            else {
                sb.append(w);
            }

            sb.append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to
     * normalize them as a fullName
     * 
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName  is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of
     *         firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName) {

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        return firstName + " " + lastName;

    }

    /**
     * Removing repeated letter in a word
     * 
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated
     *         letters should be omitted
     */
    public String doubleChar(String word) {
        char[] charArray = word.toCharArray();
        StringBuilder resultBuilder = new StringBuilder();
        char prevChar = charArray[0];

        for (int i = 1; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (currentChar != prevChar) {
                resultBuilder.append(prevChar);
                prevChar = currentChar;
            }
        }

        resultBuilder.append(prevChar);

        return resultBuilder.toString();
    
    }
}
