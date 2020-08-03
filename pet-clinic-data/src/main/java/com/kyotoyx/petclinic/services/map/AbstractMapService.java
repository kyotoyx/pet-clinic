package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.BaseEntity;

import java.util.*;

public class AbstractMapService<T extends BaseEntity, ID extends Long> {

    private Map<Long, T> map = new HashMap<>();

    public T save(T object) {

        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }

            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object should not be null");
        }

        return object;
    }

    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    public T findById(ID id) {
        return map.get(id);
    }

    public void delete(T object) {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    public void deleteById(ID id) {
        map.remove(id);
    }

    private Long getNextId() {
        Long id = null;

        try {
            id = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException e) {
            id = 1L;
        }

        return id;
    }
}
