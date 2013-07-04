package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/

public class EQinstr extends ZeroOperandInstruction {

  void execute ()
  {
	  EXPRSTACK[(--ESP - 1)]=(EXPRSTACK[(ESP - 1)] == EXPRSTACK[ESP])?1:0;  
/*  if (EXPRSTACK[(--ESP - 1)] == EXPRSTACK[ESP])
    {
      EXPRSTACK[(ESP - 1)] = 1;
    }
    else EXPRSTACK[(ESP - 1)] = 0;
*/
// already added a lot, may still require some
  }

  public EQinstr ()
  {
    super("EQ");
  }
}

