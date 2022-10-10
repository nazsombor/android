package net.azsn.learningapisandfeatures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.azsn.learningapisandfeatures.databinding.ActivityUibindingBinding
import java.util.*

class UIBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityUibindingBinding.inflate(layoutInflater)
        val viewModel = Article.test()
        binding.uiBindingTitle.text = viewModel.title
        binding.uiBindingDate.text = viewModel.date.toString()
        binding.uiBindingAuthor.text = getString(R.string.ui_binding_author, viewModel.author)
        binding.uiBindingArticle.text = viewModel.article
        binding.uiBindingNumberOfView.text = getString(R.string.ui_binding_number_of_views, viewModel.numberOfViews)
        setContentView(binding.root)
    }

}