package com

import scalaz.concurrent.{Strategy, Task}
import scala.concurrent.{Future, ExecutionContext}
import com.foo._
import delorean._

object A {	

	def f(x: Int)(implicit ec: ExecutionContext, s: Strategy): Task[Int] = 
		Future { x }.toTask(ec, s)

}