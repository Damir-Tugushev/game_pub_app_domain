package io.github.damir_tugushev.game_pub_app.domain.model.game_structure.material

import io.github.damir_tugushev.game_pub_app.domain.model.game_structure.project.GameProject
import io.github.damir_tugushev.game_pub_app.domain.model.Document

public interface GameMaterial : Document {
    public val name: String
    public val type: GameMaterialType

    public val gameProject: GameProject
}
