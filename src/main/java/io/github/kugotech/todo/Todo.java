package io.github.kugotech.todo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity(name = "TodoList")
public class Todo {

    enum Status {
        PENDING, DONE, ARCHIVED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String name;
    private Status status;
    private boolean archived;

    protected Todo() {
    }

    public Todo(String name) {
        this.name = name;
        this.status = Status.PENDING;
    }

    public Todo(String name, Status status) {
        this.name = name;
        this.status = Status.PENDING;
        this.archived = false;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toDone() {
        if (!this.archived) {
            this.status = Status.DONE;
        }
    }

    public void toPending() {
        if (!this.archived) {
            this.status = Status.PENDING;
        }
    }

    public void archive() {
        if (!this.archived) {
            this.archived = true;
        }
    }

    public void unarchive() {
        if (this.archived) {
            this.archived = false;
        }
    }

    @Override
    public String toString() {
        return String.format("List[id='%s', name='%s', state='%s', archived=%b]", id.toString(), name, status,
                archived);
    }

}
