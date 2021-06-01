package tw.idv.jew.daggersample

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class HoneyLemonadeModule {

    @Provides
    @Named("LemonFlavor")
    fun provideHoneyLemon(honey: Honey, lemon: Lemon): HoneyLemonade {
        return HoneyLemonade(honey, lemon)
    }

    @Provides
    @Named("LymeFlavor")
    fun provideHoneyLyme(honey: Honey, lyme: Lyme): HoneyLemonade {
        return HoneyLemonade(honey, lyme)
    }
}