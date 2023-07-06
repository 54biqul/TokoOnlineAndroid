package id.zagentstudio.tokoonlinelaravel.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
@Entity(tableName = "alamat")
class Alamat {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idTb")
    var idTb = 0

    var id = 0
    var name = ""
    var phone = ""
    var type = ""
    var alamat = ""

    var id_provinsi = 0
    var id_kota = 0
    var id_kecamatan = 0
    var provinsi = ""
    var kota = ""
    var kecamatan = ""
    var kodepos = ""
    var isSelected = false
}