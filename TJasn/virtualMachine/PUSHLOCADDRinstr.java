package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/

public class PUSHLOCADDRinstr extends OneOperandInstruction {

  void execute ()
  {
    EXPRSTACK[ESP] = FP + this.operand;
	ESP++;
	// already added a lot, may still require some
  }


  public PUSHLOCADDRinstr (int stackFrameOffset)
  {
    super(stackFrameOffset, "PUSHLOCADDR");
  }
}

