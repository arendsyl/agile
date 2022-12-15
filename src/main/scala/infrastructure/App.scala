package fr.cytech.icc
package infrastructure

import cats.effect.{ExitCode, IO, IOApp}
import com.comcast.ip4s.IpLiteralSyntax
import org.http4s.HttpApp
import org.http4s.ember.server.EmberServerBuilder

object App extends IOApp {

  private lazy val app: HttpApp[IO] = ???
  override def run(args: List[String]): IO[ExitCode] = {
    EmberServerBuilder.default[IO]
      .withPort(port"8080")
      .withHost(ipv4"0.0.0.0")
      .withHttpApp(app)
      .build
      .use(_ => IO.never)
      .as(ExitCode.Success)
  }

}
