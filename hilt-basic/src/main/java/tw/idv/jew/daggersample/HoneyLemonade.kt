package tw.idv.jew.daggersample

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

@Singleton
class Bee @Inject constructor()

@ActivityScoped
class Lemon @Inject constructor()