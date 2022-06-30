package com.chilieutenant.orbitaltask.methods;

import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;

public class Methods {

    public static void explodePlayer(Player player, Player target) {
        if(target == null){
            player.sendMessage(ChatColor.RED + "This player is not online!");
            return;
        }
        target.getWorld().createExplosion(target.getLocation(), 8);
    }

    public static void lightningPlayer(Player player, Player target){
        if(target == null){
            player.sendMessage(ChatColor.RED + "This player is not online!");
            return;
        }
        target.getWorld().strikeLightning(target.getLocation());
    }


    public static void burnPlayer(Player player, Player target){
        if(target == null){
            player.sendMessage(ChatColor.RED + "This player is not online!");
            return;
        }
        target.setFireTicks(60);
    }

}
