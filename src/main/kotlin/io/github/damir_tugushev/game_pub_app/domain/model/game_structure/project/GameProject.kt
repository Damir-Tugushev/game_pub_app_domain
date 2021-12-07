package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project

import io.github.damir_tugushev.game_pub_app.domain.model.Datable
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.GameAnalysis
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.GamePlan
import io.github.damir_tugushev.game_pub_app.domain.model.Entity
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.documentation.GameDocumentation
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.material.GameMaterial
import io.github.damir_tugushev.game_pub_app.domain.model.user_structure.organization.Organization

public interface GameProject: Entity<Int>, Datable {
    public val lifeCycleStage: LifeCycleStage
    public val name: String

    public val gamePlan: GamePlan?
    public val gameAnalysis: GameAnalysis?

    public val gameMaterials: Set<GameMaterial>
    public val gameDocumentations: Set<GameDocumentation>
    public val organizations: Set<Organization>
}
