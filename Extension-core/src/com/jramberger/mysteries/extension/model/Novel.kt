package com.jramberger.mysteries.extension.model

data class Novel(
    /**
     * A unique identifier for the novel. This can be anything from a URL path to a UUID.
     */
    val id: String,
    /**
     * The title of the novel.
     */
    val title: String? = null,
    /**
     * The novel cover's URL.
     */
    val coverUrl: String? = null,
    /**
     * The author(s) of the novel.
     */
    val authors: Collection<String>? = null,
)
