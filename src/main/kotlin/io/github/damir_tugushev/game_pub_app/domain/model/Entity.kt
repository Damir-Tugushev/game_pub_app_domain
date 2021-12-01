package io.github.damir_tugushev.game_pub_app.domain.model

public interface Entity<T: Any> {
    public val id: T
    public val description: String
}
