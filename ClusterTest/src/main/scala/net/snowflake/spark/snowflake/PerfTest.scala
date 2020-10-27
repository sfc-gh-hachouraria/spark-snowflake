package net.snowflake.spark.snowflake

import net.snowflake.spark.snowflake.benchmarks.{PerformanceSuite, TPCDSSuite}

object PerfTest {
  def main(args: Array[String]): Unit = {
    val columnMappingSuite: org.scalatest.FunSuite = new TPCDSSuite

    columnMappingSuite.execute()
  }
}