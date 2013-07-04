package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;
/*
 * @author Gurpreet Singh
*/
public class PASSPARAMinstr extends ZeroOperandInstruction { 

  void execute () throws VirtualMachineHaltException
  {
	  TJ.data[(ASP++ - POINTERTAG)] = EXPRSTACK[(--ESP)];
	  // already added a lot, may still require some
  }

  public PASSPARAMinstr ()
  {
    super("PASSPARAM");
  }

}

