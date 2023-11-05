package me.mrbernard.openhud.font.impl.standard

import me.mrbernard.openhud.font.Font

/**
 * Implementation of the font class for the standard minecraft font
 */
class StandardFont() : Font("standard") {

    /**
     * Get width of a character
     *
     * @param character Character to get the width of
     * @return Width of the given character
     */
    override fun getWidth(character: String): Int = StandardFontInfo.valueOf(character).width

    /**
     * Get width of a text
     *
     * @param text Text to get the width of
     * @return Width of the given text
     */
    override fun getTextWidth(text: String): Int {
        var width = 0

        text.toCharArray().forEach {
            val relativeChar: String = when(it.toString()) {
                " " -> "SPACE"
                "-" -> "MINUS"
                "0" -> "NUM_0"
                "1" -> "NUM_1"
                "2" -> "NUM_2"
                "3" -> "NUM_3"
                "4" -> "NUM_4"
                "5" -> "NUM_5"
                "6" -> "NUM_6"
                "7" -> "NUM_7"
                "8" -> "NUM_8"
                "9" -> "NUM_9"
                "10" -> "NUM_10"
                else -> it.toString()
            }

            width += StandardFontInfo.valueOf(relativeChar).width
        }

        return width
    }
}