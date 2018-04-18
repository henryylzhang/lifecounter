package edu.washington.zhang007.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast

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
    private var p1Name: EditText? = null
    private var p2Name: EditText? = null
    private var p3Name: EditText? = null
    private var p4Name: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        p1Name = txt_p1_name
        p1Life = txt_p1_life
        p1Sub1 = btn_p1_sub1
        p1Add1 = btn_p1_add1
        p1Sub5 = btn_p1_sub5
        p1Add5 = btn_p1_add5

        p2Name = txt_p2_name
        p2Life = txt_p2_life
        p2Sub1 = btn_p2_sub1
        p2Add1 = btn_p2_add1
        p2Sub5 = btn_p2_sub5
        p2Add5 = btn_p2_add5

        p3Name = txt_p3_name
        p3Life = txt_p3_life
        p3Sub1 = btn_p3_sub1
        p3Add1 = btn_p3_add1
        p3Sub5 = btn_p3_sub5
        p3Add5 = btn_p3_add5

        p4Name = txt_p4_name
        p4Life = txt_p4_life
        p4Sub1 = btn_p4_sub1
        p4Add1 = btn_p4_add1
        p4Sub5 = btn_p4_sub5
        p4Add5 = btn_p4_add5

        p1Life?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            if (p1Life?.text.toString().toInt() <= 0)
                if (p1Name?.text.toString() == "") {
                    Toast.makeText(this@MainActivity, "Player 1 LOSES!", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this@MainActivity, "${p1Name?.text} LOSES!", Toast.LENGTH_LONG).show()
                }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        p2Life?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (p2Life?.text.toString().toInt() <= 0)
                    if (p2Name?.text.toString() == "") {
                        Toast.makeText(this@MainActivity, "Player 1 LOSES!", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@MainActivity, "${p2Name?.text} LOSES!", Toast.LENGTH_LONG).show()
                    }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        p3Life?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (p3Life?.text.toString().toInt() <= 0)
                    if (p3Name?.text.toString() == "") {
                        Toast.makeText(this@MainActivity, "Player 1 LOSES!", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@MainActivity, "${p3Name?.text} LOSES!", Toast.LENGTH_LONG).show()
                    }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })

        p4Life?.addTextChangedListener(object: TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
                if (p4Life?.text.toString().toInt() <= 0)
                    if (p4Name?.text.toString() == "") {
                        Toast.makeText(this@MainActivity, "Player 1 LOSES!", Toast.LENGTH_LONG).show()
                    } else {
                        Toast.makeText(this@MainActivity, "${p4Name?.text} LOSES!", Toast.LENGTH_LONG).show()
                    }
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
        })
    }

    fun onClicker(v: View) {
        val vString = v.tag.toString()
        val player = vString.substring(0, 2)
        val operation = vString.substring(3, 6)
        val amount = vString.substring (7)

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

//class LifeWatcher(con: AppCompatActivity, ) : TextWatcher {
//    override fun afterTextChanged(playerLife: Editable?) {
//        val lifeString = playerLife.toString()
//        if (lifeString.toInt() <= 0)
//            if (lifeString == "") {
//                Toast.makeText(this.con, "Player 1 LOSES!", Toast.LENGTH_LONG).show()
//            } else {
//                Toast.makeText(this@MainActivity, "${p1Name?.text} LOSES!", Toast.LENGTH_LONG).show()
//            }
//    }
//
//    override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//    }
//
//    override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//    }
//}
