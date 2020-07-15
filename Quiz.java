import javax.swing.JOptionPane;
public class Quiz {
    static int nQuestions = 0;
    static int nCorrect = 0;
    public static void main(String[] args) {
        String question;
        question = "What is a quiz?\n";
        question += "A. a test of knowledge, especially a brief informal test given to students\n";
        question += "B. 42\n";
        question += "C. a duck\n";
        question += "D. to get to the other side\n";
        question += "E. To be or not to be, that is the question.";
        check(question, ask(question));
        nQuestions++;
        JOptionPane.showMessageDialog(null, "Total question: "+ nQuestions + "\n" + "Correct answer given: "+ nCorrect);
        question = "Who is the PUBG god\n";
        question += "A. chocOTAko\n";
        question += "B. Dr. Disrespect\n";
        question += "C. Shroud\n";
        check(question, ask(question));
        nQuestions++;
        JOptionPane.showMessageDialog(null, "Total question: "+ nQuestions + "\n" + "Correct answer given: "+ nCorrect);
        question = "Who is the best footballer\n";
        question += "A. messi\n";
        question += "B. c.ronaldo\n";
        question += "C. kaka\n";
        check(question, ask(question));
        nQuestions++;
        JOptionPane.showMessageDialog(null, "Total question: "+ nQuestions + "\n" + "Correct answer given: "+ nCorrect);
        if (nCorrect == 3){
            JOptionPane.showMessageDialog(null, "congratulation!! You have corrected all.");
        }
    }

    public static String ask(String question){
        return JOptionPane.showInputDialog(question).toUpperCase();

    }

    public static void check(String question, String correctAnswer) {
        if (question.contains("quiz")) {
            if (correctAnswer.equals("A")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                nCorrect++;
            } else if (correctAnswer.equals("B") || correctAnswer.equals("C") || correctAnswer.equals("D") || correctAnswer.equals("E")) {
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + " A");

            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
                check(question, ask(question));
            }
        } else if (question.contains("PUBG")){
            if (correctAnswer.equals("C")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                nCorrect++;
            } else if (correctAnswer.equals("B") || correctAnswer.equals("A")){
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + " C");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B or C");
                check(question, ask(question));
            }
        } else if (question.contains("footballer")) {
            if (correctAnswer.equals("B")) {
                JOptionPane.showMessageDialog(null, "Correct!");
                nCorrect++;
            } else if (correctAnswer.equals("C") || correctAnswer.equals("A")){
                JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + " B");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B or C");
                check(question, ask(question));
            }
        }

    }

}

