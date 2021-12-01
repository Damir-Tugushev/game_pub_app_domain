package io.github.damir_tugushev.game_pub_app.domain.model

import java.sql.Blob
import java.sql.Timestamp

public interface Document : Entity<Int> {
    public val content: Blob?
    public val creationDate: Timestamp
}
