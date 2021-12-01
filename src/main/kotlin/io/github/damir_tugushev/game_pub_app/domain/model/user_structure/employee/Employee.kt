package io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee

import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization.Organization
import io.github.damir_tugushev.game_pub_app.domain.model.Entity

public interface Employee: Entity<Int> {
    public val type: EmployeeType
    public val organization: Organization
    public val user: User

    public val age: Int
    public val name: String
    public val surname: String
    public val patronymic: String?
}
