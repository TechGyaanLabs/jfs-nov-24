package com.careerit.cj.iplstats;

import com.careerit.cj.iplstats.service.IplStatsService;
import com.careerit.cj.iplstats.service.IplStatsServiceImpl;

import java.util.List;

public class IplStatsManager {
    public static void main(String[] args) {



        IplStatsService service = new IplStatsServiceImpl();


        // Get unique team names
        List<String> teamNames = service.getUniqueTeamNames();
        System.out.println(teamNames);

    }
}
