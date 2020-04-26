package cat.maikals.data.entities.realm_entities

import cat.maikals.domain.entities.PositionsEnum
import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.UUID

open class PlayerRealmObject(
    @PrimaryKey var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var positions: RealmList<String> = RealmList(),
    var dorsal: Int = 0
    ) : RealmObject()