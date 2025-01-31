package com.jramberger.mysteries.extension.ext

import okhttp3.Response
import org.jsoup.Jsoup

fun Response.asJsoup() = Jsoup.parse(body?.string() ?: "")
