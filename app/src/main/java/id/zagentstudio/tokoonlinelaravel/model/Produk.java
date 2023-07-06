package id.zagentstudio.tokoonlinelaravel.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
@Entity(tableName = "keranjang")
public class Produk implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "idTb")
    public int idTb;

    public int id;
    public String name;
    public String harga;
    public String deskripsi;
    public int category_id;
    public String image;
    public String created_at;
    public String updated_at;

    public int discount = 0;
    public int jumlah = 1;
    public boolean selected = true;
}