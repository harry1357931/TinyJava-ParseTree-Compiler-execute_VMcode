package TJasn.virtualMachine;
/*
 * @author Gurpreet Singh
*/
public class WRITELNOPinstr extends ZeroOperandInstruction {

  void execute ()
  {
    System.out.println();
	// this is good....
  }

  public WRITELNOPinstr ()
  {
    super("WRITELNOP");
  }
}
