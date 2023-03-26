package data

class car(nama:String,year:Int) {
    var name = nama
    var year = year

    //primary
    init {
        println("mobile saya = ${name}")
    }

    //secondary
    constructor(nama: String) : this(nama, 2991){
              var name=nama
            }
}