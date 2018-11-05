// for で実装パターン
/*
fun sum(numbers: List<Long>): Long {
    var sum = 0L
    for (n in numbers) {
        sum += n
    }
    return sum
}*/

// 再帰呼び出しパターン
/*
fun sum(numbers: List<Long>): Long = 
  if (numbers.isEmpty()) 0
  else numbers.first() + sum(numbers.drop(1))
*/
  
// スタックオーバーフロー起こさないようにTCOパターン
tailrec fun sum(numbers: List<Long>, accumulator: Long = 0): Long =
  if (numbers.isEmpty()) accumulator
  else sum(numbers.drop(1), accumulator + numbers.first())
  
fun main(args: Array<String>) {
    var result = sum((1L..123).toList())
    println(result)
}