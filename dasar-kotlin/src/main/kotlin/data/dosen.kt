package data

class dosen: kampus{

    //emanggil contructor parent
    constructor(name:String,umur:Int) : super(name, umur){
        println("super constructor = $name dan $umur")
    }

   constructor(name:String) : super(name,23)
}