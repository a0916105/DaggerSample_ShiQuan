package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import dagger.Lazy  //Interface Lazy<T>
import javax.inject.Inject
import javax.inject.Provider

class MainActivity : AppCompatActivity(R.layout.activity_main) {    //設定使用哪個layout
    @Inject
    lateinit var lazy: Lazy<HoneyLemonade>

    @Inject
    lateinit var provider: Provider<HoneyLemonade>

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerHoneyLemonadeComponent.create().inject(this)
        super.onCreate(savedInstanceState)

        textView.text =
        "lazy get equal:" + (lazy.get() == lazy.get()) + "\n" +
        "provider get equal:" + (provider.get() == provider.get())
    }
}