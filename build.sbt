scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.skinny-framework" %% "skinny-orm"        % "2.2.+",
  "org.skinny-framework" %% "skinny-task"       % "2.2.+",
  "com.h2database"       %  "h2"                % "1.4.+",
  "ch.qos.logback"       %  "logback-classic"   % "1.2.+"
)

// these commands will be executed when invoking `sbt console`
initialCommands := """
import scalikejdbc._
import skinny.orm._
skinny.DBSettings.initialize()
implicit val dbSession = AutoSession
"""
