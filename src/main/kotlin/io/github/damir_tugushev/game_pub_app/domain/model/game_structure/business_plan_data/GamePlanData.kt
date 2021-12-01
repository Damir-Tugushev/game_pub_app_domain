package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan_data

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.business_plan.GamePlan
import io.github.damir_tugushev.game_pub_app.domain.model.Document

public interface GamePlanData: Document {
    public val type: GamePlanDataType
    public val gamePlan: GamePlan
}
