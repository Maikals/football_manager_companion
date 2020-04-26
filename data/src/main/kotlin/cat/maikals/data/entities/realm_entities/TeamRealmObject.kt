package cat.maikals.data.entities.realm_entities

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.UUID

open class TeamRealmObject(
    @PrimaryKey var id: String = UUID.randomUUID().toString(),
    var name: String = "",
    var players: RealmList<PlayerRealmObject> = RealmList()
) : RealmObject()