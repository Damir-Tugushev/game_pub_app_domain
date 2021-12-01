package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.analysis_data

import io.github.damir_tugushev.game_pub_app.domain.model.Document
import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.analysis.GameAnalysis

public interface GameAnalysisData: Document {
    public val type: GameAnalysisDataType
    public val gameAnalysis: GameAnalysis
}
