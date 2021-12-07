package io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee

import io.github.damir_tugushev.game_pub_app.domain.model.Datable
import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import java.sql.Timestamp

public interface User : Entity<String>, Datable {
    public val passwordEncrypted: String
}
