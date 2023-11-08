package me.mrbernard.openhud.display

import me.mrbernard.openhud.font.Font

/**
 * Abstract class that can be implemented per different element type
 *
 * @property id ID of the element
 * @property text Text that should be displayed in the element
 * @property font Font of the text
 * @property permission Permission that a player should have to see this element
 */
abstract class Element(
    val id: String,
    val text: String,
    val font: Font = Font.STANDARD,
    val permission: String = ""
)