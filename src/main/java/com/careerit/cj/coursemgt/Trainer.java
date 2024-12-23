package com.careerit.cj.coursemgt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Trainer  extends  BaseEntity{

    private String id;
    private String name;
    private String email;
    private String phone;
    private String qualification;
    private int experienceInYears;
}
