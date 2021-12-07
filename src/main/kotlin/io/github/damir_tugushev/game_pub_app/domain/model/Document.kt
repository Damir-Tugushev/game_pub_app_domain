package io.github.damir_tugushev.game_pub_app.domain.model

public interface Document : Entity<Int> {
    public val contentUri: String
    public val creationDate: String
}
