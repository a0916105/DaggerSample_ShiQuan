package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {    //設定使用哪個layout
    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerHoneyLemonadeComponent.create().inject(this)
        /*val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)*/

        super.onCreate(savedInstanceState)

        // Don't need this anymore
        /*val component = DaggerHoneyLemonadeComponent.create()
        honeyLemonade = component.getHoneyLemonade()*/

        textView.text = honeyLemonade.toString()
    }
}