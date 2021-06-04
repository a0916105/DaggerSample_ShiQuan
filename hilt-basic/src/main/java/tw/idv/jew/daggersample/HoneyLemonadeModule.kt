package tw.idv.jew.daggersample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class HoneyLemonadeModule {
    @Provides
    @Named("LymeFlavor")
    fun provideHoneyLyme(honey: Honey, lyme: Lyme): HoneyLemonade {
        return HoneyLemonade(honey, lyme)
    }
}