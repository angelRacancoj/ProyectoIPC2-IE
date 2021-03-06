
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package imageneditor.analisis;

import java_cup.runtime.*;
import imageneditor.DefaultValue;
import imageneditor.objectsManager.colorManager;
import imageneditor.exceptions.InputsVaciosException;
import imageneditor.backEnd.Objects.auxColor;
import java.util.LinkedList;
import imageneditor.exceptions.errorsSaver;
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
    "\000\022\000\002\002\004\000\002\002\011\000\002\002" +
    "\003\000\002\003\005\000\002\003\003\000\002\007\007" +
    "\000\002\004\005\000\002\004\003\000\002\010\007\000" +
    "\002\010\003\000\002\005\005\000\002\005\003\000\002" +
    "\006\007\000\002\006\007\000\002\006\007\000\002\006" +
    "\005\000\002\006\005\000\002\006\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\006\003\004\033\006\001\002\000\004\002" +
    "\uffff\001\002\000\004\002\061\001\002\000\004\006\007" +
    "\001\002\000\004\027\010\001\002\000\004\033\011\001" +
    "\002\000\004\042\014\001\002\000\004\034\057\001\002" +
    "\000\006\025\055\034\ufffd\001\002\000\004\027\015\001" +
    "\002\000\004\033\016\001\002\000\006\003\020\042\021" +
    "\001\002\000\004\034\054\001\002\000\006\025\ufff8\034" +
    "\ufff8\001\002\000\004\027\025\001\002\000\006\025\023" +
    "\034\ufffa\001\002\000\006\003\020\042\021\001\002\000" +
    "\004\034\ufffb\001\002\000\004\033\026\001\002\000\012" +
    "\011\027\014\031\015\033\016\030\001\002\000\004\027" +
    "\052\001\002\000\004\027\046\001\002\000\004\027\042" +
    "\001\002\000\004\034\041\001\002\000\004\027\035\001" +
    "\002\000\004\034\ufff6\001\002\000\004\045\036\001\002" +
    "\000\006\025\037\034\ufff1\001\002\000\010\014\031\015" +
    "\033\016\030\001\002\000\004\034\ufff4\001\002\000\006" +
    "\025\ufff9\034\ufff9\001\002\000\004\045\043\001\002\000" +
    "\006\025\044\034\ufff2\001\002\000\010\014\031\015\033" +
    "\016\030\001\002\000\004\034\ufff5\001\002\000\004\045" +
    "\047\001\002\000\006\025\050\034\ufff0\001\002\000\010" +
    "\014\031\015\033\016\030\001\002\000\004\034\ufff3\001" +
    "\002\000\004\040\053\001\002\000\004\034\ufff7\001\002" +
    "\000\006\025\ufffc\034\ufffc\001\002\000\004\042\014\001" +
    "\002\000\004\034\ufffe\001\002\000\004\034\060\001\002" +
    "\000\004\002\000\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\057\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\003\011\007\012\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\004\016\010\021\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\004\023\010\021\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\005\031\006\033\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\037\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\006\044\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\050\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\003\055\007\012\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

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




	errorsSaver errors;
	LinkedList<auxColor> listAux = new LinkedList<>();
	colorManager newColorM;
	String id = "";
	String nameCl = "";
	int red = DefaultValue.INVALID_CL_CODE;
	int blue = DefaultValue.INVALID_CL_CODE;
	int green = DefaultValue.INVALID_CL_CODE;
	String hexaC = "";

	public colors(Lexer lex, colorManager clIn, errorsSaver errors){
		super(lex);
		this.newColorM = clIn;
		this.errors = errors;
	}

	public void syntax_error(Symbol cur_token) {
		String message = "Estructura invalida en posición " + cur_token.right
			 + ", token: " + cur_token.value;
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<");	 
		System.out.println(message);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		errors.addColorError("(Colors)" +message);
	}

	private void setID(String IDLinezo) throws InputsVaciosException{
		if (id.equals("")) {
			id = IDLinezo;
		} else {
			throw new InputsVaciosException("Lienzo's name " + IDLinezo + " already set");
		}
	}

	private void setNameColor(String nameColor) throws InputsVaciosException{
		if (nameCl.equals("")) {
			nameCl = nameColor;
		} else {
			throw new InputsVaciosException("Colors's name " + nameColor + " already set");
		}
	}

	private void setRedCode(int RedCl) throws InputsVaciosException {
		if ((red == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			red = RedCl;
		} else {
			throw new InputsVaciosException("Red code " + RedCl + " can't set");
		}
	}

	private void setBlueCode(int BlueCl) throws InputsVaciosException {
		if ((blue == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			blue = BlueCl;
		} else {
			throw new InputsVaciosException("Red code " + BlueCl + " can't set");
		}
	}

	private void setGreenCode(int GreenCl) throws InputsVaciosException {
		if ((green == DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			green = GreenCl;
		} else {
			throw new InputsVaciosException("Red code " + GreenCl + " can't set");
		}
	}

	private void setHexa(String hexaCd) throws InputsVaciosException{
		if (hexaC.equals("") && (red == DefaultValue.INVALID_CL_CODE) && (blue == DefaultValue.INVALID_CL_CODE) && (green == DefaultValue.INVALID_CL_CODE)) {
			hexaC = hexaCd;
		} else {
			throw new InputsVaciosException("Hexa code " + hexaCd + " can't set");
		}
	}

	private void addTemColor() throws InputsVaciosException{
		if (!nameCl.equals("") && (red != DefaultValue.INVALID_CL_CODE) && (blue != DefaultValue.INVALID_CL_CODE) && (green != DefaultValue.INVALID_CL_CODE) && (hexaC.equals(""))) {
			listAux.add(new auxColor(nameCl, red, blue, green));
		} else if (!nameCl.equals("") && (red == DefaultValue.INVALID_CL_CODE) && (blue == DefaultValue.INVALID_CL_CODE) && (green == DefaultValue.INVALID_CL_CODE) && (!hexaC.equals(""))) {
			listAux.add(new auxColor(nameCl, hexaC));
		} else {
			throw new InputsVaciosException("Missing parameter at " + nameCl + " color");
		}		
		cleanColorParameters();
	}

	public void setColorByOwner(String owner) throws InputsVaciosException{
		newColorM.newObjectColor(owner);
		for (int i = 0;i< listAux.size() ; i++) {
			if (!(listAux.get(i).getHexa() == null)) {
				newColorM.addColorToColorObject(owner,listAux.get(i).getName(), listAux.get(i).getHexa());
			} else {
				newColorM.addColorToColorObject(owner,listAux.get(i).getName(), listAux.get(i).getRed(), listAux.get(i).getGreen(),listAux.get(i).getBlue());
			}
		}
		cleanEverything();
	}

	private void cleanColorParameters(){
		nameCl = "";
		red = DefaultValue.INVALID_CL_CODE;
		blue = DefaultValue.INVALID_CL_CODE;
		green = DefaultValue.INVALID_CL_CODE;
		hexaC = "";
	}

	private void cleanEverything(){
		listAux.clear();
		cleanColorParameters();
		id = "";
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
          case 2: // CLRS ::= error 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 System.out.println("error: "+e); errors.addColorError("(Colors)Error al inicio del programa: " + e);
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS",0, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // CLRS_CUERPO ::= ID_LIENZO Coma CLRS_CUERPO 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CUERPO",1, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // CLRS_CUERPO ::= ID_LIENZO 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CUERPO",1, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // ID_LIENZO ::= Identificador DosPuntos CorAbierto CLRS_CARACTERISTICAS CorCerrado 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-4)).value;
		 setColorByOwner(e); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("ID_LIENZO",5, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // CLRS_CARACTERISTICAS ::= NEW_COLOR Coma CLRS_CARACTERISTICAS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // CLRS_CARACTERISTICAS ::= NEW_COLOR 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRS_CARACTERISTICAS",2, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // NEW_COLOR ::= Identificador DosPuntos CorAbierto COLOR_CLRS CorCerrado 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-4)).value;
		 setNameColor(e); addTemColor();
              CUP$colors$result = parser.getSymbolFactory().newSymbol("NEW_COLOR",6, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NEW_COLOR ::= error 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 System.out.println("error: "+e); errors.addColorError("(Colors)Error en la declaracion del color: " + e);
              CUP$colors$result = parser.getSymbolFactory().newSymbol("NEW_COLOR",6, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // COLOR_CLRS ::= Hex DosPuntos HexaCode 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 setHexa(e); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("COLOR_CLRS",3, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // COLOR_CLRS ::= CLRGB_CLRS 
            {
              String RESULT =null;

              CUP$colors$result = parser.getSymbolFactory().newSymbol("COLOR_CLRS",3, ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // CLRGB_CLRS ::= Red DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-2)).value;
		 setRedCode(Integer.parseInt(e)); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // CLRGB_CLRS ::= Blue DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-2)).value;
		 setBlueCode(Integer.parseInt(e)); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // CLRGB_CLRS ::= Green DosPuntos Entero Coma CLRGB_CLRS 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.elementAt(CUP$colors$top-2)).value;
		 setGreenCode(Integer.parseInt(e)); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-4)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // CLRGB_CLRS ::= Red DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 setRedCode(Integer.parseInt(e)); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // CLRGB_CLRS ::= Blue DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 setBlueCode(Integer.parseInt(e)); 
              CUP$colors$result = parser.getSymbolFactory().newSymbol("CLRGB_CLRS",4, ((java_cup.runtime.Symbol)CUP$colors$stack.elementAt(CUP$colors$top-2)), ((java_cup.runtime.Symbol)CUP$colors$stack.peek()), RESULT);
            }
          return CUP$colors$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CLRGB_CLRS ::= Green DosPuntos Entero 
            {
              String RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$colors$stack.peek()).right;
		String e = (String)((java_cup.runtime.Symbol) CUP$colors$stack.peek()).value;
		 setGreenCode(Integer.parseInt(e)); 
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
