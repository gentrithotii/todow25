package com.gentrit.todow25.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Person {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, name = "person_id")
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    @Getter
    private String email;

}
