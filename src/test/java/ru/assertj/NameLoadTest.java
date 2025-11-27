package ru.assertj;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;

class NameLoadTest {

    private NameLoad nameLoad;

    @BeforeEach
    void setUp() {
        nameLoad = new NameLoad();
    }

    @Test
    void whenParseEmptyArray() {
        assertThatThrownBy(nameLoad::parse)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Names array is empty");
    }

    @Test
    void whenParseWithoutEquals() {
        String result = "key:value";
        assertThatThrownBy(() -> nameLoad.parse(result))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("this name: %s does not contain the symbol '='", result);
    }

    @Test
    void whenParseWithoutKey() {
        String result = "=value";
        assertThatThrownBy(() -> nameLoad.parse(result))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("this name: %s does not contain a key", result);
    }

    @Test
    void whenParseWithoutValue() {
        String result = "key=";
        assertThatThrownBy(() -> nameLoad.parse(result))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("this name: %s does not contain a value", result);
    }

    @Test
    void whenGetMapWithoutParse() {
        assertThatThrownBy(nameLoad::getMap)
                .isInstanceOf(IllegalStateException.class)
                .hasMessage("collection contains no data");
    }
}