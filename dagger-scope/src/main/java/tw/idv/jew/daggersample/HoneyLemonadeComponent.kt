package tw.idv.jew.daggersample

import dagger.Component

@ActivityScope
@Component
interface HoneyLemonadeComponent {
    fun getHoneyLemonade(): HoneyLemonade

    fun inject(mainActivity: MainActivity)
}