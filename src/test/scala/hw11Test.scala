import org.scalatest.FunSuite

class hw11Test extends FunSuite {
    test ("hw11.d") {
      assert(hw11.div(3,56) === Vector(3, 6, 7, 9, 12, 14, 15, 18, 21))
    }
}
