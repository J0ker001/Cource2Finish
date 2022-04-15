package pro.sky.cource2finish.Interface;

import pro.sky.cource2finish.ClassQuestion.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int amount);
}
