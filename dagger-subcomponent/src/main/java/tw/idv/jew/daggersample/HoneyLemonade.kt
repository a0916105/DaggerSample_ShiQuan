package tw.idv.jew.daggersample

import javax.inject.Inject
import javax.inject.Singleton

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

@Singleton
class Bee @Inject constructor()

@ActivityScope
class Lemon @Inject constructor()