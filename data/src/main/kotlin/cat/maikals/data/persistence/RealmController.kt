package cat.maikals.data.persistence

import io.realm.Realm
import io.realm.RealmConfiguration

object RealmController {

    private const val REALM_NAME = "FootballManagerCompanion"
    private const val REALM_PRIVATE_KEY = "LuLdSzeaYvDZMPTvmVVTKU0SWq5Bk2QK2k4QTdCt34TS3hj8dLchKbKoyglfAUM"
    private const val REALM_SCHEMA_VERSION = 1L

    private val config = RealmConfiguration.Builder()
        .name(REALM_NAME)
        .encryptionKey(REALM_PRIVATE_KEY.toByteArray())
        .schemaVersion(REALM_SCHEMA_VERSION)
        .build()

    @Synchronized
    fun getInstance() =
        Realm.getInstance(config)
}