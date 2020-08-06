import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

class MultipleChoiceQuestion extends Question{

    MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer){
        super(query);
        addChoice("A",a);
        addChoice("B",b);
        addChoice("C",c);
        addChoice("D",d);
        addChoice("E",e);

        correctAnswer = answer;
        initQuestionDialog();

    }

    String ask() {
        question.setVisible(true);
        return question.answer;
    }

    void addChoice(String name, String label) {
        JPanel choice = new JPanel(new BorderLayout());
        JButton button = new JButton(name);
        button.addActionListener(question);
        choice.add(button,BorderLayout.WEST);
        choice.add(new JLabel(label+"",JLabel.LEFT),BorderLayout.CENTER);
        question.add(choice);
    }


}
