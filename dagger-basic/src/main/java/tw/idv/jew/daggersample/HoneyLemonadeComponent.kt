package tw.idv.jew.daggersample

import dagger.Component

@Component
interface HoneyLemonadeComponent {
    // Don't need this anymore
    // fun getHoneyLemonade(): HoneyLemonade

    fun inject(mainActivity: MainActivity)
}