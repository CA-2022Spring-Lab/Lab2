package rv32i
import chisel3._



class InstructionMem extends Module {
    val io = IO(new Bundle {
            val wrAddr = Input(UInt(10.W))
            val readData = Output(UInt(32.W))
    })
}
