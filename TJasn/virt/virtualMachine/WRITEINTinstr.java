package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class WRITEINTinstr extends ZeroOperandInstruction {

  void execute ()
  {  //
    System.out.print(EXPRSTACK[(--ESP)]);
	// already added a lot, may still require some
  }

  public WRITEINTinstr ()
  {
    super("WRITEINT");
  } 
} 

