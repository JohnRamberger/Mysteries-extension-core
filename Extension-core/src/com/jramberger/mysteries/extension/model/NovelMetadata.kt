package com.jramberger.mysteries.extension.model

data class NovelMetadata(
    /**
     * A unique identifier for the novel. This can be anything from a URL path to a UUID.
     * Used only within the Source to identify the novel.
     */
    val id: String,
    /**
     * The title of the novel.
     */
    val title: String,
    /**
     * The novel cover's URL.
     */
    val coverUrl: String? = null,
)