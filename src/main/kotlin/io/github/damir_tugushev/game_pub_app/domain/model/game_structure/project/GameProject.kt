package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project

import io.github.damir_tugushev.game_pub_app.domain.model.Datable
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.GameAnalysis
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.GamePlan
import io.github.damir_tugushev.game_pub_app.domain.model.Entity

public interface GameProject: Entity<Int>, Datable {
    public val lifeCycleStage: LifeCycleStage
    public val name: String

    public val gamePlan: GamePlan
    public val gameAnalysis: GameAnalysis
}
