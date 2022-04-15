package pro.sky.cource2finish;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.cource2finish.ClassQuestion.Question;
import pro.sky.cource2finish.Service.ExaminerServiceImpl;
import pro.sky.cource2finish.Service.JavaQuestionService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExaminerServiceImplTest {

    @Mock
    public JavaQuestionService javaQuestionServiceMock;

    @InjectMocks
    private ExaminerServiceImpl examinerService;

    @Test
    void shouldGetRandomAmountQuestions() {
        var questionOne = new Question("0", "1");
        var questionTwo = new Question("2", "3");
        when(javaQuestionServiceMock.getRandomQuestion()).thenReturn(questionOne).thenReturn(questionTwo);
        when(javaQuestionServiceMock.getAll()).thenReturn(new ArrayList<>(List.of(questionOne, questionTwo)));
        var x = examinerService.getQuestions(2);
        assertEquals(2, x.size());
        Collection<Question> arr = new ArrayList<>(List.of(questionOne, questionTwo));
        TestUtils.assertEqualCollections(arr, x);
    }
}