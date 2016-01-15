package patmat

//import patmat.HuffmanSuite
import patmat.Huffman._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(129); 

var sec2 = encode(frenchCode)(decodedSecret);System.out.println("""sec2  : List[patmat.Huffman.Bit] = """ + $show(sec2 ));$skip(27); 

val test1 = decodedSecret;System.out.println("""test1  : List[Char] = """ + $show(test1 ));$skip(43); 
val test2 = quickEncode(frenchCode)(test1);System.out.println("""test2  : List[patmat.Huffman.Bit] = """ + $show(test2 ));$skip(63); 
if (test2 == secret) println("Same") else println("Different")}
}
     