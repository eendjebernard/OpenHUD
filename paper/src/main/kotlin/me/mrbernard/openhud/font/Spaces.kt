package me.mrbernard.openhud.font

/**
 * 'Wrapper' for all space unicodes
 */
object Spaces {

    /**
     * Hash map containing all positive unicodes bound to a width
     */
    val positiveSpaces = hashMapOf<Int, String>().apply {
        put(1024, "\uF82F");
        put(512, "\uF82E");
        put(256, "\uF82D");
        put(128, "\uF82C");
        put(64, "\uF82B");
        put(32, "\uF82A");
        put(16, "\uF829");
        put(8, "\uF828");
        put(7, "\uF827");
        put(6, "\uF826");
        put(5, "\uF825");
        put(4, "\uF824");
        put(3, "\uF823");
        put(2, "\uF822");
        put(1, "\uF821");
    }

    /**
     * Hash map containing all negative unicodes bound to a width
     */
    val negativeSpaces = hashMapOf<Int, String>().apply {
        put(1, "\uF801");
        put(2, "\uF802");
        put(3, "\uF803");
        put(4, "\uF804");
        put(5, "\uF805");
        put(6, "\uF806");
        put(7, "\uF807");
        put(8, "\uF808");
        put(16, "\uF809");
        put(32, "\uF80A");
        put(64, "\uF80B");
        put(128, "\uF80C");
        put(256, "\uF80D");
        put(512, "\uF80E");
        put(1024, "\uF80F");
    }
}