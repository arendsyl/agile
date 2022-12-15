package fr.cytech.icc
package domain.tournament

sealed trait BTree[+A]
case class Leaf[+A](a: A) extends BTree[A]
case class Node[+A](value: A, left: BTree[A], right: BTree[A]) extends BTree[A]
