package metaconfig

import scala.meta.inputs.Input

package object hocon {
  implicit val hoconMetaconfigParser = new MetaconfigParser {
    override def fromInput(input: Input): Configured[Conf] =
      Hocon2Class.gimmeConfig(input)
  }
}
