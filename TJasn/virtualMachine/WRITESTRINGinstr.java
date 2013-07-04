package TJasn.virtualMachine;

import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  { //
    for (int k = this.firstOperand; k <= this.secondOperand; k++) {
           System.out.print((char)TJ.data[k]);
	}  
    // added a lot....I don't think it require any more...
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

 
