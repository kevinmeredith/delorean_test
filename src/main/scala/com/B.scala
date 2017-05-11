package com

import delorean._
import scala.concurrent.{Future, ExecutionContext}
import com.foo._

object B {

	def g(a: String)(implicit ec: ExecutionContext): Future[Int] = A.f(42).unsafeToFuture
	
}