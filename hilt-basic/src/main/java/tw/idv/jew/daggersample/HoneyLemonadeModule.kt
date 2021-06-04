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
    @Named("LemonFlavor")
    fun provideHoneyLemon(honey: Honey, lemon: Lemon): HoneyLemonade {
        return HoneyLemonade(honey, lemon)
    }
}