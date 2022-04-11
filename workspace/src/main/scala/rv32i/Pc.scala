package rv32i
import chisel3._

class Pc extends Module {
    val io = IO(new Bundle {
        val in = Input(SInt(32.W))
        val out = Output(SInt(32.W))
        val pc4 = Output(SInt(32.W))
    })
}