package net.azsn.learningapisandfeatures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button_ui_binding).setOnClickListener() {
            startActivity(Intent(this, UIBindingActivity::class.java))
        }
        findViewById<Button>(R.id.button_data_binding).setOnClickListener() {

        }
        findViewById<Button>(R.id.button_lifecycle_aware_components).setOnClickListener() {

        }
        findViewById<Button>(R.id.button_paging_library).setOnClickListener() {

        }
        findViewById<Button>(R.id.button_data_store).setOnClickListener() {

        }
        findViewById<Button>(R.id.button_work_manager).setOnClickListener() {

        }

    }

}