package me.mrbernard.plugintemplate.commands

import me.mrbernard.plugintemplate.PluginTemplate
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import revxrsal.commands.annotation.Command
import revxrsal.commands.annotation.DefaultFor

class PingCommand(val plugin: PluginTemplate) {

    @Command("ping")
    fun defaultResponse(sender: Player) = sender.sendMessage(Component.text("Pong!"))
}