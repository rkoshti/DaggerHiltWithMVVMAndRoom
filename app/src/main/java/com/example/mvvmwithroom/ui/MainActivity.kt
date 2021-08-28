package com.example.mvvmwithroom.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.mvvmwithroom.R
import com.example.mvvmwithroom.db.User
import com.example.mvvmwithroom.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener(){
           insertData()
        }

    }

/*
    fun showAlert(userModel: User?){

        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setCancelable(false)

        // Set up the input
        val firstName = EditText(this)
        // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
        firstName.hint = "Name"
        //firstName.text = userModel?.firstName

        firstName.inputType = InputType.TYPE_CLASS_TEXT
        builder.setView(firstName)

        builder.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
            when {
                firstName.text.toString().isEmpty() -> {
                    Toast.makeText(this,"Please enter name",Toast.LENGTH_SHORT).show()
                }else -> {
                    //Insert or update data in db
                    if(userModel == null){


                        insertData(userModel)

                    }

                    dialog.cancel()
                }
            }

        })
        builder.setNegativeButton(
            "Cancel",
            DialogInterface.OnClickListener { dialog, which -> dialog.cancel() }
        )

        builder.show()
    }
*/

    fun insertData() {
        var user = User("Rajesh")
        mainViewModel.insertUser(user)
}
}