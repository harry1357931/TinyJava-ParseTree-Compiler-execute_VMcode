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
    ESP--;
    EXPRSTACK[(ESP - 1)] -= EXPRSTACK[ESP];
	// already added a lot, this is good...
  } 

  public SUBinstr ()
  {
    super("SUB");
  }
}

