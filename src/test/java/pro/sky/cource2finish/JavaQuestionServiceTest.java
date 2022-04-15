package pro.sky.cource2finish;

import org.junit.jupiter.api.Test;
import pro.sky.cource2finish.ClassQuestion.EmptyQuestionInitializer;
import pro.sky.cource2finish.ClassQuestion.Question;
import pro.sky.cource2finish.Service.JavaQuestionService;
import pro.sky.cource2finish.Exception.AlreadyExists;
import pro.sky.cource2finish.Exception.NoContent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class JavaQuestionServiceTest {

    private final JavaQuestionService javaQuestionService = new JavaQuestionService(new EmptyQuestionInitializer());

    @Test
    void shouldQuestionPlusAnswerAdd() {
        assertEquals(new Question("0", "1"), javaQuestionService.add("0", "1"));
    }

    @Test
    void shouldThrowWhenAlreadyHasQuestion() {
        javaQuestionService.add("0", "3");
        assertThrows(AlreadyExists.class, () -> javaQuestionService.add("0", "1"));
    }

    @Test
    void shouldTrowAddedExists() {
        javaQuestionService.add("0", "1");
        assertThrows(AlreadyExists.class, () -> javaQuestionService.add("0", "1"));
    }

    @Test
    void shouldQuestionAddedExists() {
        Question question = new Question("0", "1");
        assertEquals(new Question("0", "1"), javaQuestionService.add(question));
    }

    @Test
    void shouldTrowWhenAdd() {
        Question question = new Question("0", "1");
        javaQuestionService.add("0", "1");
        assertThrows(AlreadyExists.class, () -> javaQuestionService.add(question));
    }

    @Test
    void remove() {
        Question question = new Question("0", "1");
        assertEquals(new Question("0", "1"), javaQuestionService.add(question));
        assertEquals(new Question("0", "1"), javaQuestionService.remove(question));
    }

    @Test
    void getAll() {
        Collection<Question> arr = new ArrayList<>(List.of(
                new Question("0", "1"),
                new Question("2", "3")));
        javaQuestionService.add("2", "3");
        javaQuestionService.add("0", "1");
        TestUtils.assertEqualCollections(arr, javaQuestionService.getAll());
    }

    @Test
    void shouldThrowRandom() {
        assertThrows(NoContent.class, () -> javaQuestionService.getRandomQuestion());
    }

    @Test
    void shouldReturnQuestion() {
        var x = javaQuestionService.add("0", "1");
        assertEquals(x, javaQuestionService.getRandomQuestion());
    }
}