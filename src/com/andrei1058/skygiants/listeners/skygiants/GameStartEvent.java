package com.andrei1058.skygiants.listeners.skygiants;


import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class GameStartEvent extends Event {

    public ArrayList<Player> getPlayers() {
        return null;
    }

    public ArrayList<Player> getMagentaTeam() {
        return null;
    }

    public ArrayList<Player> getBlueTeam() {
        return null;
    }

    public ArrayList<Player> getGreenTeam() {
        return null;
    }

    public ArrayList<Player> getGoldTeam() {
        return null;
    }

    public boolean isSkyGiantsMini() {
        return true;
    }

    public static ArrayList<Player> getSpectators() {
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
