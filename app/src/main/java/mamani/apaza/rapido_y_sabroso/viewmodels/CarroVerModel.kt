package mamani.apaza.rapido_y_sabroso.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mamani.apaza.rapido_y_sabroso.models.CarroModel

class CarroVerModel : ViewModel() {
    private val _carrito = MutableLiveData<List<CarroModel>>(emptyList())
    val carrito: LiveData<List<CarroModel>> get() = _carrito

    fun addProduct(product: CarroModel) {
        val updatedList = _carrito.value?.toMutableList() ?: mutableListOf()
        updatedList.add(product)
        _carrito.value = updatedList
        Log.d("CarroVerModel", "Producto añadido: ${product.name}. Lista actual: $updatedList")
    }

    fun removeProduct(product: CarroModel) {
        val updatedList = _carrito.value?.toMutableList() ?: mutableListOf()
        updatedList.remove(product)
        _carrito.value = updatedList
        Log.d("CarroVerModel", "Producto eliminado: ${product.name}. Lista actual: $updatedList")
    }
}

