package tw.idv.jew.daggersample

import dagger.Subcomponent

@ActivityScope
@Subcomponent
interface HoneyLemonadeComponent {
    fun provideHoneyLemonade(): HoneyLemonade

    @Subcomponent.Factory
    interface Factory {
        fun create(): HoneyLemonadeComponent
    }
}