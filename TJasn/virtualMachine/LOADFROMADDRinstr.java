package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;
/*
 * @author Gurpreet Singh
*/

public class LOADFROMADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
	  int j = EXPRSTACK[ESP - 1]-POINTERTAG;
      EXPRSTACK[ESP - 1] = TJ.data[j];
	// already added a lot, may still require some

  }

  public LOADFROMADDRinstr ()
  {
    super("LOADFROMADDR");
  }
}

