package id.zagentstudio.tokoonlinelaravel.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.zagentstudio.tokoonlinelaravel.R
import id.zagentstudio.tokoonlinelaravel.helper.SharedPref
import kotlinx.android.synthetic.main.activity_masuk.*


/**
 * Created by Sabiqul on 05/07/2023.
 * BeeMedia
 * sabiqul.ulum@gmail.com
 */
class MasukActivity : AppCompatActivity() {

    lateinit var s: SharedPref

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        s = SharedPref(this)

        mainButton()
    }

    private fun mainButton(){
        btn_prosesLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btn_register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

}
