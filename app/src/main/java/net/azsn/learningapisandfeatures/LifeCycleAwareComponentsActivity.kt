package net.azsn.learningapisandfeatures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.azsn.learningapisandfeatures.databinding.ActivityLifeCycleAwareComponentsBinding
import net.azsn.learningapisandfeatures.lifecycleaware.MyLifeCycleObserver

class LifeCycleAwareComponentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLifeCycleAwareComponentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.lifeCycleAwareTextView.text
        lifecycle.addObserver(MyLifeCycleObserver(binding.lifeCycleAwareTextView))
    }
}