package com.managepeople.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class People implements Cloneable {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Long birthDay;
    private String image;
    private String note;
    private int status;

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}
