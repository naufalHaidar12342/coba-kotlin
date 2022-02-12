fun main() {
    println("hello ini naufal!")
    println(tanggalIni())
    println("tahun kelahiran saya adalah : "+tahunLahir(20,2022))

    //meminta input user
    print("Enter text: ")
    var input = readLine()
    print("You entered: $input")

    //coba minta user input lagi
    var input2= readLine()
    println("masukkan umur kamu : "+input2)
    /*ternyata, readLine() justru dipanggil di baris bawahnya,
    * mengingat kita menggunakan System.out.println()*/
}

fun tanggalIni(): String {
    return "12 Februari 2022"
}
fun tahunLahir(umurSekarang :Int,tahunSekarang:Int): Int {
    var hasilHitung=tahunSekarang-umurSekarang
    return hasilHitung
}