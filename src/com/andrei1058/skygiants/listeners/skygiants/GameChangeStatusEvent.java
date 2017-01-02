package com.andrei1058.skygiants.listeners.skygiants;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class GameChangeStatusEvent extends Event {

    //0 == lobby, 1 == starting, 2 == playing, 3 == restarting
    public Integer getStatus(){
        return 2;
    }

    //Is warmup?
    public boolean isWarmup(){
        return false;
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
