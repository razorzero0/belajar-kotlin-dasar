package OOP

import data.*;

class any(){
  var a = 10.toString()
}

fun main(){
  dosen("yayan").hello()
  mahasiswa("rido").hello()
  //akses super constructor
  dosen("yayan",28)
  println(any().a + 10)
}