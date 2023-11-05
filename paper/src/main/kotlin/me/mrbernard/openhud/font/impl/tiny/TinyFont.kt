package me.mrbernard.openhud.font.impl.tiny

import me.mrbernard.openhud.font.Font

/**
 * Implementation of the font class for the tiny minecraft font
 */
class TinyFont : Font("tiny") {

    companion object {

        /**
         * Function to convert a small character to a standard character because their widths are the same
         *
         * @param character Small character to get the standard character of
         */
        fun getStandardCharacter(character: String): String = when(character) {
            "Ａ" -> "A"
            "ᴀ" -> "a"
            "Ｂ" -> "B"
            "ʙ" -> "b"
            "Ｃ" -> "C"
            "ᴄ" -> "c"
            "Ｄ" -> "D"
            "ᴅ" -> "d"
            "Ｅ" -> "E"
            "ᴇ" -> "e"
            "Ｆ" -> "F"
            "ꜰ" -> "f"
            "Ｇ" -> "G"
            "ɢ" -> "g"
            "Ｈ" -> "H"
            "ʜ" -> "h"
            "Ｉ" -> "I"
            "ɪ" -> "i"
            "Ｊ" -> "J"
            "ᴊ" -> "j"
            "Ｋ" -> "K"
            "ᴋ" -> "k"
            "Ｌ" -> "L"
            "ʟ" -> "l"
            "Ｍ" -> "M"
            "ᴍ" -> "m"
            "Ｎ" -> "N"
            "ɴ" -> "n"
            "Ｏ" -> "O"
            "ᴏ" -> "o"
            "Ｐ" -> "P"
            "ᴘ" -> "p"
            "Ｑ" -> "Q"
            "ǫ" -> "q"
            "Ｒ" -> "R"
            "ʀ" -> "r"
            "Ｓ" -> "S"
            "ѕ" -> "s"
            "Ｔ" -> "T"
            "ᴛ" -> "t"
            "Ｕ" -> "U"
            "ᴜ" -> "u"
            "Ｖ" -> "V"
            "ᴠ" -> "v"
            "Ｗ" -> "W"
            "ᴡ" -> "w"
            "Ｘ" -> "X"
            "х" -> "x"
            "Ｙ" -> "Y"
            "ʏ" -> "y"
            "Ｚ" -> "Z"
            "ᴢ" -> "z"
            "₀" -> "0"
            "₁" -> "1"
            "₂" -> "2"
            "₃" -> "3"
            "₄" -> "4"
            "₅" -> "5"
            "₆" -> "6"
            "₇" -> "7"
            "₈" -> "8"
            "₉" -> "9"
            else -> character
        }
    }

    /**
     * Get width of a tiny character
     *
     * @param character Character to get the width of
     * @return Width of the given character
     */
    override fun getWidth(character: String): Int = STANDARD.getWidth(getStandardCharacter(character))

    /**
     * Get width of a text
     *
     * @param text Text to get the width of
     * @return Width of the given text
     */
    override fun getTextWidth(text: String): Int = STANDARD.getTextWidth(text)
}