
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package imageneditor.analizador;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class paint extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public paint() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public paint(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public paint(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\004\000\002\002" +
    "\004\000\002\002\003\000\002\002\003\000\002\003\006" +
    "\000\002\005\005\000\002\006\005\000\002\006\007\000" +
    "\002\006\003\000\002\006\005\000\002\007\005\000\002" +
    "\007\005\000\002\007\005\000\002\007\005\000\002\007" +
    "\003\000\002\007\003\000\002\004\011\000\002\010\007" +
    "\000\002\010\014\000\002\010\006\000\002\010\013\000" +
    "\002\011\003\000\002\011\003\000\002\011\005\000\002" +
    "\011\005\000\002\011\005\000\002\011\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\006\005\005\045\006\001\002\000\010\002" +
    "\ufffd\005\005\045\006\001\002\000\004\035\060\001\002" +
    "\000\004\031\013\001\002\000\010\002\ufffe\005\005\045" +
    "\006\001\002\000\004\002\011\001\002\000\004\002\001" +
    "\001\002\000\004\002\000\001\002\000\004\043\014\001" +
    "\002\000\004\032\015\001\002\000\004\035\016\001\002" +
    "\000\006\004\017\043\021\001\002\000\004\031\037\001" +
    "\002\000\004\036\036\001\002\000\004\022\022\001\002" +
    "\000\006\041\025\043\024\001\002\000\010\023\027\024" +
    "\026\030\030\001\002\000\012\023\ufff2\024\ufff2\025\ufff2" +
    "\030\ufff2\001\002\000\012\023\ufff1\024\ufff1\025\ufff1\030" +
    "\ufff1\001\002\000\006\041\035\043\034\001\002\000\006" +
    "\041\033\043\032\001\002\000\010\004\017\036\uffed\043" +
    "\021\001\002\000\004\036\uffef\001\002\000\012\023\ufff3" +
    "\024\ufff3\025\ufff3\030\ufff3\001\002\000\012\023\ufff4\024" +
    "\ufff4\025\ufff4\030\ufff4\001\002\000\012\023\ufff5\024\ufff5" +
    "\025\ufff5\030\ufff5\001\002\000\012\023\ufff6\024\ufff6\025" +
    "\ufff6\030\ufff6\001\002\000\010\002\ufff0\005\ufff0\045\ufff0" +
    "\001\002\000\004\043\040\001\002\000\004\025\041\001" +
    "\002\000\006\041\044\043\043\001\002\000\004\025\053" +
    "\001\002\000\010\025\uffea\026\050\032\uffea\001\002\000" +
    "\010\025\uffeb\026\045\032\uffeb\001\002\000\006\041\047" +
    "\043\046\001\002\000\006\025\uffe8\032\uffe8\001\002\000" +
    "\006\025\uffe9\032\uffe9\001\002\000\006\041\052\043\051" +
    "\001\002\000\006\025\uffe6\032\uffe6\001\002\000\006\025" +
    "\uffe7\032\uffe7\001\002\000\006\041\044\043\043\001\002" +
    "\000\004\032\055\001\002\000\004\030\056\001\002\000" +
    "\010\004\017\036\uffec\043\021\001\002\000\004\036\uffee" +
    "\001\002\000\004\044\062\001\002\000\004\036\074\001" +
    "\002\000\004\043\064\001\002\000\004\030\073\001\002" +
    "\000\010\022\066\025\065\030\ufff8\001\002\000\004\043" +
    "\064\001\002\000\006\041\025\043\024\001\002\000\012" +
    "\023\027\024\026\025\070\030\ufff7\001\002\000\004\043" +
    "\064\001\002\000\004\030\ufff9\001\002\000\004\030\ufffa" +
    "\001\002\000\004\036\ufffb\001\002\000\010\002\ufffc\005" +
    "\ufffc\045\ufffc\001\002\000\004\002\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\073\000\010\002\007\003\006\004\003\001\001\000" +
    "\010\002\074\003\006\004\003\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\002\011\003\006\004\003\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\022\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\030\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\011\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\011\053\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\056\001\001" +
    "\000\002\001\001\000\004\005\060\001\001\000\002\001" +
    "\001\000\004\006\062\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\071\001\001\000\004\007\066\001" +
    "\001\000\002\001\001\000\004\006\070\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$paint$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$paint$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$paint$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public void syntax_error(Symbol cur_token) {
		String message = "Estructura invalida en posición " + cur_token.right
			 + ", token: " + cur_token.value;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<");	 
		System.out.println(message);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$paint$actions {
  private final paint parser;

  /** Constructor */
  CUP$paint$actions(paint parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$paint$do_action_part00000000(
    int                        CUP$paint$act_num,
    java_cup.runtime.lr_parser CUP$paint$parser,
    java.util.Stack            CUP$paint$stack,
    int                        CUP$paint$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$paint$result;

      /* select the action based on the action number */
      switch (CUP$paint$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PAINT EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$paint$stack.elementAt(CUP$paint$top-1)).value;
		RESULT = start_val;
              CUP$paint$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-1)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$paint$parser.done_parsing();
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PAINT ::= VARIABLES PAINT 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("PAINT",0, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-1)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // PAINT ::= INSTRUCCIONS PAINT 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("PAINT",0, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-1)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // PAINT ::= VARIABLES 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("PAINT",0, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // PAINT ::= INSTRUCCIONS 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("PAINT",0, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // VARIABLES ::= Vars LlaveAbierta SET_VARIABLE LlaveCerrada 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("VARIABLES",1, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-3)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SET_VARIABLE ::= NewVar DATA PuntoYComa 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("SET_VARIABLE",3, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DATA ::= Identificador Coma DATA 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("DATA",4, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DATA ::= Identificador Igual MATH_OP Coma DATA 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("DATA",4, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-4)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // DATA ::= Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("DATA",4, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // DATA ::= Identificador Igual MATH_OP 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("DATA",4, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // MATH_OP ::= MATH_OP Mas Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // MATH_OP ::= MATH_OP Mas Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // MATH_OP ::= MATH_OP Menos Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // MATH_OP ::= MATH_OP Menos Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // MATH_OP ::= Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // MATH_OP ::= Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("MATH_OP",5, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // INSTRUCCIONS ::= Instrucciones ParAbierto Identificador ParCerrado LlaveAbierta INT_BODY LlaveCerrada 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONS",2, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-6)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // INT_BODY ::= Identificador Igual MATH_OP PuntoYComa INT_BODY 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("INT_BODY",6, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-4)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // INT_BODY ::= Pintar ParAbierto Identificador Coma POS_XY Coma POS_XY ParCerrado PuntoYComa INT_BODY 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("INT_BODY",6, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-9)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // INT_BODY ::= Identificador Igual MATH_OP PuntoYComa 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("INT_BODY",6, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-3)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // INT_BODY ::= Pintar ParAbierto Identificador Coma POS_XY Coma POS_XY ParCerrado PuntoYComa 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("INT_BODY",6, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-8)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // POS_XY ::= Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // POS_XY ::= Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // POS_XY ::= Entero Intervalo Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // POS_XY ::= Entero Intervalo Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // POS_XY ::= Identificador Intervalo Entero 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // POS_XY ::= Identificador Intervalo Identificador 
            {
              String RESULT =null;

              CUP$paint$result = parser.getSymbolFactory().newSymbol("POS_XY",7, ((java_cup.runtime.Symbol)CUP$paint$stack.elementAt(CUP$paint$top-2)), ((java_cup.runtime.Symbol)CUP$paint$stack.peek()), RESULT);
            }
          return CUP$paint$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$paint$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$paint$do_action(
    int                        CUP$paint$act_num,
    java_cup.runtime.lr_parser CUP$paint$parser,
    java.util.Stack            CUP$paint$stack,
    int                        CUP$paint$top)
    throws java.lang.Exception
    {
              return CUP$paint$do_action_part00000000(
                               CUP$paint$act_num,
                               CUP$paint$parser,
                               CUP$paint$stack,
                               CUP$paint$top);
    }
}

}