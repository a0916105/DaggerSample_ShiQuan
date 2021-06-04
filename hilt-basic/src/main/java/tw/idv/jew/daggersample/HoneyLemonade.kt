package tw.idv.jew.daggersample

import android.content.Context
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(
    @ActivityContext context: Context,
    val bee: Bee
)

@Singleton
class Bee @Inject constructor(
    @ApplicationContext context: Context
)

@ActivityScoped
open class Lemon @Inject constructor()

@ActivityScoped
class Lyme @Inject constructor() : Lemon()