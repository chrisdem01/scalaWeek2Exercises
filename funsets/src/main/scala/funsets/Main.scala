package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  printSet(union(Set(1,2,3),Set(2,3,4)))

  printSet(intersect(Set(1,2,3),Set(2,3,4)))

  printSet(diff(Set(1,2,3),Set(2,3,4)))

  printSet(filter(Set(1,2,3),Set(2,3,4)))

  printSet(map(Set(1,2,3), y => 1))

}
