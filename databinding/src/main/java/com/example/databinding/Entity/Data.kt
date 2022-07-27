import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class User {
    var age = ObservableInt()
    var name = ObservableField<String>()
}

