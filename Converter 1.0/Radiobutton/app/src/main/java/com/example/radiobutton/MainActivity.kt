
package com.example.radiobutton

import android.app.Activity
import android.os.Bundle

import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Конвертируем в метры
    private fun rub_usd (money:Float): Float { //checked
        return (money/68.69).toFloat()
    }
    private fun usd_rub(money: Float): Float { //checked
        return (money*68.69).toFloat()
    }
    // Конвертируем в попугаи
    private fun rub_rub(meter: Float): Float { //checked
        return (meter)
    }
    private fun rub_eur(money: Float): Float { //checked
        return (money / 77.95).toFloat()
    }
    private fun eur_rub(money: Float): Float { //checked
        return (money*77.95).toFloat()
    }
    private fun rub_gbp(money: Float): Float { //checked
        return (money / 86.9).toFloat()
    }
    private fun  gbp_rub(money: Float): Float { //checked
        return (money*86.9).toFloat()
    }
    private fun rub_kzt(money: Float): Float { //checked
        return (money / 0.17).toFloat()
    }
    private fun kzt_rub(money: Float): Float { //checked
        return (money*0.17).toFloat()
    }
    private fun usd_usd(money: Float): Float { //checked
        return (money)
    } private fun usd_eur(money: Float): Float { //checked
        return (money * 0.88).toFloat()
    }
    private fun eur_usd(money: Float): Float { //checked
        return (money/0.88).toFloat()
    }
    private fun usd_gbp(money: Float): Float { //checked
        return (money * 0.79).toFloat()
    }
    private fun gbp_usd(money: Float): Float { //checked
        return (money/0.79).toFloat()
    }
    private fun usd_kzt(money: Float): Float { //checked
        return (money *398.59).toFloat()
    }
    private fun kzt_usd(money: Float): Float { //checked
        return (money/398.59).toFloat()
    }

    private fun eur_eur(money: Float): Float { //checked
        return money
    }
    private fun eur_gbp(money: Float): Float { //checked
        return (money *0.89).toFloat()
    }
    private fun gbp_eur(money: Float): Float { //checked
        return (money/0.89).toFloat()
    }
    private fun eur_kzt(money: Float): Float { //checked
        return (money *449.09).toFloat()
    }
    private fun kzt_eur(money: Float): Float { //checked
        return (money/449.09).toFloat()

    }
    private fun gbp_gbp(money: Float): Float { //checked
        return (money)
    }
    private fun gbp_kzt(money: Float): Float { //checked
        return (money *503.9).toFloat()
    }
    private fun kzt_gbp(money: Float): Float { //checked
        return (money/503.9).toFloat()
    }
    private fun kzt_kzt(money: Float): Float {
        return (money) //checked
    }


    @Suppress("DEPRECATED_IDENTITY_EQUALS")
    fun onClick(view: View?) {
        val RadioButton0: RadioButton = findViewById(R.id.RUB) as RadioButton
        val RadioButton1: RadioButton = findViewById(R.id.USD) as RadioButton
        val RadioButton2: RadioButton = findViewById(R.id.EUR) as RadioButton
        val RadioButton3: RadioButton = findViewById(R.id.GBP) as RadioButton
        val RadioButton4: RadioButton = findViewById(R.id.KZT) as RadioButton
        val RadioButton5: RadioButton = findViewById(R.id.RUB1) as RadioButton
        val RadioButton6: RadioButton = findViewById(R.id.USD1) as RadioButton
        val RadioButton7: RadioButton = findViewById(R.id.EUR1) as RadioButton
        val RadioButton8: RadioButton = findViewById(R.id.GBP1) as RadioButton
        val RadioButton9: RadioButton = findViewById(R.id.KZT1) as RadioButton

        val inputEditText: EditText = findViewById(R.id.editText) as EditText
        if (inputEditText.text.length === 0) {
            Toast.makeText(getApplicationContext(), "Введите сумму",
                Toast.LENGTH_LONG).show()
                     return
        }
        val inputValue: Float = inputEditText.getText().toString().toFloat()
        if (RadioButton0.isChecked() && RadioButton6.isChecked()) {
            inputEditText.setText(rub_usd(inputValue).toString())
        }
        if (RadioButton1.isChecked() && RadioButton5.isChecked()) {
            inputEditText.setText(usd_rub(inputValue).toString())
        }


        if (RadioButton0.isChecked() && RadioButton5.isChecked()) {
            inputEditText.setText(rub_rub(inputValue).toString())
        }


        if (RadioButton0.isChecked() && RadioButton7.isChecked()) {
            inputEditText.setText(rub_eur(inputValue).toString())
        }
        if (RadioButton2.isChecked() && RadioButton5.isChecked()) {
            inputEditText.setText(eur_rub(inputValue).toString())
        }


        if (RadioButton0.isChecked() && RadioButton8.isChecked()) {
            inputEditText.setText(rub_gbp(inputValue).toString())
        }
        if (RadioButton3.isChecked() && RadioButton5.isChecked()) {
            inputEditText.setText(gbp_rub(inputValue).toString())
        }


        if (RadioButton0.isChecked() && RadioButton9.isChecked()) {
            inputEditText.setText(rub_kzt(inputValue).toString())
        }
        if (RadioButton4.isChecked() && RadioButton5.isChecked()) {
            inputEditText.setText(kzt_rub(inputValue).toString())
        }


        if (RadioButton1.isChecked() && RadioButton6.isChecked()) {
            inputEditText.setText(usd_usd(inputValue).toString())
        }


        if (RadioButton1.isChecked() && RadioButton7.isChecked()) {
            inputEditText.setText(usd_eur(inputValue).toString())
        }
        if (RadioButton2.isChecked() && RadioButton6.isChecked()) {
            inputEditText.setText(eur_usd(inputValue).toString())
        }


        if (RadioButton1.isChecked() && RadioButton8.isChecked()) {
            inputEditText.setText(usd_gbp(inputValue).toString())
        }
        if (RadioButton3.isChecked() && RadioButton6.isChecked()) {
            inputEditText.setText(gbp_usd(inputValue).toString())
        }


        if (RadioButton1.isChecked() && RadioButton9.isChecked()) {
            inputEditText.setText(usd_kzt(inputValue).toString())
        }
        if (RadioButton4.isChecked() && RadioButton6.isChecked()) {
            inputEditText.setText(kzt_usd(inputValue).toString())
        }


        if (RadioButton2.isChecked() && RadioButton7.isChecked()) {
            inputEditText.setText(eur_eur(inputValue).toString())
        }


        if (RadioButton2.isChecked() && RadioButton8.isChecked()) {
            inputEditText.setText(eur_gbp(inputValue).toString())
        }
        if (RadioButton3.isChecked() && RadioButton7.isChecked()) {
            inputEditText.setText(gbp_eur(inputValue).toString())
        }


        if (RadioButton2.isChecked() && RadioButton9.isChecked()) {
            inputEditText.setText(eur_kzt(inputValue).toString())
        }
        if (RadioButton4.isChecked() && RadioButton7.isChecked()) {
            inputEditText.setText(kzt_eur(inputValue).toString())
        }


        if (RadioButton3.isChecked() && RadioButton8.isChecked()) {
            inputEditText.setText(gbp_gbp(inputValue).toString())
        }


        if (RadioButton3.isChecked() && RadioButton9.isChecked()) {
            inputEditText.setText(gbp_kzt(inputValue).toString())
        }
        if (RadioButton4.isChecked() && RadioButton8.isChecked()) {
            inputEditText.setText(kzt_gbp(inputValue).toString())
        }
        if (RadioButton4.isChecked() && RadioButton9.isChecked()) {
            inputEditText.setText(kzt_kzt(inputValue).toString())
        }



    }

}