/* The following code was generated by JFlex 1.4.3 on 11/16/16 8:41 PM */

package examples.while_ut1;

import java_cup.runtime.Symbol;
import java.util.*;
import java.io.*;
import examples.while_ut1.ast.CheckStateLinter;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/16/16 8:41 PM from the specification file
 * <tt>C:/Users/Juan/git/ObligatorioWhile/while_ut1Obligatorio/src/examples/while_ut1/Lexer.lex</tt>
 */
class Lexer implements java_cup.runtime.Scanner, Tokens {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\2\1\0\2\10\22\0\1\10\1\11\1\1\3\0"+
    "\1\12\1\0\1\13\1\14\1\15\1\17\1\52\1\20\1\54\1\16"+
    "\12\53\1\22\1\23\1\24\1\25\1\0\1\21\1\0\6\6\17\55"+
    "\1\45\4\55\1\0\1\3\2\0\1\55\1\0\1\34\1\7\1\47"+
    "\1\26\1\30\1\33\1\44\1\41\1\35\1\55\1\36\1\31\1\46"+
    "\1\42\1\27\1\37\1\55\1\4\1\32\1\40\1\5\1\56\1\43"+
    "\3\55\1\50\1\0\1\51\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\1\2\3\3\1\2\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\1\1\16\13\3\1\17\1\20\1\21\1\22\1\1"+
    "\1\3\1\0\1\23\1\0\1\2\2\3\1\24\2\0"+
    "\1\25\1\26\1\27\7\3\1\30\7\3\1\0\1\31"+
    "\1\0\1\32\2\3\2\0\1\2\4\3\1\33\2\3"+
    "\1\34\3\3\1\35\2\3\1\0\1\3\1\36\1\0"+
    "\1\2\1\3\1\37\1\3\1\40\3\3\1\41\1\42"+
    "\1\3\1\43\1\0\4\3\1\44\1\45\1\46\1\0"+
    "\1\47\1\3\1\50\1\3\1\51\1\3\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\u011a\0\u0149"+
    "\0\57\0\u0178\0\57\0\57\0\57\0\u01a7\0\57\0\57"+
    "\0\57\0\57\0\57\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db\0\u040a"+
    "\0\57\0\57\0\57\0\u0439\0\u0468\0\u0497\0\136\0\57"+
    "\0\u04c6\0\u04f5\0\u0524\0\u0553\0\57\0\u0582\0\u05b1\0\57"+
    "\0\57\0\353\0\u05e0\0\u060f\0\u063e\0\u066d\0\u069c\0\u06cb"+
    "\0\u06fa\0\353\0\u0729\0\u0758\0\u0787\0\u07b6\0\u07e5\0\u0814"+
    "\0\u0843\0\u0468\0\u0468\0\u0872\0\u04f5\0\u08a1\0\u08d0\0\u08ff"+
    "\0\u092e\0\57\0\u095d\0\u098c\0\u09bb\0\u09ea\0\353\0\u0a19"+
    "\0\u0a48\0\353\0\u0a77\0\u0aa6\0\u0ad5\0\353\0\u0b04\0\u0b33"+
    "\0\u0b62\0\u0b91\0\353\0\u0bc0\0\u08ff\0\u0bef\0\353\0\u0c1e"+
    "\0\353\0\u0c4d\0\u0c7c\0\u0cab\0\353\0\353\0\u0cda\0\353"+
    "\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\353\0\353\0\353"+
    "\0\u0df4\0\353\0\u0e23\0\353\0\u0e52\0\353\0\u0e81\0\353";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\2\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\6\1\27"+
    "\1\30\1\31\1\32\1\6\1\33\1\6\1\34\1\35"+
    "\1\6\1\36\1\37\1\6\1\40\2\6\1\41\1\42"+
    "\1\43\1\44\1\45\1\6\1\46\57\0\1\47\1\50"+
    "\1\0\1\51\53\47\2\0\1\52\5\0\1\4\45\0"+
    "\1\4\4\0\4\6\16\0\2\6\1\53\17\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\22\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\1\6\1\54"+
    "\20\6\3\0\1\6\1\0\2\6\2\0\1\10\5\0"+
    "\1\10\45\0\1\10\12\0\1\55\61\0\1\56\1\57"+
    "\65\0\1\60\56\0\1\61\35\0\4\6\16\0\1\6"+
    "\1\62\1\63\17\6\3\0\1\6\1\0\2\6\4\0"+
    "\4\6\16\0\3\6\1\64\16\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\2\6\1\65\17\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\10\6\1\66"+
    "\1\6\1\67\7\6\3\0\1\6\1\0\2\6\4\0"+
    "\1\6\1\70\2\6\16\0\6\6\1\71\13\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\5\6\1\72"+
    "\6\6\1\73\5\6\3\0\1\6\1\0\2\6\4\0"+
    "\1\74\3\6\16\0\22\6\3\0\1\6\1\0\2\6"+
    "\4\0\1\75\3\6\16\0\13\6\1\76\6\6\3\0"+
    "\1\6\1\0\2\6\4\0\1\6\1\77\2\6\16\0"+
    "\22\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\13\6\1\100\6\6\3\0\1\6\1\0\2\6\4\0"+
    "\4\6\16\0\1\6\1\101\20\6\3\0\1\6\1\0"+
    "\2\6\53\0\1\44\1\102\55\0\1\103\5\0\1\10"+
    "\1\0\4\6\1\10\15\0\22\6\3\0\1\6\1\0"+
    "\1\6\1\46\1\0\1\47\1\0\2\47\1\104\1\0"+
    "\1\47\6\0\1\47\14\0\1\47\4\0\1\47\1\0"+
    "\1\47\16\0\1\105\5\0\1\52\45\0\1\52\4\0"+
    "\4\6\16\0\12\6\1\106\7\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\1\6\1\107\20\6\3\0"+
    "\1\6\1\0\2\6\15\110\1\111\41\110\2\57\1\112"+
    "\54\57\4\0\4\6\16\0\5\6\1\113\14\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\4\6\1\114"+
    "\15\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\14\6\1\115\5\6\3\0\1\6\1\0\2\6\4\0"+
    "\4\6\16\0\7\6\1\116\12\6\3\0\1\6\1\0"+
    "\2\6\4\0\1\117\3\6\16\0\22\6\3\0\1\6"+
    "\1\0\2\6\4\0\4\6\16\0\14\6\1\120\5\6"+
    "\3\0\1\6\1\0\2\6\4\0\4\6\16\0\3\6"+
    "\1\121\16\6\3\0\1\6\1\0\2\6\4\0\4\6"+
    "\16\0\12\6\1\122\7\6\3\0\1\6\1\0\2\6"+
    "\4\0\4\6\16\0\7\6\1\123\12\6\3\0\1\6"+
    "\1\0\2\6\4\0\1\6\1\124\2\6\16\0\22\6"+
    "\3\0\1\6\1\0\2\6\4\0\4\6\16\0\2\6"+
    "\1\125\17\6\3\0\1\6\1\0\2\6\4\0\4\6"+
    "\16\0\20\6\1\126\1\6\3\0\1\6\1\0\2\6"+
    "\4\0\4\6\16\0\7\6\1\127\12\6\3\0\1\6"+
    "\1\0\2\6\4\0\4\6\16\0\7\6\1\130\12\6"+
    "\3\0\1\6\1\0\2\6\6\0\2\131\16\0\1\131"+
    "\1\0\1\131\2\0\2\131\12\0\1\131\3\0\1\131"+
    "\7\0\1\6\1\132\2\6\16\0\22\6\3\0\1\6"+
    "\1\0\2\6\4\0\4\6\16\0\3\6\1\133\16\6"+
    "\3\0\1\6\1\0\2\6\15\110\1\134\56\110\1\111"+
    "\1\135\40\110\4\0\4\6\16\0\7\6\1\136\12\6"+
    "\3\0\1\6\1\0\2\6\4\0\4\6\16\0\2\6"+
    "\1\137\17\6\3\0\1\6\1\0\2\6\4\0\4\6"+
    "\16\0\16\6\1\140\3\6\3\0\1\6\1\0\2\6"+
    "\4\0\4\6\16\0\11\6\1\141\10\6\3\0\1\6"+
    "\1\0\2\6\4\0\4\6\16\0\21\6\1\142\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\4\6\1\143"+
    "\15\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\14\6\1\144\5\6\3\0\1\6\1\0\2\6\4\0"+
    "\4\6\16\0\2\6\1\145\17\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\14\6\1\146\5\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\3\6\1\147"+
    "\16\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\1\150\21\6\3\0\1\6\1\0\2\6\6\0\2\151"+
    "\16\0\1\151\1\0\1\151\2\0\2\151\12\0\1\151"+
    "\3\0\1\151\7\0\1\152\3\6\16\0\22\6\3\0"+
    "\1\6\1\0\2\6\15\110\1\111\1\112\40\110\4\0"+
    "\4\6\16\0\14\6\1\153\5\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\12\6\1\154\7\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\12\6\1\155"+
    "\7\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\2\6\1\156\17\6\3\0\1\6\1\0\2\6\4\0"+
    "\4\6\16\0\12\6\1\157\7\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\2\6\1\160\17\6\3\0"+
    "\1\6\1\0\2\6\6\0\2\161\16\0\1\161\1\0"+
    "\1\161\2\0\2\161\12\0\1\161\3\0\1\161\7\0"+
    "\4\6\16\0\14\6\1\162\5\6\3\0\1\6\1\0"+
    "\2\6\4\0\4\6\16\0\2\6\1\163\17\6\3\0"+
    "\1\6\1\0\2\6\4\0\4\6\16\0\13\6\1\164"+
    "\6\6\3\0\1\6\1\0\2\6\4\0\4\6\16\0"+
    "\7\6\1\165\12\6\3\0\1\6\1\0\2\6\6\0"+
    "\2\47\16\0\1\47\1\0\1\47\2\0\2\47\12\0"+
    "\1\47\3\0\1\47\7\0\4\6\16\0\1\166\21\6"+
    "\3\0\1\6\1\0\2\6\4\0\4\6\16\0\1\6"+
    "\1\167\20\6\3\0\1\6\1\0\2\6\4\0\4\6"+
    "\16\0\14\6\1\170\5\6\3\0\1\6\1\0\2\6";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3760];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\6\1\1\11\1\1\3\11\1\1\5\11"+
    "\15\1\3\11\3\1\1\0\1\11\1\0\3\1\1\11"+
    "\2\0\2\11\20\1\1\0\1\1\1\0\3\1\2\0"+
    "\1\11\16\1\1\0\2\1\1\0\14\1\1\0\7\1"+
    "\1\0\7\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[120];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */

	public static List<Symbol> tokens(Reader input) throws IOException {
		Lexer lexer = new Lexer(input);
		List<Symbol> result = new ArrayList<Symbol>();
		for (Symbol token = lexer.next_token(); token.sym != Tokens.EOF; token = lexer.next_token()) {
			result.add(token);
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		Lexer lexer;
		if (args.length < 1) args = new String[]{ "" };
		for (int i = 0; i < args.length; ++i) {
			lexer = new Lexer(new InputStreamReader(args[i].length() > 0 ? new FileInputStream(args[i]) : System.in, "UTF8"));
			System.out.println(args[i] +":");
			for (Symbol token = lexer.next_token(); token.sym != Tokens.EOF; token = lexer.next_token()) {
				System.out.println("\t#"+ token.sym +" "+ token.value);
			}
		}
	}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 10: 
          { return new Symbol(HYPHEN_MINUS, yyline, yycolumn, yytext());
          }
        case 43: break;
        case 39: 
          { return new Symbol(RETURN, yyline, yycolumn, yytext());
          }
        case 44: break;
        case 6: 
          { return new Symbol(RIGHT_PARENTHESIS, yyline, yycolumn, yytext());
          }
        case 45: break;
        case 34: 
          { return new Symbol(THEN, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 1: 
          { return new Symbol(error, yyline, yycolumn, "Unexpected input <"+ yytext() +">!");
          }
        case 47: break;
        case 12: 
          { return new Symbol(COLON, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 30: 
          { return new Symbol(TBOOL, yyline, yycolumn, yytext());
          }
        case 49: break;
        case 20: 
          { return new Symbol(DOUBLE_AMPERSAND, yyline, yycolumn, yytext());
          }
        case 50: break;
        case 23: 
          { return new Symbol(DO, yyline, yycolumn, yytext());
          }
        case 51: break;
        case 35: 
          { return new Symbol(VOID, yyline, yycolumn, yytext());
          }
        case 52: break;
        case 25: 
          { String $1 = yytext(); Double $0 = Double.parseDouble($1);
	return new Symbol(NUM, yyline, yycolumn, $0);
          }
        case 53: break;
        case 21: 
          { return new Symbol(LESS_THAN_OR_EQUAL, yyline, yycolumn, yytext());
          }
        case 54: break;
        case 8: 
          { return new Symbol(SLASH, yyline, yycolumn, yytext());
          }
        case 55: break;
        case 37: 
          { return new Symbol(PRINT, yyline, yycolumn, yytext());
          }
        case 56: break;
        case 24: 
          { return new Symbol(IF, yyline, yycolumn, yytext());
          }
        case 57: break;
        case 18: 
          { String $1 = yytext(); Integer $0 = Integer.parseInt($1);
  return new Symbol(NUMInt, yyline, yycolumn, $0);
          }
        case 58: break;
        case 17: 
          { return new Symbol(COMMA, yyline, yycolumn, yytext());
          }
        case 59: break;
        case 2: 
          { /* Ignore */
          }
        case 60: break;
        case 40: 
          { return new Symbol(LENGTH, yyline, yycolumn, yytext());
          }
        case 61: break;
        case 28: 
          { return new Symbol(TINT, yyline, yycolumn, yytext());
          }
        case 62: break;
        case 5: 
          { return new Symbol(LEFT_PARENTHESIS, yyline, yycolumn, yytext());
          }
        case 63: break;
        case 33: 
          { return new Symbol(TRUE, yyline, yycolumn, yytext());
          }
        case 64: break;
        case 19: 
          { return new Symbol(STR, yyline, yycolumn, yytext().substring(1,yytext().length()-1));
          }
        case 65: break;
        case 13: 
          { return new Symbol(SEMICOLON, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 26: 
          { CheckStateLinter.addError1(yyline, yycolumn);
          }
        case 67: break;
        case 36: 
          { return new Symbol(FALSE, yyline, yycolumn, yytext());
          }
        case 68: break;
        case 32: 
          { return new Symbol(SKIP, yyline, yycolumn, yytext());
          }
        case 69: break;
        case 29: 
          { return new Symbol(TNUM, yyline, yycolumn, yytext());
          }
        case 70: break;
        case 4: 
          { return new Symbol(EXCLAMATION_MARK, yyline, yycolumn, yytext());
          }
        case 71: break;
        case 16: 
          { return new Symbol(RIGHT_CURLY_BRACKET, yyline, yycolumn, yytext());
          }
        case 72: break;
        case 7: 
          { return new Symbol(ASTERISK, yyline, yycolumn, yytext());
          }
        case 73: break;
        case 3: 
          { String $1 = yytext(); String $0;
	  $0 = $1;
	  return new Symbol(ID, yyline, yycolumn, $0);
          }
        case 74: break;
        case 31: 
          { return new Symbol(ELSE, yyline, yycolumn, yytext());
          }
        case 75: break;
        case 41: 
          { return new Symbol(DEFINED, yyline, yycolumn, yytext());
          }
        case 76: break;
        case 42: 
          { return new Symbol(FUNCTION, yyline, yycolumn, yytext());
          }
        case 77: break;
        case 27: 
          { return new Symbol(TSTR, yyline, yycolumn, yytext());
          }
        case 78: break;
        case 11: 
          { return new Symbol(QUESTION_MARK, yyline, yycolumn, yytext());
          }
        case 79: break;
        case 15: 
          { return new Symbol(LEFT_CURLY_BRACKET, yyline, yycolumn, yytext());
          }
        case 80: break;
        case 22: 
          { return new Symbol(DOUBLE_EQUALS_SIGN, yyline, yycolumn, yytext());
          }
        case 81: break;
        case 14: 
          { return new Symbol(EQUALS_SIGN, yyline, yycolumn, yytext());
          }
        case 82: break;
        case 9: 
          { return new Symbol(PLUS_SIGN, yyline, yycolumn, yytext());
          }
        case 83: break;
        case 38: 
          { return new Symbol(WHILE, yyline, yycolumn, yytext());
          }
        case 84: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Tokens.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
