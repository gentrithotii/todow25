package com.gentrit.todow25.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false, name = "todo_id")
    private long id;

    @Getter
    @Setter
    @Column(length = 80, nullable = false)
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private boolean completed;

    @Getter
    private LocalDateTime createdAt;

    @Getter
    @Setter
    private LocalDateTime updatedAt;

    @Getter
    @Setter
    private LocalDateTime dueDate;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @PrePersist
    public void onCreation() {
        this.createdAt = LocalDateTime.now();
    }
}
