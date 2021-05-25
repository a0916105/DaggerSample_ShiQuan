package tw.idv.jew.daggersample

import dagger.Module
import dagger.Provides

@Module
class HoneyLemonadeModule {
    @Provides
    fun provideLemon(): Lemon {
        return Lyme()
    }
}