package id.zagentstudio.tokoonlinelaravel.room

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import id.zagentstudio.tokoonlinelaravel.model.Produk


/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
@Dao
interface DaoKeranjang {

    @Insert(onConflict = REPLACE)
    fun insert(data: Produk)

    @Delete
    fun delete(data: Produk)

    @Delete
    fun delete(data: List<Produk>)

    @Update
    fun update(data: Produk): Int

    @Query("SELECT * from keranjang ORDER BY id ASC")
    fun getAll(): List<Produk>

    @Query("SELECT * FROM keranjang WHERE id = :id LIMIT 1")
    fun getProduk(id: Int): Produk

    @Query("DELETE FROM keranjang WHERE id = :id")
    fun deleteById(id: String): Int

    @Query("DELETE FROM keranjang")
    fun deleteAll(): Int
}