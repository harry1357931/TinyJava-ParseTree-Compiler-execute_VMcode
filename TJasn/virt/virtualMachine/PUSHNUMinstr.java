package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJ1asn.SourceFileErrorException;
import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/

public class PUSHNUMinstr extends OneOperandInstruction {

  void execute ()
  { //
    EXPRSTACK[ESP] = this.operand;
	ESP++;
	// already added a lot, may or may not still require some
  }

  public PUSHNUMinstr (int value) throws SourceFileErrorException
  {
    super(value, "PUSHNUM");
    if (operand >= POINTERTAG + TJ.HEAP_START)
      throw new SourceFileErrorException("Integer constant is too large.");
  }
}

