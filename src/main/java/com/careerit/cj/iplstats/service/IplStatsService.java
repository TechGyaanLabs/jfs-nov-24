package com.careerit.cj.iplstats.service;

import com.careerit.cj.iplstats.domain.Player;
import com.careerit.cj.iplstats.dto.CountryPlayerCountStatsDto;
import com.careerit.cj.iplstats.dto.RoleCountStatsDto;
import com.careerit.cj.iplstats.dto.TeamAmountStatsDto;

import java.util.List;

public interface IplStatsService {

        List<TeamAmountStatsDto> getTeamAmountStats();
        List<RoleCountStatsDto> getRoleCountStats();
        List<CountryPlayerCountStatsDto> getCountryPlayerCountStats();
        List<Player> getTopPaidPlayers();
        List<String> getUniqueTeamNames();
        List<Player> getTopPaidPlayersByTeam(String team);
        List<Player> getPlayersOf(String team);
}
