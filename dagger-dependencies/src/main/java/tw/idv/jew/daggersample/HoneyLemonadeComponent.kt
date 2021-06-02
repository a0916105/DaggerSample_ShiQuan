package tw.idv.jew.daggersample

import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class])
interface HoneyLemonadeComponent {
    fun provideHoneyLemonade(): HoneyLemonade

    @Component.Factory
    interface Factory {
        fun create(applicationComponent: ApplicationComponent): HoneyLemonadeComponent
    }
}