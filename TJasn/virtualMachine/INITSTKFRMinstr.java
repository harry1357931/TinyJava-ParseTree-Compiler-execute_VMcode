package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
import TJasn.virtualMachine.VirtualMachineHaltException;
/*
 * @author Gurpreet Singh
*/
public class INITSTKFRMinstr extends OneOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
	TJ.data[ASP - POINTERTAG] = FP;
    FP = ASP++;
    ASP = ASP + this.operand;
	// already added a lot, may still require some
  }

  public INITSTKFRMinstr (int locationsNeededForLocalVars)
  {
    super(locationsNeededForLocalVars, "INITSTKFRM");
  }
}

