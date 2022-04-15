package pro.sky.cource2finish.ClassQuestion;

import pro.sky.cource2finish.Interface.QuestionInitializer;

import java.util.HashSet;
import java.util.Set;

public class EmptyQuestionInitializer implements QuestionInitializer {
    @Override
    public Set<Question> getQuestions() {
        return new HashSet<>();
    }
}
