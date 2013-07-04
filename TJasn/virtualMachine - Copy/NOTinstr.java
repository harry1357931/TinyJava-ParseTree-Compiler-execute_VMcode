package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class NOTinstr extends ZeroOperandInstruction {

  void execute ()
  {
	
	if (EXPRSTACK[(ESP - 1)] == 0)
      EXPRSTACK[(ESP - 1)] = 1;
    else
      EXPRSTACK[(ESP - 1)] = 0;
  }

  public NOTinstr ()
  {
    super("NOT");
  }
}
