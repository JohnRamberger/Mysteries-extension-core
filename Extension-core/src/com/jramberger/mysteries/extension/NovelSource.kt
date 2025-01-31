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
     * The language of the source. Use [Language] for the values.
     * If the source supports multiple languages, use [Language.MULTI].
     * @see Language
     */
    val language: String

    /**
     * Test function to check if the source is working.
     */
    fun testFunction(): String
}
