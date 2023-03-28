package OOP

abstract class abstrak {
   abstract var name:String;
    abstract fun main();
}

class tes : abstrak(){
    override var name: String = "yayan";
    override fun main(){
        println("ini abstrsk : ${this.name}")
    }
}

fun main(){
    tes().main()
}