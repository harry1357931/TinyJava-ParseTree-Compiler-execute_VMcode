package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class NOTinstr extends ZeroOperandInstruction {

  void execute ()
  {
	//
	if (EXPRSTACK[(ESP - 1)] == 0)
      EXPRSTACK[(ESP - 1)] = 1;
    else
      EXPRSTACK[(ESP - 1)] = 0;
     // already added a lot..
  }

  public NOTinstr ()
  {
    super("NOT");
  }
}
