package com.chilieutenant.orbitaltask;

import com.chilieutenant.orbitaltask.commands.ExplodeCommand;
import com.chilieutenant.orbitaltask.commands.FireCommand;
import com.chilieutenant.orbitaltask.commands.LightningCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("explode").setExecutor(new ExplodeCommand());
        this.getCommand("fire").setExecutor(new FireCommand());
        this.getCommand("lightning").setExecutor(new LightningCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
