package OOP
//abstrac tidak bisa dipanggil cuma bisa diturunkan
abstract  class abs(val name: String){

}
class anyClass(name:String = "a") : abs(name) {
    override fun toString(): String {
        return "ovveride to String :  ${name}";
    }
    override fun hashCode(): Int {
        return name.hashCode()
    }
    // TIPE DATA DIIKUTI ?  MAKA BOLEH NULL
    override fun equals(other: Any?): Boolean {
       return when (other){
            is anyClass -> other.name == this.name
            else -> false
        }
    }
}

class hp(val name:String)
class laptop(val name:String)
//mengubah tipe data any secara paksa
fun printString(any:Any){
    // ? maka boleh null
   val a:String? = any as? String
 println(a);
}
//ANY TIPE DATA SEMUA
fun hello (any:Any){
//    if(any is laptop){
//    println("LAPTOP : ${any.name}")
//    }else if(any is hp){
//        println("HP : ${any.name}")
//    }else{
//        println("hello ${any}")
//    }
    //MENGUBSH TIPE DATA
    when(any){
        is laptop -> println("LAPTOP : ${any.name}");
        is hp ->   println("HP : ${any.name}");
        else ->   println("hello ${any}")
    }

}

fun main(){
    hello(hp("samsung"))
    hello(laptop("ACER"))
    printString(1)
    println(anyClass("EKO").toString())
    val a = anyClass("Kediri");
    val b = anyClass("Kediri");
    println(a == b)
    println("${a.hashCode()} dan ${b.hashCode()}")


}