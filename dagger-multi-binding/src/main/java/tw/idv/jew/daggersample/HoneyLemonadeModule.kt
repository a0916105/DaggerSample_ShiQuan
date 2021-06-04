package tw.idv.jew.daggersample

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class HoneyLemonadeModule {
    @IntoSet
    @Provides
    fun provideHoneyLemonade(honey: Honey, lemon: Lemon): HoneyLemonade {
        return HoneyLemonade(honey, lemon)
    }

    @IntoSet
    @Provides
    fun provideHoneyLemonade2(honey: Honey, lemon: Lyme): HoneyLemonade {
        return HoneyLemonade(honey, lemon)
    }
}