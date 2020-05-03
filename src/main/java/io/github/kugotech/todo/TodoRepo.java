package io.github.kugotech.todo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface TodoRepo extends JpaRepository<Todo, Long> {
    List<Todo> findById(UUID id);

    List<Todo> findByNameStartsWithIgnoreCase(String name);

    List<Todo> findByStatus(Todo.Status status);

    List<Todo> findByArchived(boolean isArchived);
}
