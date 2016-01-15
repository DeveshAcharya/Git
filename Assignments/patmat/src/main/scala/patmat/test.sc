package patmat

//import patmat.HuffmanSuite
import patmat.Huffman._

object test {

var sec2 = encode(frenchCode)(decodedSecret)      //> sec2  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 
                                                  //| 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1
                                                  //| , 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1)
                                                  //| 

val test1 = decodedSecret                         //> test1  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
val test2 = quickEncode(frenchCode)(test1)        //> test2  : List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0,
                                                  //|  0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 
                                                  //| 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1
                                                  //| )
if (test2 == secret) println("Same") else println("Different")
                                                  //> Same
}
     