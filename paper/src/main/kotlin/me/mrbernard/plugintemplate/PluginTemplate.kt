package me.mrbernard.plugintemplate

import me.mrbernard.plugintemplate.commands.PingCommand
import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler

class PluginTemplate : JavaPlugin() {

    private lateinit var commandHandler: BukkitCommandHandler

    override fun onEnable() {
        commandHandler = BukkitCommandHandler.create(this)
        commandHandler.register(PingCommand(this))
    }

    override fun onDisable() {
        // Disable plugin logic
    }
}