package com.github.naimado.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Tusk extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User principal;

    private Set<Employee> responsibles;

    private boolean isDone;

    private boolean isDeleted;

    public Tusk() {
    }

    public Long getId() {
        return id;
    }


    public User getPrincipal() {
        return principal;
    }

    public void setPrincipal(User principal) {
        this.principal = principal;
    }

    public Set<Employee> getResponsibles() {
        return responsibles;
    }

    public void setResponsibles(Set<Employee> responsibles) {
        this.responsibles = responsibles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
