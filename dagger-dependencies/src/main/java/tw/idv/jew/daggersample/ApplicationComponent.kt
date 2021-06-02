package tw.idv.jew.daggersample

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationComponent {
    fun provideBee(): Bee
}