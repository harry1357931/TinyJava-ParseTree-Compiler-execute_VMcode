package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class NEinstr extends ZeroOperandInstruction {

  void execute ()
  {   ESP--;
	  EXPRSTACK[ESP - 1]=(EXPRSTACK[ESP - 1] != EXPRSTACK[ESP])?1:0;

  }

  public NEinstr ()
  {
    super("NE");
  }
}
