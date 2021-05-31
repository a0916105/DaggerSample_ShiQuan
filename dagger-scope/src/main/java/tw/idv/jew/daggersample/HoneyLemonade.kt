package tw.idv.jew.daggersample

import javax.inject.Inject

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

@ActivityScope
class Bee @Inject constructor()

class Lemon @Inject constructor()