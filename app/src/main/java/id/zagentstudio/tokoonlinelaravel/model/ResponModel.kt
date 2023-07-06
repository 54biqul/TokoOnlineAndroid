package id.zagentstudio.tokoonlinelaravel.model


/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
class ResponModel {
    var success = 0
    lateinit var message: String
    var user = User()
    var produks: ArrayList<Produk> = ArrayList()
    var transaksis: ArrayList<Transaksi> = ArrayList()

    var rajaongkir = ModelAlamat()
    var transaksi = Transaksi()

    var provinsi: ArrayList<ModelAlamat> = ArrayList()
    var kota_kabupaten: ArrayList<ModelAlamat> = ArrayList()
    var kecamatan: ArrayList<ModelAlamat> = ArrayList()
}