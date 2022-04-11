package rv32i
import chisel3._
// import chisel3.util.experimental.loadMemoryFromFile

class Top extends Module {
    val io = IO(new Bundle {})

    val pc = Module(new Pc())
    val instr_mem = Module(new InstructionMem())

    // Instrucion memory initialize here (by using loadMemoryFromFile)
}