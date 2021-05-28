package tw.idv.jew.daggersample

import dagger.Component

@Component(modules = [HoneyLemonadeModule::class])
interface HoneyLemonadeComponent {
    fun inject(mainActivity: MainActivity)
}