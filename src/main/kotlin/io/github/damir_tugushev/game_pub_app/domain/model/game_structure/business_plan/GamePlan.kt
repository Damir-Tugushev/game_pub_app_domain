package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan

import io.github.damir_tugushev.game_pub_app.domain.model.Document
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.plan_data.GamePlanData

public interface GamePlan: Document {
    public val type: GamePlanType
    public val gamePlanData: Set<GamePlanData>
}
