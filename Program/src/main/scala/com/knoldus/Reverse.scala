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

import scala.annotation.tailrec

class Reverse {
   def reverseList[AnyDataType](inputList: List[AnyDataType]): List[AnyDataType] = {

     /*nested method*/
    @tailrec def reverseListNested[AnyDataType](inputList: List[AnyDataType], outputList: List[AnyDataType]): List[AnyDataType] = inputList match {

      /*Returns reversed list when inputList is empty*/
      case List() => outputList

      /*Recursively calls reverseList method*/
      case head :: tail => reverseListNested(tail, List(head) ::: outputList)
    }
     reverseListNested(inputList,Nil)
   }
}
