package tw.idv.jew.daggersample

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AViewModel @Inject constructor() : ViewModel() {

    val messageLiveData: MutableLiveData<String> = MutableLiveData()

    init{
        Log.d("ViewModel", "Nothing useful or easily testable is going to happen here.")
    }
}