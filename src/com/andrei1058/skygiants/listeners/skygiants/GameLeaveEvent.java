package com.andrei1058.skygiants.listeners.skygiants;


import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.ArrayList;

public class GameLeaveEvent extends Event {
    private Player player;

    public GameLeaveEvent(Player player){
        this.player = player;
    }

    public Player getPlayer(){
        return player;
    }

    //0 == lobby, 1 == starting, 2 == playing, 3 == restarting
    public Integer getGameStatus(){
        return 2;
    }

    public ArrayList<Player> getPlayers(){
        return null;
    }

    public ArrayList<Player> getMagentaTeam(){
        return null;
    }

    public ArrayList<Player> getBlueTeam(){
        return null;
    }

    public ArrayList<Player> getGreenTeam(){
        return null;
    }

    public ArrayList<Player> getGoldTeam(){
        return null;
    }

    public boolean isSkyGiantsMini(){
        return true;
    }

    public static ArrayList<Player> getSpectators(){
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
