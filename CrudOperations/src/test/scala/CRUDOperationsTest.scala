package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class CRUDOperationsTest extends AnyFunSuite {
  test("ListCRUD should create, read, update, and delete elements in a list") {
    val listCRUD = new ListCRUDOperations[Int]

    assert(listCRUD.create(1) == List(1))
    assert(listCRUD.create(2) == List(1, 2))
    assert(listCRUD.create(3) == List(1, 2, 3))
    assert(listCRUD.read() == List(1, 2, 3))
    assert(listCRUD.update(2, 4) == List(1, 2, 4))
    assert(listCRUD.delete(2) == List(1, 4))
  }

  test("SeqCRUD should create, read, update, and delete elements in a sequence") {
    val seqCRUD = new SequenceCRUDOperations[String]

    assert(seqCRUD.create("Satvik") == Seq("Satvik"))
    assert(seqCRUD.create("Sheshnath") == Seq("Satvik", "Sheshnath"))
    assert(seqCRUD.create("Ayush") == Seq("Satvik", "Sheshnath", "Ayush"))
    assert(seqCRUD.read() == Seq("Satvik", "Sheshnath", "Ayush"))
    assert(seqCRUD.update(2, "Mohika") == Seq("Satvik", "Sheshnath", "Mohika"))
    assert(seqCRUD.delete("Sheshnath") == Seq("Satvik", "Mohika"))
  }
}
