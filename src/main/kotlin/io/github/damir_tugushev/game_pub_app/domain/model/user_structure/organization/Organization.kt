package io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization

import io.github.damir_tugushev.game_pub_app.domain.model.Datable
import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project.GameProject
import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.employee.Employee

public interface Organization : Entity<Int>, Datable {
    public val organizationType: OrganizationType
    public val headOrganization: Organization?
    public val name: String

    public val projects: Set<GameProject>
    public val employees: Set<Employee>
}
