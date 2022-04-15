package pro.sky.cource2finish.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pro.sky.cource2finish.ClassQuestion.JavaQuestionInitialize;
import pro.sky.cource2finish.Interface.QuestionInitializer;

@Configuration
public class AppConfiguration {

    @Bean
    public QuestionInitializer javaQuestionInitialize() {
        return new JavaQuestionInitialize();
    }
}
