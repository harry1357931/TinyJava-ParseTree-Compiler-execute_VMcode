package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class GEinstr extends ZeroOperandInstruction {

  void execute ()
  {
   if (EXPRSTACK[(--ESP - 1)] >= EXPRSTACK[ESP])
    {
      EXPRSTACK[(ESP - 1)] = 1;
    }
    else EXPRSTACK[(ESP - 1)] = 0;
	// already added a lot, may still require some
  }

  public GEinstr ()
  {
    super("GE");
  }
}

