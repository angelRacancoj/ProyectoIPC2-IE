
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package imageneditor.analisis;

import imageneditor.analizador.sym;
import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class colors extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public colors() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public colors(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public colors(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\002\011\000\002\003" +
    "\011\000\002\003\007\000\002\004\011\000\002\004\007" +
    "\000\002\005\005\000\002\005\003\000\002\006\007\000" +
    "\002\006\007\000\002\006\007\000\002\006\005\000\002" +
    "\006\005\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\033\005\001\002\000\004\002\055\001" +
    "\002\000\004\006\006\001\002\000\004\027\007\001\002" +
    "\000\004\033\010\001\002\000\004\043\012\001\002\000" +
    "\004\034\053\001\002\000\004\027\013\001\002\000\004" +
    "\033\014\001\002\000\004\043\016\001\002\000\004\034" +
    "\050\001\002\000\004\027\017\001\002\000\004\033\020" +
    "\001\002\000\012\011\021\012\023\013\025\014\022\001" +
    "\002\000\004\027\046\001\002\000\004\027\042\001\002" +
    "\000\004\027\036\001\002\000\004\034\033\001\002\000" +
    "\004\027\027\001\002\000\004\034\ufffa\001\002\000\004" +
    "\041\030\001\002\000\006\025\031\034\ufff5\001\002\000" +
    "\010\012\023\013\025\014\022\001\002\000\004\034\ufff8" +
    "\001\002\000\006\025\034\034\ufffc\001\002\000\004\043" +
    "\016\001\002\000\004\034\ufffd\001\002\000\004\041\037" +
    "\001\002\000\006\025\040\034\ufff6\001\002\000\010\012" +
    "\023\013\025\014\022\001\002\000\004\034\ufff9\001\002" +
    "\000\004\041\043\001\002\000\006\025\044\034\ufff4\001" +
    "\002\000\010\012\023\013\025\014\022\001\002\000\004" +
    "\034\ufff7\001\002\000\004\040\047\001\002\000\004\034" +
    "\ufffb\001\002\000\006\025\051\034\ufffe\001\002\000\004" +
    "\043\012\001\002\000\004\034\uffff\001\002\000\004\034" +
    "\054\001\002\000\004\002\000\001\002\000\004\002\001" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\003\010\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\014\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\005\023\006" +
    "\025\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\006\031" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\004" +
    "\034\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\040\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\006\044\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\051\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$colors$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$colors$actions(this);
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
    return action_obj.CUP$colors$do_action(act_num, parser, stack, top);
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
class CUP$colors$actions {
  private final colors parser;

  /** Constructor */
  CUP$colors$actions(colors parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$colors$do_action_part00000000(
    int                        CUP$colors$act_num,
    java_cup.runtime.lr_parser CUP$colors$parser,
    java.util.Stack            CUP$colors$stack,
    int                        CUP$colors$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$colors$result;

      /* select the action based on the action number */
      switch (CUP$colors$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= CLRS EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-1)).value;
		RESULT = start_val;
              CUP$colors$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-1)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$colors$parser.done_parsing();
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // CLRS ::= CorAbierto Colores DosPuntos CorAbierto CLRS_CUERPO CorCerrado CorCerrado 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS",0, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-6)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // CLRS_CUERPO ::= Identificador DosPuntos CorAbierto CLRS_CARACTERISTICAS CorCerrado Coma CLRS_CUERPO 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CUERPO",1, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-6)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CLRS_CUERPO ::= Identificador DosPuntos CorAbierto CLRS_CARACTERISTICAS CorCerrado 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CUERPO",1, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CLRS_CARACTERISTICAS ::= Identificador DosPuntos CorAbierto COLOR_CLRS CorCerrado Coma CLRS_CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-6)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // CLRS_CARACTERISTICAS ::= Identificador DosPuntos CorAbierto COLOR_CLRS CorCerrado 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // COLOR_CLRS ::= Hex DosPuntos HexaCode 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("COLOR_CLRS",3, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // COLOR_CLRS ::= CLRGB_CLRS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("COLOR_CLRS",3, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // CLRGB_CLRS ::= Red DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // CLRGB_CLRS ::= Blue DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // CLRGB_CLRS ::= Green DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // CLRGB_CLRS ::= Red DosPuntos Entero 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CLRGB_CLRS ::= Blue DosPuntos Entero 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CLRGB_CLRS ::= Green DosPuntos Entero 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$colors$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$colors$do_action(
    int                        CUP$colors$act_num,
    java_cup.runtime.lr_parser CUP$colors$parser,
    java.util.Stack            CUP$colors$stack,
    int                        CUP$colors$top)
    throws java.lang.Exception
    {
              return CUP$colors$do_action_part00000000(
                               CUP$colors$act_num,
                               CUP$colors$parser,
                               CUP$colors$stack,
                               CUP$colors$top);
    }
}

}