package tw.idv.jew.daggersample

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @IntoMap
    @ClassKey(AViewModel::class)
    @Binds
    abstract fun provideAViewModel(viewModel: AViewModel): ViewModel

    @IntoMap
    @ClassKey(BViewModel::class)
    @Binds
    abstract fun provideBViewModel(viewModel: BViewModel): ViewModel
}