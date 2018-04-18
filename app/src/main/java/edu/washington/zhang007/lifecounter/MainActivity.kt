package edu.washington.zhang007.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    private var p1Life: TextView? = null
    private var p1Sub1: Button? = null
    private var p1Add1: Button? = null
    private var p1Sub5: Button? = null
    private var p1Add5: Button? = null
    private var p2Life: TextView? = null
    private var p2Sub1: Button? = null
    private var p2Add1: Button? = null
    private var p2Sub5: Button? = null
    private var p2Add5: Button? = null
    private var p3Life: TextView? = null
    private var p3Sub1: Button? = null
    private var p3Add1: Button? = null
    private var p3Sub5: Button? = null
    private var p3Add5: Button? = null
    private var p4Life: TextView? = null
    private var p4Sub1: Button? = null
    private var p4Add1: Button? = null
    private var p4Sub5: Button? = null
    private var p4Add5: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        p1Life = txt_p1_life
        p1Sub1 = btn_p1_sub1
        p1Add1 = btn_p1_add1
        p1Sub5 = btn_p1_sub5
        p1Add5 = btn_p1_add5

        p2Life = txt_p2_life
        p2Sub1 = btn_p2_sub1
        p2Add1 = btn_p2_add1
        p2Sub5 = btn_p2_sub5
        p2Add5 = btn_p2_add5

        p3Life = txt_p3_life
        p3Sub1 = btn_p3_sub1
        p3Add1 = btn_p3_add1
        p3Sub5 = btn_p3_sub5
        p3Add5 = btn_p3_add5

        p4Life = txt_p4_life
        p4Sub1 = btn_p4_sub1
        p4Add1 = btn_p4_add1
        p4Sub5 = btn_p4_sub5
        p4Add5 = btn_p4_add5
    }

    fun onClicker(v: View) {
        val vString = v.resources.getResourceName(v.id).substring(39)
        // Log.i(TAG, vString)
        val player = vString.substring(4, 6)
        val operation = vString.substring(7, 10)
        val amount = vString.substring (10)

        when (player) {
            "p1" -> lifeAdjust(p1Life, operation, amount)
            "p2" -> lifeAdjust(p2Life, operation, amount)
            "p3" -> lifeAdjust(p3Life, operation, amount)
            "p4" -> lifeAdjust(p4Life, operation, amount)
        }
    }

    private fun lifeAdjust(v: TextView?, o: String, a: String) {
        val lifeString = v?.text.toString()
        if (o == "add") {
            v?.setText(add(lifeString, a.toInt()))
        } else { // o == "sub"
            v?.setText(sub(lifeString, a.toInt()))
        }
    }

    private fun add(life: String, amount: Int): String {
        return (life.toInt() + amount).toString()
    }

    private fun sub(life:String, amount: Int): String {
        return (life.toInt() - amount).toString()
    }
}
