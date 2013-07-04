package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class SUBinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
    EXPRSTACK[(--ESP - 1)] -= EXPRSTACK[ESP];
	// already added a lot, may still require some
  } 

  public SUBinstr ()
  {
    super("SUB");
  }
}

