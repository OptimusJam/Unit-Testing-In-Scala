import org.scalatest.flatspec.AnyFlatSpec

class HelloWorldSpec extends AnyFlatSpec {
  behavior of "Hello world"

  it should "start with 'Hello'" in {
    assert("Hello world".startsWith("Hello"))
  }

  it should "ends with 'world'" in {
    assert("Hello world".endsWith("world"))
  }

  behavior of "sum integers"

  it should "result 2" in {
    assert((1 + 1) == 2)
  }

}