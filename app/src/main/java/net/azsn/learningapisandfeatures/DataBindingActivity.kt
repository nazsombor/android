package net.azsn.learningapisandfeatures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import net.azsn.learningapisandfeatures.databinding.ExampleDataBinding
import net.azsn.learningapisandfeatures.observabledataobjects.AuthorObservableData

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ExampleDataBinding>(this, R.layout.activity_data_binding)
        binding.article = Article.test()
        binding.author = AuthorObservableData()

        //Without !! there is an error: Smart cast to 'AuthorObservableData' is impossible...
        binding.author!!.firstName.set("Tree")
        binding.author!!.lastName.set("Alen")

        binding.root.setOnClickListener() {
            binding.author!!.firstName.set("Woody")
        }
    }

}