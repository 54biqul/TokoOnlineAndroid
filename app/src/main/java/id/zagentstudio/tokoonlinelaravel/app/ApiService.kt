package id.zagentstudio.tokoonlinelaravel.app

import id.zagentstudio.tokoonlinelaravel.model.Chekout
import id.zagentstudio.tokoonlinelaravel.model.ResponModel
import id.zagentstudio.tokoonlinelaravel.model.rajaongkir.ResponOngkir
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
interface ApiService {
    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("phone") nomortlp: String,
        @Field("password") password: String,
        @Field("fcm") fcm: String
    ): Call<ResponModel>

    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String,
        @Field("fcm") fcm: String
    ): Call<ResponModel>

    @POST("chekout")
    fun chekout(
        @Body data: Chekout
    ): Call<ResponModel>

    @GET("produk")
    fun getProduk(): Call<ResponModel>

    @GET("province")
    fun getProvinsi(
        @Header("key") key: String
    ): Call<ResponModel>

    @GET("city")
    fun getKota(
        @Header("key") key: String,
        @Query("province") id: String
    ): Call<ResponModel>

    @GET("kecamatan")
    fun getKecamatan(
        @Query("id_kota") id: Int
    ): Call<ResponModel>

    @FormUrlEncoded
    @POST("cost")
    fun ongkir(
        @Header("key") key: String,
        @Field("origin") origin: String,
        @Field("destination") destination: String,
        @Field("weight") weight: Int,
        @Field("courier") courier: String
    ): Call<ResponOngkir>

    @GET("chekout/user/{id}")
    fun getRiwayat(
        @Path("id") id: Int
    ): Call<ResponModel>

    @POST("chekout/batal/{id}")
    fun batalChekout(
        @Path("id") id: Int
    ): Call<ResponModel>
}