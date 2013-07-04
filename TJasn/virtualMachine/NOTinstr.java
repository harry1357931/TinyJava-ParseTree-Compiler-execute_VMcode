package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class NOTinstr extends ZeroOperandInstruction {

  void execute ()
  {
	// 
	int i=0;     
	if (EXPRSTACK[ESP - 1] == 0)
         EXPRSTACK[ESP - 1] = 1;
    else
        EXPRSTACK[ESP - 1] = 0;
     // this is sgood
  }

  public NOTinstr ()
  {
    super("NOT");
  }
}
