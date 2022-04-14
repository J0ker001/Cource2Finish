package pro.sky.cource2finish.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.cource2finish.Service.JavaQuestionService;
import pro.sky.cource2finish.ClassQuestion.Question;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    public final JavaQuestionService javaQuestionService;

    public JavaQuestionController(JavaQuestionService javaQuestionService) {
        this.javaQuestionService = javaQuestionService;
    }

    @GetMapping
    public Collection<Question> getAll() {
        return javaQuestionService.getAll();
    }

    @GetMapping("/add")
    public String add(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        return "Добавленно: " + javaQuestionService.add(question, answer);
    }

    @GetMapping("/remove")
    public String remove(@RequestParam("question") String question, @RequestParam("answer") String answer) {
        Question questionX = new Question(question, answer);
        return "Удален(о): " + javaQuestionService.remove(questionX);
    }

}
