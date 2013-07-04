package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class PUSHSTATADDRinstr extends OneOperandInstruction {

  void execute ()
  {
    EXPRSTACK[ESP] = (this.operand + POINTERTAG);
	ESP++;
	// already added a lot, may still require some
  }

  public PUSHSTATADDRinstr (int offset)
  {
    super(offset, "PUSHSTATADDR");
  }
}

