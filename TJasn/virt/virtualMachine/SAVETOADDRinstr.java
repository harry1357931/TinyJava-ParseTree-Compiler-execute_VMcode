package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;
/*
 * @author Gurpreet Singh
*/
public class SAVETOADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {  // 
	  int b = EXPRSTACK[(ESP - 2)] - POINTERTAG;
	  TJ.data[b] = EXPRSTACK[(ESP - 1)];
      ESP = ESP - 2;
	// already added a lot, may still require some
  }

  public SAVETOADDRinstr ()
  {
    super("SAVETOADDR");
  }
}

