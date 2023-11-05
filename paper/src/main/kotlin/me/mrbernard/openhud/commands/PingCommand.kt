package me.mrbernard.openhud.commands

import me.mrbernard.openhud.OpenHUD
import net.kyori.adventure.text.Component
import org.bukkit.entity.Player
import revxrsal.commands.annotation.Command

class PingCommand(val plugin: OpenHUD) {

    @Command("ping")
    fun defaultResponse(sender: Player) = sender.sendMessage(Component.text("Pong!"))
}