// Please note : @LinkingObjects and default values are not represented in the schema and thus will not be part of the generated models
package your.package.name.here

import io.realm.RealmObject
import java.util.Date
import org.bson.types.ObjectId
import org.bson.types.Decimal128
import io.realm.RealmList

open class OptionalTypes : RealmObject() {

    var boolOptional: Boolean? = null
    var intOptional: Long? = null
    var floatOptional: Float? = null
    var doubleOptional: Double? = null
    var stringOptional: String? = null
    var dateOptional: Date? = null
    var dataOptional: ByteArray? = null
    var objectIdOptional: ObjectId? = null
    var decimal128Optional: Decimal128? = null
    var objectOptional: RequiredTypes? = null
    var boolOptionalArray: RealmList<Boolean>? = null
    var intOptionalArray: RealmList<Long>? = null
    var floatOptionalArray: RealmList<Float>? = null
    var doubleOptionalArray: RealmList<Double>? = null
    var stringOptionalArray: RealmList<String>? = null
    var dateOptionalArray: RealmList<Date>? = null
    var dataOptionalArray: RealmList<ByteArray>? = null
    var objectIdOptionalArray: RealmList<ObjectId>? = null
    var decimal128OptionalArray: RealmList<Decimal128>? = null

}
