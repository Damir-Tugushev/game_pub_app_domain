package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.analysis

import io.github.damir_tugushev.game_pub_app.domain.model.Document

public interface GameAnalysis: Document {
    public val type: GameAnalysisType
}
