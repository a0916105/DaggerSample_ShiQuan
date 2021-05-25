package tw.idv.jew.daggersample

import dagger.Component

@Component
interface HoneyLemonadeComponent {
    fun inject(mainActivity: MainActivity)
}