package net.azsn.learningapisandfeatures.lifecycleaware

import android.widget.TextView
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import net.azsn.learningapisandfeatures.databinding.ActivityLifeCycleAwareComponentsBinding

class MyLifeCycleObserver(val textView: TextView) : DefaultLifecycleObserver {


    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        System.out.println("OnStart event observed by MyLifeCycleObserver")
        textView.text = "This text was set from the observer in the onStart event."

    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        System.out.println("OnStop event observed by MyLifeCycleObserver")
    }

}