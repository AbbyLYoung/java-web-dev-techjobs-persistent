package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String additionalSkillDescription;

    public Skill(){

    }

    public String getAdditionalSkillDescription() {
        return additionalSkillDescription;
    }

    public void setAdditionalSkillDescription(String additionalSkillDiscription) {
        this.additionalSkillDescription = additionalSkillDiscription;
    }
}