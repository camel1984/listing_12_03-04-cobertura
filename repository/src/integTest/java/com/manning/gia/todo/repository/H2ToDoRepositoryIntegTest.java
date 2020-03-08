package com.manning.gia.todo.repository;

import com.manning.gia.todo.model.ToDoItem;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class H2ToDoRepositoryIntegTest {
    private ToDoRepository h2ToDoRepository;

    @Before
    public void setUp() {
        h2ToDoRepository = new H2ToDoRepository();
        List<ToDoItem> ret = h2ToDoRepository.findAll();
        ret.forEach(e -> h2ToDoRepository.delete(e));
    }

    @Test
    public void testInsertToDoItem() {
        ToDoItem newToDoItem = new ToDoItem();
        newToDoItem.setName("Write integration tests");
        Long newId = h2ToDoRepository.insert(newToDoItem);
        newToDoItem.setId(newId);
        assertNotNull(newId);

        ToDoItem persistedToDoItem = h2ToDoRepository.findById(newId);
        assertNotNull(persistedToDoItem);
        assertEquals(newToDoItem, persistedToDoItem);
    }

    @Test
    public void testFindAllToDoItem() {
        ToDoItem newToDoItem = new ToDoItem();
        newToDoItem.setName("Write integration tests");
        Long newId = h2ToDoRepository.insert(newToDoItem);
        newToDoItem.setId(newId);
        assertNotNull(newId);

        List<ToDoItem> ret = h2ToDoRepository.findAll();
        assertEquals(1, ret.size());
        assertEquals(newToDoItem, ret.get(0));
    }
}