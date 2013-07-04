package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class CALLSTATMETHODinstr extends OneOperandInstruction {

  void execute ()
  { //
    TJ.data[(ASP++ - POINTERTAG)] = PC;
    PC = this.operand;
    // ....added a lot may still require some...
  }

  public CALLSTATMETHODinstr (int startAddr)
  {
    super(startAddr, "CALLSTATMETHOD");
  }
}
