package ru.assertj;

import org.assertj.core.data.Index;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.assertj.core.api.Assertions.*;

class SimpleConvertTest {
    private SimpleConvert simpleConvert;

    @BeforeEach
    void setUp() {
        simpleConvert = new SimpleConvert();
    }

    @Test
    void checkArray() {
        String[] array = simpleConvert.toArray("first", "second", "three", "four", "five");
        assertThat(array).hasSize(5)
                .contains("second")
                .contains("first", Index.atIndex(0))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkList() {
        List<String> list = simpleConvert.toList("first", "second", "three", "four", "five", "first");
        assertThat(list).hasSize(6)
                .doesNotContainNull()
                .doesNotContain("six")
                .contains("five")
                .contains("first", Index.atIndex(5))
                .containsAnyOf("zero", "second", "six")
                .doesNotContain("first", Index.atIndex(1));
    }

    @Test
    void checkSet() {
        Set<String> set = simpleConvert.toSet("first", "second", "three", "four", "five", "first");
        assertThat(set).hasSize(5)
                .doesNotContainNull()
                .doesNotContain("six")
                .contains("five")
                .containsAnyOf("zero", "second", "six");
    }

    @Test
    void checkMap() {
        Map<String, Integer> map = simpleConvert.toMap("first", "second", "three", "four", "five", "first");
        assertThat(map).hasSize(5)
                .containsKeys("first", "second", "five")
                .containsValues(0, 1, 4)
                .doesNotContainKey("six")
                .doesNotContainValue(5)
                .containsEntry("first", 0);
    }
}