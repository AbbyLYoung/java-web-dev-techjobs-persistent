package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {

    public Skill(){
    }

    @NotBlank
    private String description;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}