package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.websocket.OnClose;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(max=100,min=1)
    private String location;

    public Employer(){

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
