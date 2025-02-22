package org.tsdes.advanced.graphql.newsgraphql

import org.tsdes.advanced.examplenews.NewsEntity
import org.tsdes.advanced.graphql.newsgraphql.type.NewsType


class NewsConverter {

    companion object {

        fun transform(entity: NewsEntity): NewsType {

            return NewsType(
                    newsId = entity.id?.toString(),
                    authorId = entity.authorId,
                    text = entity.text,
                    country = entity.country,
                    creationTime = entity.creationTime
            )
        }

        fun transform(entities: Iterable<NewsEntity>): List<NewsType> {
            return entities.map { transform(it) }
        }
    }
}