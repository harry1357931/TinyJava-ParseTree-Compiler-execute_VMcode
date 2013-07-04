package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
/*
 * @author Gurpreet Singh
*/
public class MODinstr extends ZeroOperandInstruction {

  void execute ()
  {
    EXPRSTACK[(--ESP - 1)] = ( EXPRSTACK[(ESP - 1)] % EXPRSTACK[ESP]);
    // already added a lot, may still require some
 }

  public MODinstr ()
  {
    super("MOD");
  }
}

