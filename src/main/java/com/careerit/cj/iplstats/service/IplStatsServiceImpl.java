package com.careerit.cj.iplstats.service;

import com.careerit.cj.iplstats.domain.Player;
import com.careerit.cj.iplstats.dto.CountryPlayerCountStatsDto;
import com.careerit.cj.iplstats.dto.RoleCountStatsDto;
import com.careerit.cj.iplstats.dto.TeamAmountStatsDto;
import com.careerit.cj.iplstats.util.JsonUtil;

import java.util.*;

public class IplStatsServiceImpl implements IplStatsService {

    private List<Player> players;

    public IplStatsServiceImpl() {
        this.players = JsonUtil.loadPlayers("/players.json");
    }

    @Override
    public List<TeamAmountStatsDto> getTeamAmountStats() {
        return List.of();
    }

    @Override
    public List<RoleCountStatsDto> getRoleCountStats() {
        return List.of();
    }

    @Override
    public List<CountryPlayerCountStatsDto> getCountryPlayerCountStats() {
        Map<String, Long> map = new HashMap<>();

        for (Player player : players) {
            map.put(player.getCountry(),
                    map.getOrDefault(player.getCountry(), 0L) + 1);
        }
        List<CountryPlayerCountStatsDto> list = new ArrayList<>();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            String country = entry.getKey();
            long count = entry.getValue();
            CountryPlayerCountStatsDto obj = new CountryPlayerCountStatsDto(country,count);
            list.add(obj);
        }
        return list;
    }

    @Override
    public List<Player> getTopPaidPlayers() {
        return List.of();
    }

    @Override
    public List<String> getUniqueTeamNames() {
        Set<String> teamNames = new HashSet<>();
        for (Player player : players) {
            teamNames.add(player.getTeam());
        }
        return new ArrayList<>(teamNames);
    }

    @Override
    public List<Player> getTopPaidPlayersByTeam(String team) {
        return List.of();
    }

    @Override
    public List<Player> getPlayersOf(String team) {
        return List.of();
    }
}
