/*
 * Zinc - The incremental compiler for Scala.
 * Copyright Lightbend, Inc. and Mark Harrah
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

// package sjsonnew
// package support.scalajson.unsafe

// import sjsonnew.shaded.scalajson.ast.unsafe._
// import scala.collection.mutable
// import jawn.{ SupportParser, MutableFacade }

// object FixedParser extends SupportParser[JValue] {
//   implicit val facade: MutableFacade[JValue] =
//     new MutableFacade[JValue] {
//       def jnull() = JNull
//       def jfalse() = JFalse
//       def jtrue() = JTrue
//       def jnum(s: String) = JNumber(s)
//       def jint(s: String) = JNumber(s)
//       def jstring(s: String) = JString(s)
//       def jarray(vs: mutable.ArrayBuffer[JValue]) = JArray(vs.toArray)
//       def jobject(vs: mutable.Map[String, JValue]) = {
//         val array = new Array[JField](vs.size)
//         var i = 0
//         vs.foreach {
//           case (key, value) =>
//             array(i) = JField(key, value)
//             i += 1
//         }
//         JObject(array)
//       }
//     }
// }
