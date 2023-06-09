package com.knoldus

/* Define an abstract CRUDOperations class that defines the basic methods
   for creating, reading, updating and deleting elements of type T */
abstract class CRUDOperations[T] {

  // Create a new element of type T
  def create(element: T): Seq[T]

  // Read all elements of type T
  def read(): Seq[T]

  // Update an element at a given index with a new element of type T
  def update(index: Int, element: T): Seq[T]

  // Delete an element of type T
  def delete(element: T): Seq[T]
}

// Implement the CRUDOperations class for List elements
class ListCRUDOperations[T] extends CRUDOperations[T] {

  // Define an empty list of elements of type T
  private var elements: List[T] = List.empty[T]

  // Create a new element of type T and add it to the list
  override def create(element: T): List[T] = {
    elements = elements :+ element
    elements
  }

  // Read all elements of type T in the list
  override def read(): List[T] = {
    elements
  }

  // Update an element at a given index with a new element of type T
  override def update(index: Int, element: T): List[T] = {
    if (index >= 0 && index < elements.length) {
      elements = elements.updated(index, element)
    }
    elements
  }

  // Delete an element of type T from the list
  override def delete(element: T): Seq[T] = {
    elements = elements.filterNot(_ == element)
    elements
  }
}

// Implement the CRUDOperations class for Seq elements
class SequenceCRUDOperations[T] extends CRUDOperations[T] {

  // Define an empty sequence of elements of type T
  private var elements: Seq[T] = Seq.empty[T]

  // Create a new element of type T and add it to the sequence
  override def create(element: T): Seq[T] = {
    elements = elements :+ element
    elements
  }

  // Read all elements of type T in the sequence
  override def read(): Seq[T] = {
    elements
  }

  // Update an element at a given index with a new element of type T
  override def update(index: Int, element: T): Seq[T] = {
    if (index >= 0 && index < elements.length) {
      elements = elements.updated(index, element)
    }
    elements
  }

  // Delete an element of type T from the sequence
  override def delete(element: T): Seq[T] = {
    elements = elements.filterNot(_ == element)
    elements
  }
}
