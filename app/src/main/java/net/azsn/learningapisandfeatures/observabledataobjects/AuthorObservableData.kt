package net.azsn.learningapisandfeatures.observabledataobjects

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class AuthorObservableData {
    val firstName = ObservableField<String>()
    val lastName = ObservableField<String>()
    val age = ObservableInt()
}