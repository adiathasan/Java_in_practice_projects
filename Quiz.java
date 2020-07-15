public class Quiz {

    public static void main(String[] args) {
        MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What is a quiz?",
                "a test of knowledge, especially a brief informal test given to students",
                "42",
                "a duck",
                "to get to the other side",
                "To be or not to be, that is the question.",
                "A");

        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("When earth was created?",
                "a long, long ago",
                "right now",
                "the best of times",
                "the worst of times",
                "nevermore",
                "A");
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Where is a galaxy?",
                "under the sea",
                "right here",
                "there and back again",
                "the other side of the mountain",
                "a galaxy far, far away",
                "E");
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Where is C. RONALDO?",
                "under cave",
                "Barcelona",
                "Juventus",
                "the other side of the mountain",
                "Real Madrid",
                "C");
        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Where is L. Messi?",
                "Brazil",
                "Barcelona",
                "Juventus",
                "liverpool",
                "chelsea",
                "B");
        question1.check();

        question2.check();

        question3.check();

        question4.check();

        question5.check();

        MultipleChoiceQuestion.showResults();
    }
}