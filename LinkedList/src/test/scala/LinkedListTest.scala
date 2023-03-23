import com.knoldus.LinkedList
import org.scalatest.funsuite.AnyFunSuite

class LinkedListTest extends AnyFunSuite {

  test("Insert and Traverse Elements of type Int") {
    val linkedList = new LinkedList[Int]
    linkedList.insertElement(1)
    linkedList.insertElement(2)
    linkedList.insertElement(3)
    linkedList.traverseAllElement()
    assert(linkedList.searchElement(1) === true)
    assert(linkedList.searchElement(4) === false)
    assert(linkedList.searchElement(3) === true)
    linkedList.deleteElement(2)
    assert(linkedList.searchElement(2) === false)
    assert(linkedList.searchElement(3) === true)
    linkedList.traverseAllElement()
  }

  test("Insert and Traverse Elements of type String") {
    val linkedList = new LinkedList[String]
    linkedList.insertElement("Satvik")
    linkedList.insertElement("Sheshnath")
    linkedList.insertElement("Vanshika")
    linkedList.traverseAllElement()
    assert(linkedList.searchElement("Satvik") === true)
    assert(linkedList.searchElement("jkl") === false)
    assert(linkedList.searchElement("Vanshika") === true)
    linkedList.deleteElement("Sheshnath")
    assert(linkedList.searchElement("Sheshnath") === false)
    assert(linkedList.searchElement("Vanshika") === true)
    linkedList.traverseAllElement()
  }

  test("Insert and Traverse Elements of type Long") {
    val linkedList = new LinkedList[Long]
    linkedList.insertElement(1000L)
    linkedList.insertElement(2000L)
    linkedList.insertElement(3000L)
    linkedList.traverseAllElement()
    assert(linkedList.searchElement(1000L) === true)
    assert(linkedList.searchElement(4000L) === false)
    assert(linkedList.searchElement(3000L) === true)
    linkedList.deleteElement(2000L)
    assert(linkedList.searchElement(2000L) === false)
    assert(linkedList.searchElement(3000L) === true)
    linkedList.traverseAllElement()
  }

}
