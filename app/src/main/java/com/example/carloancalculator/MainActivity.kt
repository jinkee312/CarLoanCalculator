package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener(){
            val inputvalue1 = editTextCarPrice.text.toString()
            val inputvalue2 = editTextDownPayment.text.toString()
            val inputvalue3 = editTextLoanPeriod.text.toString()
            val inputvalue4 = editTextInterestRate.text.toString()

            val loan:Double = inputvalue1.toDouble() - inputvalue2.toDouble()
            val interest = loan * inputvalue4.toDouble() * inputvalue3.toDouble()
            val monthRepayment = (loan + interest)/ inputvalue3.toDouble() / 12

            textViewLoan.text = "%.2f".format(loan)
            textViewInterest.text = "%.2f".format(interest)
            textViewMonthlyRepayment.text = "%.2f".format(monthRepayment)
        }
//        btnsubmit.setOnClickListener(){
//
////            val inputValue = txtValue.text.toString()
////
////            val amount:Double = inputValue * 0.123456
////
////            txtValue.text = "%.2f".format(amount)
//        }
    }
}
