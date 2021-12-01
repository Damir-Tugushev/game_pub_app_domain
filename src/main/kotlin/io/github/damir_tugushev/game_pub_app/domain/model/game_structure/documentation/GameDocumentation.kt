package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.documentation

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project.GameProject
import io.github.damir_tugushev.game_pub_app.domain.model.Document

public interface GameDocumentation : Document {
    public val name: String
    public val type: GameDocumentationType

    public val gameProject: GameProject
}
