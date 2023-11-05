package me.mrbernard.openhud.font

/**
 * Abstract class used to calculate the width of a character per font
 *
 * @property fontId ID of the font
 */
abstract class Font(val fontId: String) {

    /**
     * Get width of a character
     *
     * @param character Character to get the width of
     * @return Width of the given character
     */
    abstract fun getWidth(character: String): Int

    /**
     * Get width of a text
     *
     * @param text Text to get the width of
     * @return Width of the given text
     */
    abstract fun getTextWidth(text: String): Int

}