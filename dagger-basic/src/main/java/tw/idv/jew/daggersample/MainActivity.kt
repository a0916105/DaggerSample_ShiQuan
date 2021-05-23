package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {    //設定使用哪個layout

    lateinit var honeyLemonade: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val component = DaggerHoneyLemonadeComponent.create()
        honeyLemonade = component.getHoneyLemonade()

        textView.text = honeyLemonade.toString()
    }
}