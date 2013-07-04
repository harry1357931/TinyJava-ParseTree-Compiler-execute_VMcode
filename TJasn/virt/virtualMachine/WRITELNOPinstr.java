package TJasn.virtualMachine;
/*
 * @author Gurpreet Singh
*/
public class WRITELNOPinstr extends ZeroOperandInstruction {

  void execute ()
  {
    System.out.println();
	// already added a lot, may still require some
  }

  public WRITELNOPinstr ()
  {
    super("WRITELNOP");
  }
}
