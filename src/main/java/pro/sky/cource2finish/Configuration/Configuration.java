package pro.sky.cource2finish.Configuration;

import org.springframework.context.annotation.Bean;
import pro.sky.cource2finish.ClassQuestion.JavaQuestionInitialize;
import pro.sky.cource2finish.Interface.QuestionInitializer;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public QuestionInitializer javaQuestionInitialize() {
        return new JavaQuestionInitialize();
    }
}
