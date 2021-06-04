package tw.idv.jew.daggersample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.RuntimeException
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class GeneralViewModelFactory @Inject constructor(
    private val providers: Map<Class<*>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {
    fun hasType(clazz: Class<*>) = providers.containsKey(clazz)

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return providers[modelClass]?.get() as? T
            ?: throw RuntimeException("Not provide ViewModelFactory for $modelClass")
    }
}