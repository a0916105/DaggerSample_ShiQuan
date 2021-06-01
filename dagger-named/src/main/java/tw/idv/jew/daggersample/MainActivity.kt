package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {
    @Inject
//    @Named("LemonFlavor")
    @LemonFlavor
    lateinit var honeyLemon: HoneyLemonade

    @Inject
//    @Named("LymeFlavor")
    @LymeFlavor
    lateinit var honeyLyme: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerHoneyLemonadeComponent.create().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = "honeyLemon type: " + honeyLemon.lemon.javaClass + "\n" +
                        "honeyLyme  type: " + honeyLyme.lemon.javaClass
    }
}