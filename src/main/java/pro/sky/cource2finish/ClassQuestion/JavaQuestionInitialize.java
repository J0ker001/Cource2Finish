package pro.sky.cource2finish.ClassQuestion;

import pro.sky.cource2finish.Interface.QuestionInitializer;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestionInitialize implements QuestionInitializer {
    @Override
    public Set<Question> getQuestions() {

        return new HashSet<>(Set.of(
                new Question("Что такое «переменная»?",
                        "Переменная - это ячейка в памяти компьютера, которой можно присвоить имя " +
                                "и в которой можно хранить данные."),
                new Question("По каким параметрам переменные различаются?",
                        "Какие данные хранятся в переменной, сколько данных хранится и " +
                                "сколько займет места в памяти компьютера сама переменная."),
                new Question("Что означает “инициализация”?",
                        "Инициализация — присваивание какого-то значения переменной."),
                new Question("Что такое «цикл»?", "Цикл — конструкция языка, позволяющая выполнять один" +
                        "и тот же код многократно в зависимости от условий."),
                new Question("Что такое объект? Что связывает классы и объекты?",
                        "объект - это экземпляр какого-либо класса." +
                                "Как мы помним, из классов создаются объекты.")));
    }
}
