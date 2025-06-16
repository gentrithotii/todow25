package com.gentrit.todow25.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Person {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, name = "person_id")
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;

    @Getter
    @Column(unique = true, nullable = false)
    private String email;

    @Getter
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    private List<Todo> personTodos;

    public void addTodo(Todo todo) {
        todo.setPerson(this);
        getPersonTodos().add(todo);
    }

    public void removeTodo(Todo todo) {
        todo.setPerson(null);
        getPersonTodos().remove(todo);
    }

}
