package me.mrbernard.openhud

import me.mrbernard.openhud.commands.PingCommand
import org.bukkit.plugin.java.JavaPlugin
import revxrsal.commands.bukkit.BukkitCommandHandler

class OpenHUD : JavaPlugin() {

    private lateinit var commandHandler: BukkitCommandHandler

    override fun onEnable() {
        commandHandler = BukkitCommandHandler.create(this)
        commandHandler.register(PingCommand(this))
    }

    override fun onDisable() {
        // Disable plugin logic
    }
}