package net.azsn.learningapisandfeatures

import java.util.*

data class Article (
    val title: String,
    val date: Date,
    val article: String,
    val numberOfViews: Int,
    val author: String
) {
    companion object {
        fun test(): Article {
            return Article(
                title = "Example Title",
                date = Date(),
                article = "Example article...",
                author = "Uncle Bob",
                numberOfViews = 5
            )
        }
    }
}
