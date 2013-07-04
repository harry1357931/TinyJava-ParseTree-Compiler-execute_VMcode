package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;

public class SAVETOADDRinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
	  int a = EXPRSTACK[(ESP - 2)] - POINTERTAG;
	  TJ.data[a] = EXPRSTACK[(ESP - 1)];

    ESP -= 2;
  }

  public SAVETOADDRinstr ()
  {
    super("SAVETOADDR");
  }
}

