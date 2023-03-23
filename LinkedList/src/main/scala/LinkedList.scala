package com.knoldus

class LinkedList[T] extends App {
  class Node(var data: T, var next: Node)

  var head: Node = null

  def insertElement(element: T): Unit = {
    head = new Node(element, head)
  }

  def deleteElement(element: T): Unit = {
    head = deletingElement(head, element)
  }

  def deletingElement(node: Node, element: T): Node = {
    if (node == null)
      null
    else if (node.data == element)
      node.next
    else {
      node.next = deletingElement(node.next, element)
      node
    }
  }

  def searchElement(element: T): Boolean = {
    searchingElement(head, element)
  }

  def searchingElement(node: Node, element: T): Boolean = {
    if (node == null)
      false
    else if (node.data == element) {
      true
    }
    else
      searchingElement(node.next, element)
  }

  def traverseAllElement(): Unit = {
    traversingAllElements(head)
  }

  def traversingAllElements(node: Node): Unit = {
    if (node != null) {
      println(node.data)
      traversingAllElements(node.next)
    }
  }
}