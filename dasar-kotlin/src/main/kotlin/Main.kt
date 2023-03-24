import org.w3c.dom.ranges.Range

const val APP = "ainun";
fun main() {
    //val = const, var = let
//    val l:Long = 100_000L;
//    val d:Double = 10.11;
//    val a:Int = 5;
//var b= 5;
//    b+=1;
//    println(a.toDouble() + b.toDouble());
//    println(d);
//    var t:Boolean = 1 < 5 ;
//    println(t);
//val str:String =  """nama saya,
//      >yayan""".trimMargin(">")
//    println(str)
//    val firstName = "yayan";
//    val lastName = "ainun";
//    println("${firstName} dan ${lastName}")

//    var tes: String? = "boleh null";
//    tes = null;
//    print(tes?.length);
    //AMBIL VARIABLE GLOBAL
//    print(APP);

    // ARRAY

//    val arr: Array<String> = arrayOf("ainun","rido");
    //boleh null
//     val arr: Array<String?> = arrayOfNulls(2);
//    arr[0] = "a";
//    arr[1] = null;
//    arr.set(1,"sultan")
//    print("${arr[0]} dan ${arr[1]} \n ${arr.size} ${arr.first()} dan ${arr.last()} ")

    // TIPE DATA RANGE

//    val range = 1..20 step 2;
//    val down = 10 downTo 1 ;
//    println("${range.count()} ${range.contains(2)} ${range.first} ${range.step} ${range.last}")
//    println("${down.first}")

    //matematika

//    var tambah = 10 + 10;
//    val kurang = 10-10;
//    val bagi = 10/3;
//    val kali = 5 * 5;
//    val sisa = 20 % 18;
//    val rumit = (2 + 2) * 5;
//    tambah+=5;
//    tambah++;
//    println("${tambah} ${kurang} ${bagi.toDouble()} ${kali} ${sisa} ${rumit}")
//    val tes1 = 10;
//    val tes2 = 10;
//    val hasil = tes1 == tes2;
//    val hasil2 = tes1 != tes2;
//    val hasil3 = tes1 >= tes2;
//    val hasil4 = tes1 > tes2;
//    println("${hasil} ${hasil2} ${hasil3} ${hasil4}")

    //OPERASI BOOLEAN

//    val tes1 = true;
//    val tes2 = false;
//    val hasil = tes1 && tes2;
//    val hasil2 = tes1 || tes2;
//    val hasil3 = !tes1
//     FALSE && FALSE HASILNYA FALSE
//    println("${hasil} ${hasil2} ${hasil3}")


//PENGKONDISIAN
//    val tes1 = 85;
//    val tes2 = 80;
//
//    if(tes1 <= tes2){
//        println("kamu belum lulus")
//    }else{
//        println("kamu lulus")
//    }
//
//    if(tes1 >= 95){
//        println("A")
//    }else if(tes1 >= 80 ){
//        println("B")
//    }else{
//        println("C")
//    }

    // WHEN EXPRESSION // Switch case
//    var tes1 = 1;
//tes1 = 11
//
//    when {
//        tes1 > 11 -> println("banyak")
//        else -> println("kecil")
//    }
//    val arr : Array<Int> = arrayOf(7,8,9)
//    when(tes1){
//        1 -> println("A");
//        2 -> println("B");
//        3 -> println("C");
//        4,5,6 -> println("D");
//        in arr -> println("data ada");
//        !in arr -> println("data tidak ada");
//        is Int -> println("is Integer");
//        !is Int -> println("not integer")
//        else -> println("none")
//    }

    // FOOR LOOP
//    var arr:Array<String> = arrayOf("Ainun","rido","sultan");
//    for(i in 0..(arr.size -1)){
//        println("index ke ${i} : ${arr[i]}")
//    }
//    for (i in arr){
//        println(i)
//    }
//    for(i in 1..10 step 2){
//        println(i)
//    }
//    for(i in 10 downTo 1 step 3){
//        println(i)
//    }

    // WHILE LOOP
//    var i = 2;
//    while(i < 10){
    //        println(i)
//        i++

//    }

//    while(i in 1..10){
//        println(i)
//        i++
//
//    }

    // DO WHILE
//    var i = 1;
  //pertama dieksekusi dulu meskipun false
////    i = 20;
//    do {
//        println(i)
//        i++
//    }while (i <= 10)


        // BREAK & CONTINUE
//  val arr:Array<String>  = arrayOf("a","b","c","d")
//    for (i in arr){
//        if(i == "a"){
//            continue;
//        }else if(i == "c"){
//            break
//        }
//        println(i)
//    }
//var a = 0;
//    while(true){
//        a++
//        if(a % 2==0){
//            continue;
//        }else if(a > 20){
//            break
//        }
//        println(a)
//    }

//    tes(10);
//    default();
//    named(nama = "yayan", umur = 23)
//    println("return value : ${nonVoid(10,30)}");
//    println("func kali 2 : ${single(10)}")
//    arr(0,1000,1000)
//    val nama = "yayan";
//    nama.ext();
//    println(nama to "UP")

    //FUNCTION SCOOPED
//    fun sayHello(name:String = ""):String{
        // FUNGSI RETURN IF & WHEN
//        return if(name ==""){
//             "hallo bro"
//        }else{
//             "hello $name"
//        }
//        return when (name){
//            "" -> "hallo bro";
//            else -> "hello $name"
//        }
//    }
//    println("${sayHello("yayan")}");

}
fun tes(i:Int){
    var s = i + i;
    println("tes : ${i} , ${s}")
}
// Default Parameter
fun default(i:Int = 10){
    println("default : ${i}")
}

// NAMED ARGUMRNT PARAMETER
fun named(umur:Int,nama:String){
    println("nama saya ${nama}, umur saya ${umur}")
}

//Function NON VOID / return
fun nonVoid(a:Int,b:Int):Int{
   var i = a + b;
   return i;
}

//SINGLE EXPRESSION
fun single(i:Int):Int = i * 2
//otomatis ter return tanpa membut variable lagi

    //FUNCTION VAR ARGS / Variable arguments
fun arr(i:Int,vararg arr:Int){
        var awal = i;
    for(ar in arr){
        awal+=ar
    }
        println("harganya adalah : ${awal} ")
}

    //Extenion functio
fun String.ext() = println("hello $this")

//INFIX NOTAION

infix fun String.to(type :String):String{
    if(type == "UP"){
        return this.toUpperCase();
    }else{
        return this.toLowerCase();
    }
}

// RETURN IF & WHEN



