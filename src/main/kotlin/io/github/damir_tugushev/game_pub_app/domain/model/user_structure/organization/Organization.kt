package io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization

import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import java.sql.Timestamp

public interface Organization : Entity<Int> {
    public val organizationType: OrganizationType
    public val creationDate: Timestamp
    public val name: String

    public val headOrganization: Organization?
}
