package rv32i
import chisel3.iotesters.PeekPokeTester

class TopTests(c: Top) extends PeekPokeTester(c) {
    var cycles = 0;
    for(cycles <- 1 to 20){
        step(1)
    }
}