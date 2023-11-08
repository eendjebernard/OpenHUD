package me.mrbernard.openhud.font

/**
 * 'Wrapper' for all space unicodes
 */
object Spaces {

    /**
     * Hash map containing all positive unicodes bound to a width
     */
    val positiveSpaces = mapOf(
        1024 to "\uF82F",
        512 to "\uF82E",
        256 to "\uF82D",
        128 to "\uF82C",
        64 to "\uF82B",
        32 to "\uF82A",
        16 to "\uF829",
        8 to "\uF828",
        7 to "\uF827",
        6 to "\uF826",
        5 to "\uF825",
        4 to "\uF824",
        3 to "\uF823",
        2 to "\uF822",
        1 to "\uF821"
    )

    /**
     * Hash map containing all negative unicodes bound to a width
     */
    val negativeSpaces = mapOf(
        1024 to "\uF80F",
        512 to "\uF80E",
        256 to "\uF80D",
        128 to "\uF80C",
        64 to "\uF80B",
        32 to "\uF80A",
        16 to "\uF809",
        8 to "\uF808",
        7 to "\uF807",
        6 to "\uF806",
        5 to "\uF805",
        4 to "\uF804",
        3 to "\uF803",
        2 to "\uF802",
        1 to "\uF801"
    )
}