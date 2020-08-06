import javax.swing.*;

public class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String question, String correctAnswer){
        super(question);
        this.correctAnswer = correctAnswer;
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);
        initQuestionDialog();
    }

    String ask() {
        question.setVisible(true);
        return question.answer;
    }

    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }

}
