package com.careerit.cj.iplstats.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryPlayerCountStatsDto {
    private String country;
    private long count;
}
