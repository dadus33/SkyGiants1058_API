package com.andrei1058.skygiants.listeners.skygiants;


import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class GameStartEvent extends Event {

    private ArrayList<Player> getPlayers() {
        return null;
    }

    private ArrayList<Player> getMagentaTeam() {
        return null;
    }

    private ArrayList<Player> getBlueTeam() {
        return null;
    }

    private ArrayList<Player> getGreenTeam() {
        return null;
    }

    private ArrayList<Player> getGoldTeam() {
        return null;
    }

    private boolean isSkyGiantsMini() {
        return true;
    }

    private static ArrayList<Player> getSpectators() {
        return null;
    }

    private static final HandlerList handlers = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
