package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;

/*
 * @author Gurpreet Singh
*/

public class ADDinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {  // 
     ESP--;
     EXPRSTACK[ESP - 1] += EXPRSTACK[ESP];
     //  added a lot....may still require some....
  }

  public ADDinstr ()
  {
    super("ADD");
  }
}

