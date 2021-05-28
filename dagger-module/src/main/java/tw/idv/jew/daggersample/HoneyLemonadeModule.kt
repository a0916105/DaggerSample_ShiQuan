package tw.idv.jew.daggersample

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
//class HoneyLemonadeModule {
abstract class HoneyLemonadeModule {
    /*@Provides
    fun provideLemon(lyme: Lyme): Lemon {
        return lyme
    }*/
    @Binds
    abstract fun provideLemon(lyme: Lyme): Lemon
}