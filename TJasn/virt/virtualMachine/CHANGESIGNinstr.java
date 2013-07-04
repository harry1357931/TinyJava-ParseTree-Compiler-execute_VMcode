package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
/*
 * @author Gurpreet Singh
*/
public class CHANGESIGNinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {  //
     EXPRSTACK[(ESP - 1)] *= -1 ;
     // already added a lot, may still require some
  }

  public CHANGESIGNinstr ()
  {
    super("CHANGESIGN");
  }
}

