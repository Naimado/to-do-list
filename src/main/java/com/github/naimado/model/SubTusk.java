package com.github.naimado.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class SubTusk extends Tusk {

    @ManyToOne(targetEntity = Tusk.class)
    private Tusk superTusk;

    public Tusk getSuperTusk() {
        return superTusk;
    }

    public void setSuperTusk(Tusk superTusk) {
        this.superTusk = superTusk;
    }



}
