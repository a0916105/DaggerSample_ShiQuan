package tw.idv.jew.daggersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val baseComponent = DaggerApplicationComponent.create()
        val component = baseComponent.component().create()
        val component2 = baseComponent.component().create()
        val obj = component.provideHoneyLemonade()
        val obj2 = component2.provideHoneyLemonade()
        val obj3 = component2.provideHoneyLemonade()

        textView.text = "honey equal: " + (obj.honey == obj2.honey) + "\n" +
                        "bee   equal: " + (obj.honey.bee == obj2.honey.bee) + "\n" +
                        "lemon equal: " + (obj.lemon == obj2.lemon) + "\n" +
                        "lemon equal: " + (obj2.lemon == obj3.lemon)
    }
}