package mamani.apaza.rapido_y_sabroso.models

import android.os.Parcel
import android.os.Parcelable

data class CarroModel(
    val image: Int,
    val name: String,
    val price: String,
    val rating: String
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(price)
        parcel.writeString(rating)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CarroModel> {
        override fun createFromParcel(parcel: Parcel): CarroModel {
            return CarroModel(parcel)
        }

        override fun newArray(size: Int): Array<CarroModel?> {
            return arrayOfNulls(size)
        }
    }
}



/*
package mamani.apaza.rapido_y_sabroso.models

data class CarroModel(
    val image: Int,
    val name: String,
    val price: String, // Asegúrate de que este formato sea consistente
    val rating: String
)

*/
