package com.knoldus.seq

class Sequence {

  private var sequenceString: Seq[String] = Seq.empty[String]
  private var sequenceInt: Seq[Int] = Seq.empty[Int]

  // Check the type of element, if it is int save it to sequenceInt, if it is string save it to sequenceString, else return IllegalArgumentException,  return the size
  def store(element: Any): Int = {
    element match {
      case integervalue: Int => {
        sequenceInt = sequenceInt :+ integervalue
        sequenceInt.length
      }

      case stringValue: String => {
        sequenceString = sequenceString :+ stringValue
        sequenceString.length
      }
      case _ => throw new IllegalArgumentException
    }

  }


  // Check the type of element, if it is int remove it from sequenceInt, if it is string remove it from sequenceString, else return IllegalArgumentException,  return the size
  def removeElement(element: Any): Int = {
    element match {
      case integervalue: Int => {
        sequenceInt = sequenceInt.filter(_ != integervalue)
        sequenceInt.length
      }

      case stringValue: String => {
        sequenceString = sequenceString.filter(_ != stringValue)
        sequenceString.length
      }
      case _ => throw new IllegalArgumentException
    }

  }
}
