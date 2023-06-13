/**
 * A FillInQuestion is a type of question where the responder has to fill in the
 * blanks. You should complete the constructor for this question.
 * 
 * An object of this class is constructed with
 * a string that contains the question and the answer.
 * The answer is marked by underscores at the start and end,
 * for example:
 * 
 * "The inventor of Java was _James Gosling_".
 * 
 * The question should be displayed as
 * 
 * The inventor of Java was _______________.
 * 
 * Note the number of underscores in the question is
 * 2 plus the length of the answer string, in this case,
 * 2 + 13 = 15.
 * 
 * You should complete the following tasks:
 * 
 * - Complete the constructor
 */
class FillInQuestion extends Question {
    /**
     * A constructor method to initialize the inherited text and answer variables
     * (of type string)
     * For example, if parameter questionText is:
     * "The inventor of Java was _James Gosling_".
     * then text should be set to
     * "The inventor of Java was _______________".
     * and the answer should be set to
     * "James Gosling"
     * The answer string may be in the middle, as in questionText:
     * "A Canadian, _James Gosling_, invented Java".
     * in which case text should be:
     * "A Canadian, _______________, invented Java".
     * and the answer should be:
     * "James Gosling"
     * 
     * You can assume only valid inputs are given.
     * 
     * @param questionText the text of this question, also containing answer
     *                     surrounded by one underscore on each end of the answer
     */
    public FillInQuestion(String questionText) {
        char underscore = '_';
        int n1, n2;
        String answerString;
        // -----------Start below here. To do: approximate lines of code = 7
        // -----------Start below here. To do: approximate lines of code = 7
        // 1. find position of first underscore, hint indexOf(char)
        // Note, indexOf(char) and indexOf(char, from) can be used here
        n1 = questionText.indexOf(underscore);
        // 2. second underscore, hint indexOf(char, from)
        n2 = questionText.indexOf(underscore, n1 + 1);
        // 3. extract the answer string Hint: use substring
        answerString = questionText.substring(n1 + 1, n2);
        System.out.println("OUTPUT:   " + answerString);
        // 4. setAnswer (see superclass Question - remember you inherit all variables
        // and methods
        super.setAnswer(answerString);
        // 5. String underscores = ... underscores string as long as answer string is
        // replaceAll() method of class String helps, or you can do it in a loop
        String underscores = "";
        int l = answerString.length();
        for (int i = 1; i <= l; i++) {
            underscores = underscores + "_";
        }
        // 6. replace answer embedded in questionText with the underscores before
        // setting text string
        questionText = questionText.replaceAll(answerString, underscores);
        // 7. setQuestion to set text variable
        super.setQuestion(questionText);
        // -----------------End here. Please do not remove this comment. Reminder: no
        // changes outside the todo regions.
        // -----------------End here. Please do not remove this comment. Reminder: no
        // changes outside the todo regions.
    }
}
