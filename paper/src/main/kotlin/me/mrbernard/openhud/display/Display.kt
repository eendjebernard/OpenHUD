package me.mrbernard.openhud.display

import org.bukkit.entity.Player

/**
 * Abstract class that can be implemented per different display type
 *
 * @property T Type of element that should be displayed
 */
abstract class Display<T : Element> {

    val elements = arrayListOf<T>()

    /**
     * Abstract method that can be implemented per different display type and is called every time the HUD has to be
     * updated, in most cases this is every tick
     *
     * @param player Player whose HUD has to be updated
     */
    abstract fun update(player: Player)

}