package id.zagentstudio.tokoonlinelaravel.helper

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*
/**
 * Created by Sabiqul on 04/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
class Helper {

        fun gantiRupiah(string: String): String {
            return NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(Integer.valueOf(string))
        }

        fun gantiRupiah(value: Int): String {
            return NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(value)
        }

        fun gantiRupiah(value: Boolean): String {
            return NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(value)
        }

        fun setToolbar(activity: Activity, toolbar: Toolbar, title: String) {
            (activity as AppCompatActivity).setSupportActionBar(toolbar)
            activity.supportActionBar!!.title = title
            activity.supportActionBar!!.setDisplayShowHomeEnabled(true)
            activity.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }

        fun convertTanggal(tgl: String, formatBaru: String, fromatLama: String = "yyyy-MM-dd kk:mm:ss") :String{
            val dateFormat = SimpleDateFormat(fromatLama)
            val confert = dateFormat.parse(tgl)
            dateFormat.applyPattern(formatBaru)
            return dateFormat.format(confert)
        }
}