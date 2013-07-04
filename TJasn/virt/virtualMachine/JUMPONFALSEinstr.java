package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class JUMPONFALSEinstr extends OneOperandInstruction {

  void execute ()
  {
    if (EXPRSTACK[(--ESP)] == 0)
      PC = this.operand;
     // already added a lot, may still require some
  }

  public JUMPONFALSEinstr (int address)
  {
    super(address, "JUMPONFALSE");
  }
}

