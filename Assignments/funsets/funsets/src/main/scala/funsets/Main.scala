package funsets
import FunSets._

object Main extends App {
  println(contains(singletonSet(2), 1))
  printSet(union(singletonSet(1), singletonSet(2)))
  printSet(intersect(singletonSet(1), singletonSet(2)))
  printSet(diff(singletonSet(1), singletonSet(2)))
  printSet(map(union(singletonSet(1), singletonSet(2)), x => 10*x*x))
}


