package data

open class kampus(open val name:String,val umur:Int){

   constructor(name: String):this(name,20){

    }
  open fun hello(){
      println("hello my name is ${this.name} umur $umur")
  }
}
