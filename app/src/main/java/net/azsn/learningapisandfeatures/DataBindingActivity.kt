package net.azsn.learningapisandfeatures

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.databinding.DataBindingUtil
import net.azsn.learningapisandfeatures.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)
        binding.article = Article.test()
    }

}