// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ReverseTest extends AnyFlatSpec {

  val reverse = new Reverse

  "Reverse" should "be valid when input is list of strings" in {
    val list = List("Hello", "Bye","How are you")
    val reversedList = List("How are you", "Bye", "Hello")
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when input is list of float values" in {
    val list = List(7.6F,4.2F,8.1F,6.3F)
    val reversedList = List(6.3F,8.1F,4.2F,7.6F)
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when list has positive numbers" in {
    val list = List(7,5,4,6)
    val reversedList = List(6,4,5,7)
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when list has negative numbers" in {
    val list = List(-3,-8,-5,-1)
    val reversedList = List(-1,-5,-8,-3)
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when list has all same numbers" in {
    val list = List(5,5,5,5,5)
    val reversedList = List(5,5,5,5,5)
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when list has only one element" in {
    val list = List(7)
    val reversedList = List(7)
    assert(reversedList==reverse.reverseList(list))
  }

  it should "be valid when list is empty" in {
    val list = List()
    val reversedList = List()
    assert(reversedList==reverse.reverseList(list))
  }

  it should "not be valid as list element are not reversed" in {
    val list = List(1,6,8,4,9)
    val reversedList = List(1,6,8,4,9)
    assert(!(reversedList==reverse.reverseList(list)))
  }
}
