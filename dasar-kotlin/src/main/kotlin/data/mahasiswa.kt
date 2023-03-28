package data
open class mahasiswa(name:String): kampus(name){
    override val name = "YAYAN";
        final override fun hello(){
            //SUPER MENGAKSES parent
            val nama = super.name
       println("Override : hello my name is ${name} super : $nama")
            super.hello()
    }
}

class bem(name:String):mahasiswa(name){
    override val name = "sultan";
    val nama = super.name
    fun tes(){
        println("Override : hello my name is ${name} super : $nama")
    }
}