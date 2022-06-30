package com.chilieutenant.orbitaltask.commands;

import com.chilieutenant.orbitaltask.methods.Methods;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExplodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length == 1 && sender instanceof Player player){
            Methods.explodePlayer(player, Bukkit.getPlayer(args[0]));
        }
        return false;
    }
}
