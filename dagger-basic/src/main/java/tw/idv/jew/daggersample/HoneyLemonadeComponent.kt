package tw.idv.jew.daggersample

import dagger.Component

@Component
interface HoneyLemonadeComponent {
    fun getHoneyLemonade(): HoneyLemonade
}