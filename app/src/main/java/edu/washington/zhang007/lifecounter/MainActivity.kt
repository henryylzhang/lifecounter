package edu.washington.zhang007.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private var p1Life: TextView? = null
    private var p1Minus: Button? = null
    private var p1Plus: Button? = null
    private var p1Minus5: Button? = null
    private var p1Plus5: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        p1Life = txt_p1_life
        p1Minus = btn_p1_minus
        p1Plus = btn_p1_plus
        p1Minus5 = btn_p1_minus5
        p1Plus5 = btn_p1_plus5
    }

    private fun onClick(v: View) {
        when (v.id) {
            R.id.btn_p1_minus -> p1Life?.setText((p1Life?.text.toString().toInt() - 1).toString())
            R.id.btn_p1_minus5 -> p1Life?.setText((p1Life?.text.toString().toInt() - 5).toString())
            R.id.btn_p1_plus -> p1Life?.setText((p1Life?.text.toString().toInt() + 1).toString())
            R.id.btn_p1_plus5 -> p1Life?.setText((p1Life?.text.toString().toInt() + 5).toString())
        }
    }

    private fun lifeAdjust() {

    }
}
