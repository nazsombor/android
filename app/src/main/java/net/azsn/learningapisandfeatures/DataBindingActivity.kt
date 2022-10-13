package net.azsn.learningapisandfeatures

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.databinding.DataBindingUtil
import net.azsn.learningapisandfeatures.databinding.ActivityDataBindingBinding
import net.azsn.learningapisandfeatures.observabledataobjects.AuthorObservableData

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityDataBindingBinding>(this, R.layout.activity_data_binding)
        binding.article = Article.test()
        binding.author = AuthorObservableData()
        binding.author!!.firstName.set("Tree")
        binding.author!!.lastName.set("Alen")

        binding.root.setOnClickListener() {
            binding.author!!.firstName.set("Woody")
        }
    }

}