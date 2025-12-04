package ru.generics;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.*;

class RoleStoreTest {
    private RoleStore store;

    @BeforeEach
    void setUp() {
        store = new RoleStore();
    }

    @Test
    void whenAddAndFindThenNameIsAdmin() {
        store.add(new Role("1", "Admin"));
        Role result = store.findById("1");
        assertThat(result.getName()).isEqualTo("Admin");
    }

    @Test
    void whenAddAndFindThenRoleIsNull() {
        store.add(new Role("1", "Admin"));
        Role result = store.findById("10");
        assertThat(result).isNull();
    }

    @Test
    void whenAddDuplicateAndFindNameIsAdmin() {
        store.add(new Role("1", "Admin"));
        store.add(new Role("1", "Moderator"));
        Role result = store.findById("1");
        assertThat(result.getName()).isEqualTo("Admin");
    }

    @Test
    void whenReplaceThenNameIsModerator() {
        store.add(new Role("1", "Admin"));
        store.replace("1", new Role("1", "Moderator"));
        Role result = store.findById("1");
        assertThat(result.getName()).isEqualTo("Moderator");
    }

    @Test
    void whenNoReplaceRoleThenNoChangeName() {
        store.add(new Role("1", "Admin"));
        store.replace("10", new Role("10", "Moderator"));
        Role result = store.findById("1");
        assertThat(result.getName()).isEqualTo("Admin");
    }

    @Test
    void whenDeleteRoleThenRoleIsNull() {
        store.add(new Role("1", "Admin"));
        store.delete("1");
        Role result = store.findById("1");
        assertThat(result).isNull();
    }

    @Test
    void whenNoDeleteRoleThenNameIsAdmin() {
        store.add(new Role("1", "Admin"));
        store.delete("10");
        Role result = store.findById("1");
        assertThat(result.getName()).isEqualTo("Admin");
    }

    @Test
    void whenReplaceOkThenTrue() {
        store.add(new Role("1", "Admin"));
        boolean result = store.replace("1", new Role("1", "Moderator"));
        assertThat(result).isTrue();
    }

    @Test
    void whenReplaceNotOkThenFalse() {
        store.add(new Role("1", "Admin"));
        boolean result = store.replace("10", new Role("10", "Moderator"));
        assertThat(result).isFalse();
    }
}