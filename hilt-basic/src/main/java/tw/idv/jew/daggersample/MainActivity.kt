package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    @Inject
    @Named("LymeFlavor")
    lateinit var honeyLyme: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = honeyLemonade.toString() + "\n" + honeyLyme.toString()
    }
}