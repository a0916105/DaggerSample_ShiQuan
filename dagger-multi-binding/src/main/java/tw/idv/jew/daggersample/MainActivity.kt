package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var set: Set<HoneyLemonade>

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerHoneyLemonadeComponent.create().inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = set.toString()
    }
}