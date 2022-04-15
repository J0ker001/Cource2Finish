package pro.sky.cource2finish;

import pro.sky.cource2finish.ClassQuestion.Question;


import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtils {

    public static void assertEqualCollections(Collection<Question> col1, Collection<Question> col2) {
        var a = col1.stream().collect(Collectors.toList());
        var b = col2.stream().collect(Collectors.toList());
        Comparator<Question> cmp = Comparator.comparing(Question::getQuestion);
        Collections.sort(a, cmp);
        Collections.sort(b, cmp);
        assertEquals(a, b);
    }
}
