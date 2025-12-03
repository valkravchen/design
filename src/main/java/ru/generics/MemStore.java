package ru.generics;

import java.util.*;

public final class MemStore<T extends Base> implements Store<T> {
    private final Map<String, T> storage = new HashMap<>();

    @Override
    public void add(T model) {
        storage.put(model.getId(), model);
    }

    @Override
    public boolean replace(String id, T model) {
        return false;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public T findById(String id) {
        return storage.get(id);
    }
}
