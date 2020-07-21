public class Quiz {

    public static void main(String[] args) {
        Question question1 = new MultipleChoiceQuestion("What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "A");

        Question question2 = new MultipleChoiceQuestion("When earth was created?",
                "a long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore",
                "A");
        Question question3 = new MultipleChoiceQuestion("Where is a galaxy?",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain",
                "a galaxy far, far away",
                "E");
        Question question4 = new MultipleChoiceQuestion("Where is C. RONALDO?",
                "under cave",
                "Barcelona",
                "Juventus",
                "the other side of the mountain",
                "Real Madrid",
                "C");
        Question question5 = new MultipleChoiceQuestion("Where is L. Messi?",
                "Brazil",
                "Barcelona",
                "Juventus",
                "liverpool",
                "chelsea",
                "B");
        Question tF1 = new TrueFalseQuestion("Sun is small than earth.", "FALSE");
        Question tF2 = new TrueFalseQuestion("Jupyter is small than earth.", "FALSE");
        Question tF3 = new TrueFalseQuestion("Python is the boss of all language.", "TRUE");
        Question tF4 = new TrueFalseQuestion("Sun is cold.", "FALSE");
        Question tF5 = new TrueFalseQuestion("Moon is small than earth.", "TRUE");
        question1.check();

        question2.check();

        question3.check();

        question4.check();

        question5.check();

        tF1.check();

        tF2.check();

        tF3.check();

        tF4.check();

        tF5.check();

        Question.showResults();
    }
}