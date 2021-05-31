package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(R.layout.activity_main) {    //設定使用哪個layout
    @Inject
    lateinit var honeyLemonade: HoneyLemonade

    @Inject
    lateinit var honeyLemonade2: HoneyLemonade

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = DaggerHoneyLemonadeComponent.create()
        component.inject(this)

        super.onCreate(savedInstanceState)

        val honeyLemonade3 = component.getHoneyLemonade()

        textView.text =
            "${honeyLemonade.honey.bee}:" +
                    "${honeyLemonade2.honey.bee}:" +
                    "${honeyLemonade3.honey.bee}"
    }
}