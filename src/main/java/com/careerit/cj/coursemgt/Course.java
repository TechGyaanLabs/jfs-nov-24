package com.careerit.cj.coursemgt;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course extends BaseEntity{

        private String id;
        private String title;
        private String description;
        private double fee;
        private long durationInHours;
}
