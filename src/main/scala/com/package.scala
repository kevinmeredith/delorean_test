package com

import scalaz.concurrent.Strategy

package object foo {

	val `asdasd` = 42

	implicit val dontUseTheDefaultStrategy: Strategy = null
	implicit val theDefaultStrategyCausesProblems: Strategy = null

}