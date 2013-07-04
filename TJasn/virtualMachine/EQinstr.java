package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/

public class EQinstr extends ZeroOperandInstruction {

  void execute ()
  {    ESP--;
	  EXPRSTACK[ESP - 1]=(EXPRSTACK[ESP - 1] == EXPRSTACK[ESP])?1:0;  

// already added a lot THIS IS GOOD
  }

  public EQinstr ()
  {
    super("EQ");
  }
}

