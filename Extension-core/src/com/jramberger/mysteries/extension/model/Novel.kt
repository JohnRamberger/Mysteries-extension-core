package com.jramberger.mysteries.extension.model

data class Novel(
    /**
     * A unique identifier for the novel. This can be anything from a URL path to a UUID.
     */
    var id: String,
    /**
     * The title of the novel.
     */
    var title: String? = null,
    /**
     * The novel cover's URL.
     */
    var coverUrl: String? = null,
    /**
     * The author(s) of the novel.
     */
    var authors: Collection<String>? = null,
)
