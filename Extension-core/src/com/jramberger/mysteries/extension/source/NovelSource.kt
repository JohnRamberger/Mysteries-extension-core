package com.jramberger.mysteries.extension.source

import com.jramberger.mysteries.extension.model.Language
import com.jramberger.mysteries.extension.model.Novel
import com.jramberger.mysteries.extension.model.NovelMetadata
import kotlinx.coroutines.flow.StateFlow
import okhttp3.OkHttpClient
import okhttp3.Request

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
     * The base URL of the source.
     */
    val baseUrl: String

    /**
     * The language of the source. Use [Language] for the values.
     * If the source supports multiple languages, use [Language.MULTI].
     * @see Language
     */
    val language: Language

    /**
     * Get a paginated list of popular novels.
     * @param client The OkHttpClient instance to use for the request.
     * @param requestBuilder The Request.Builder instance to use for the request.
     * @param pageNumber The page number to fetch.
     */
    fun getPopularNovels(
        client: OkHttpClient,
        requestBuilder: Request.Builder,
        pageNumber: Int = 1,
    ): List<NovelMetadata>

    fun getNovelDetails(
        client: OkHttpClient,
        requestBuilder: Request.Builder,
        novelId: String,
    ): StateFlow<Novel>
}
