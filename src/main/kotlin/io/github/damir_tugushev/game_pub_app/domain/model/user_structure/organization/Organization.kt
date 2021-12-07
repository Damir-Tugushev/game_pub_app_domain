package io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization

import io.github.damir_tugushev.game_pub_app.domain.model.Datable
import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import java.sql.Timestamp

public interface Organization : Entity<Int>, Datable {
    public val organizationType: OrganizationType
    public val name: String

    public val headOrganization: Organization?
}
