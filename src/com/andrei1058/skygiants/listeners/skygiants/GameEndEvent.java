package com.andrei1058.skygiants.listeners.skygiants;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class GameEndEvent extends Event {

    //This returns the winers (team)
    private ArrayList<Player> getWinners(){
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
