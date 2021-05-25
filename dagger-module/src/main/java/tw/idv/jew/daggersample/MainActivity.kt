package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerHoneyLemonadeComponent.create().inject(this)

        super.onCreate(savedInstanceState)

        textView.text = honeyLemonade.toString()
    }
}