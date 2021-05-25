package tw.idv.jew.daggersample

import javax.inject.Inject

class HoneyLemonade @Inject constructor(val honey: Honey, val lemon: Lemon)

class Honey @Inject constructor(val bee: Bee)

class Bee @Inject constructor()

//使用Dagger後，可替換的類別
open class Lemon

class Lyme () : Lemon()