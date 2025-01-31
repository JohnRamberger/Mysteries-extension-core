package com.jramberger.mysteries.extension.model

enum class Language(private val languageTag: String) {
    EN("en"),
    MULTI("multi"),
    ;

    @Override
    override fun toString(): String {
        return languageTag
    }
}
