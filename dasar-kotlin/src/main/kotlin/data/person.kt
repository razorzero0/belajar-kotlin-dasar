package data

class obj(var nama:String = "yayan" ){
    var umur = 20
    var name = nama
    //OVERLOADINNG
fun alamat(kota:String ){
//this mengakses properti diluar fungsi tapi 1 class
        //thos mengakses propery object itu sendiri
    println("Nama saya : ${this.name} Alamat kota saya $kota")
}
    fun alamat(kec:String,desa:String ){
        println("Kecamatan saya:  $kec desa saya ${desa}")
    }

}