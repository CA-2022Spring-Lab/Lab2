package rv32i

import chisel3.iotesters.{Driver, TesterOptionsManager}
import utils.TutorialRunner

object Tester {
  val examples = Map(
      "InstructionMem" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new InstructionMem(), manager) {
          (c) => new InstructionMemTests(c)
        }
      },
      "Top" -> { (manager: TesterOptionsManager) =>
        Driver.execute(() => new Top(), manager) {
          (c) => new TopTests(c)
        }
      }
  )
  def main(args: Array[String]): Unit = {
    TutorialRunner("examples", examples, args)
  }
}

