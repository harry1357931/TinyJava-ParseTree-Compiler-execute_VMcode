package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class ORinstr extends ZeroOperandInstruction {

  void execute ()
  { 
    ESP--;
    EXPRSTACK[ESP - 1] = (EXPRSTACK[ESP - 1] | EXPRSTACK[ESP]);
	// already added a lot, may still require some
  }

  public ORinstr ()
  {
    super("OR");
  }
}

