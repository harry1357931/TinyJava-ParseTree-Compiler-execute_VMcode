package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class ANDinstr extends ZeroOperandInstruction {

  void execute ()
  {  // 
     ESP--;
     EXPRSTACK[ESP - 1] = (EXPRSTACK[ESP - 1] & EXPRSTACK[ESP]);
	 // added a lot...may stilee require some..
  }

  public ANDinstr ()
  {
    super("AND");
  }
}
