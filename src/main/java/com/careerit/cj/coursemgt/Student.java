package com.careerit.cj.coursemgt;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends BaseEntity {
        private String id;
        private String name;
        private String email;
        private String phone;
}
