package com.andrei1058.skygiants.api;

import org.bukkit.entity.Player;

public class StatsAPI {

    //Use the uuid methods if the player is null

    /**
     * Gets the current kills.
     * Available during the game.
     */
    public Integer getCurrentKills(Player player) {
        return 19;
    }

    /**
     * Gets the current deaths.
     * Available during the game.
     */
    public Integer getCurrentDeaths(Player player) {
        return 4;
    }

    /**
     * Gets the current beasts slain.
     * Available during the game.
     */
    public Integer getCurrentBeastsSlain(Player player) {
        return 3;
    }

    /**
     * Gets the player's gold amount.
     * Available during the game.
     */
    public Integer getCurrentGold(Player player) {
        return 133;
    }

    /**
     * Gets the player's shutdowns number.
     * Available during the game.
     */
    public Integer getCurrentShutdowns(Player player) {
        return 2;
    }

    /**
     * Gets the player's rampages number.
     * Available during the game.
     */
    public Integer getCurrentRampages(Player player) {
        return 1;
    }


    /**
     * Gets the total kills from the database.
     */
    public Integer getKills(String uuid) {
        if (hasDatabase()) {
            return 121;
        }
        return 0;
    }

    public Integer getKills(Player p) {
        if (hasDatabase()) {
            return 121;
        }
        return 0;
    }

    /**
     * Gets the player's games played number.
     */
    public Integer getGamesPlayed(Player player){
        if (hasDatabase()) {
            return 30;
        }
        return 0;
    }
    public Integer getGamesPlayed(String uuid){
        if (hasDatabase()) {
            return 30;
        }
        return 0;
    }

    /**
     * Gets the total deaths from the database.
     */
    public Integer getDeaths(String uuid) {
        if (hasDatabase()) {
            return 144;
        }
        return 0;
    }

    public Integer getDeaths(Player p) {
        if (hasDatabase()) {
            return 141;
        }
        return 0;
    }

    /**
     * Gets the total beasts slain from the database.
     */
    public Integer getBeastsSlain(String uuid) {
        if (hasDatabase()) {
            return 22;
        }
        return 0;
    }

    public Integer getBeastsSlain(Player p) {
        if (hasDatabase()) {
            return 22;
        }
        return 0;
    }

    /**
     * Gets the GoldEarnt amount from the database.
     */
    public Integer getGoldEarnt(String uuid) {
        if (hasDatabase()) {
            return 331;
        }
        return 0;
    }

    public Integer getGoldEarnt(Player p) {
        if (hasDatabase()) {
            return 331;
        }
        return 0;
    }

    /**
     * Gets the player's victories number from the database.
     */
    public Integer getVictories(String uuid) {
        if (hasDatabase()) {
            return 29;
        }
        return 0;
    }

    public Integer getVictories(Player p) {
        if (hasDatabase()) {
            return 29;
        }
        return 0;
    }

    /**
     * Gets the player's shutdowns from the database.
     */
    public Integer getShutdowns(String uuid) {
        if (hasDatabase()) {
            return 3;
        }
        return 0;
    }

    public Integer getShutdowns(Player p) {
        if (hasDatabase()) {
            return 3;
        }
        return 0;
    }

    /**
     * Gets the player's rampages from the database.
     */
    public Integer getRampages(String uuid) {
        if (hasDatabase()) {
            return 5;
        }
        return 0;
    }

    public Integer getRampages(Player p) {
        if (hasDatabase()) {
            return 3;
        }
        return 0;
    }


    /**
     * Gets the top by kills.
     */
    public String[] getTopKills(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Get the top by deaths.
     */
    public String[] getTopDeaths(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by beasts slain.
     */
    public String[] getTopBeastsSlain(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by GoldEarnt.
     */
    public String[] getTopGoldEarnt(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by victories.
     */
    public String[] getTopVictories(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by Shutdowns.
     */
    public String[] getTopShutdowns(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by Rampages.
     */
    public String[] getTopRampages(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Gets the top by Games Played.
     */
    public String[] getTopGamesPlayed(Integer topNumber) {
        if (hasDatabase()) {
            String[] list = new String[topNumber];
            int x = topNumber;
            for (int i = 0; i < topNumber; i++) {
                list[i] = "2abf5b34-ff44-4fa4-bd57-1dcd3fc1c53d,"+String.valueOf(x-i)+",andrei1058";
            }
            return list;
        }
        return null;
    }

    /**
     * Check if the plugin has mysql support enabled.
     */
    public boolean hasDatabase() {
        return true;
    }
}
