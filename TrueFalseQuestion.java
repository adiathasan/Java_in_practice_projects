import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String correctAnswer){
        this.question = "TRUE or FALSE: "+question;
        this.correctAnswer = correctAnswer;
    }
    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")){
                answer = "TRUE";
            }else if(answer.equals("F") || answer.equals("FALSE") ||answer.equals("NO") || answer.equals("N")) {
                answer = "FALSE";
            }
            boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");
        }
    }

}
