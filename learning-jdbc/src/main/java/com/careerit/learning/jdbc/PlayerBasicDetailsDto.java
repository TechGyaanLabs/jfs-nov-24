package com.careerit.learning.jdbc;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PlayerBasicDetailsDto {

        private String name;
        private String role;
        private String team;
        private String teamName;
        private double price;
}
