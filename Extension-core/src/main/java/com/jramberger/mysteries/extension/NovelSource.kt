package com.jramberger.mysteries.extension

interface NovelSource {
    /**
     * The unique identifier of the source.
     */
    val id: Long

    /**
     * The name of the source.
     */
    val name: String

    /**
     * Test function to check if the source is working.
     */
    fun testFunction(): String
}
