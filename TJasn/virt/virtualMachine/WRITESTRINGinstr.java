package TJasn.virtualMachine;

import TJasn.TJ;
/*
 * @author Gurpreet Singh
*/
public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  { //
    for (int j = this.firstOperand; j <= this.secondOperand; j++) {
        System.out.print((char)TJ.data[j]);
	}  
    // added a lot....may or may not require....
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

 
