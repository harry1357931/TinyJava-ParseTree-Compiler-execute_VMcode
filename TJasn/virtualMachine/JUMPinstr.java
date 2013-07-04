package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class JUMPinstr extends OneOperandInstruction {

  void execute ()
  {
   PC = this.operand;
   // already added a lot, may still require some
  }

  public JUMPinstr (int address)
  {
    super(address, "JUMP");
  }
}

