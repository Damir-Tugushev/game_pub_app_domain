package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis

import io.github.damir_tugushev.game_pub_app.domain.model.Document
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.marketing_analysis.analysis_data.GameAnalysisData

public interface GameAnalysis: Document {
    public val type: GameAnalysisType
    public val gameAnalysisData: Set<GameAnalysisData>
}
