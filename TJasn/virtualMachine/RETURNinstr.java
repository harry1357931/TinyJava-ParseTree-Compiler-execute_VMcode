package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class RETURNinstr extends OneOperandInstruction {

  void execute ()
  {  //
    ASP = FP + 1;
	ASP--;
    FP = TJ.data[ASP - POINTERTAG];
    ASP--;
	PC = TJ.data[ASP - POINTERTAG];
    ASP -= this.operand;
    // already added a lot, may still require some
  }

  public RETURNinstr (int operand)
  {
    super(operand, "RETURN");
  }
}

