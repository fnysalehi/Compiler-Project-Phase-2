package phase2;
import phase2.YYParser;
/* The following code was generated by JFlex 1.6.0 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>C:/Users/Mahtab/Desktop/lexer.flex</tt>
 */
class Yylex {

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
    "\11\0\1\0\1\11\1\12\1\12\1\11\22\0\1\0\2\0\1\3"+
    "\1\0\1\53\1\0\1\5\1\35\1\36\1\52\1\50\1\41\1\51"+
    "\1\7\1\10\1\4\11\2\1\40\1\37\1\0\1\55\1\0\1\54"+
    "\1\0\32\1\1\33\1\6\1\34\3\0\1\20\1\44\1\42\1\46"+
    "\1\16\1\17\1\25\1\43\1\27\1\1\1\47\1\21\1\26\1\30"+
    "\1\24\1\23\1\56\1\14\1\22\1\13\1\15\1\1\1\45\3\1"+
    "\1\31\1\0\1\32\7\0\1\12\u1fa2\0\1\12\1\12\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\3\1\1\1\5"+
    "\1\6\1\7\1\1\13\2\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\4\2\1\21\1\22"+
    "\1\23\1\24\1\25\1\26\4\0\5\2\1\3\1\0"+
    "\6\4\1\27\5\0\5\30\1\1\1\31\13\2\1\32"+
    "\1\2\1\33\1\34\7\2\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\4\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\0\6\2\1\51"+
    "\1\2\1\52\1\53\4\2\1\54\1\55\6\2\1\56"+
    "\1\4\1\56\1\57\1\60\1\2\1\61\1\2\1\62"+
    "\3\2\1\63\1\64\1\65\1\2\1\66\2\2\1\4"+
    "\1\67\5\2\1\70\1\71\1\2\1\72\1\73\1\74"+
    "\1\75\2\2\1\76\1\77";

  private static int [] zzUnpackAction() {
    int [] result = new int[178];
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
    "\0\57\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292"+
    "\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\57\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\57\0\57"+
    "\0\57\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e"+
    "\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6"+
    "\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e"+
    "\0\u01a7\0\u0524\0\u0553\0\u0582\0\u05b1\0\u095d\0\u01a7\0\u098c"+
    "\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\u0aa6\0\u0ad5\0\u0b04"+
    "\0\u0b33\0\u0b62\0\u05e0\0\u0b91\0\u05e0\0\u0bc0\0\u0bef\0\u0c1e"+
    "\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38\0\u01a7\0\u01a7"+
    "\0\u01a7\0\u01a7\0\u01a7\0\u01a7\0\u01a7\0\u01a7\0\u01a7\0\u01a7"+
    "\0\u05e0\0\u05e0\0\u05e0\0\u05e0\0\u05e0\0\u05e0\0\u0d67\0\u0d96"+
    "\0\u0d96\0\u0d96\0\u0d96\0\u0d96\0\u0d96\0\u0d96\0\u0dc5\0\u0df4"+
    "\0\u0e23\0\u0e52\0\u0e81\0\u0eb0\0\u0edf\0\u05e0\0\u0f0e\0\u05e0"+
    "\0\u05e0\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u05e0\0\u05e0\0\u0ff9"+
    "\0\u1028\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u0d67\0\u1113\0\u0dc5"+
    "\0\u05e0\0\u05e0\0\u1142\0\u05e0\0\u1171\0\u05e0\0\u11a0\0\u11cf"+
    "\0\u11fe\0\u05e0\0\u05e0\0\u05e0\0\u122d\0\u05e0\0\u125c\0\u128b"+
    "\0\u01a7\0\u0758\0\u12ba\0\u12e9\0\u1318\0\u1347\0\u1376\0\u05e0"+
    "\0\u05e0\0\u13a5\0\u05e0\0\u05e0\0\u05e0\0\u05e0\0\u13d4\0\u1403"+
    "\0\u05e0\0\u05e0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[178];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\0\1\14\1\15\1\3\1\16\1\17"+
    "\1\20\1\3\1\21\1\22\1\23\1\3\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\3\1\41\1\42\1\43\1\3"+
    "\1\44\1\45\1\46\1\47\1\50\1\51\1\3\16\0"+
    "\1\52\2\0\1\53\3\0\1\54\2\0\1\55\27\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\57\2\56\1\60"+
    "\3\56\1\61\2\56\1\62\11\0\6\56\6\0\1\56"+
    "\2\0\1\63\1\0\1\63\2\0\1\64\6\0\1\52"+
    "\2\0\1\53\3\0\1\54\2\0\1\55\27\0\1\65"+
    "\1\66\1\0\1\66\6\0\3\65\1\67\2\65\1\70"+
    "\3\65\1\71\2\65\1\72\11\0\6\65\6\0\1\65"+
    "\2\0\1\73\1\0\1\73\2\0\1\64\6\0\1\52"+
    "\2\0\1\53\3\0\1\54\2\0\1\55\27\0\2\74"+
    "\1\0\1\74\6\0\3\74\1\75\2\74\1\76\3\74"+
    "\1\77\2\74\1\100\11\0\6\74\6\0\1\74\1\0"+
    "\2\101\1\0\1\101\6\0\3\101\1\102\2\101\1\103"+
    "\3\101\1\104\2\101\1\105\11\0\6\101\6\0\1\101"+
    "\10\0\1\106\5\0\1\52\2\0\1\53\3\0\1\54"+
    "\2\0\1\55\24\0\1\107\61\0\2\56\1\0\1\56"+
    "\6\0\1\56\1\110\1\56\1\57\2\56\1\60\3\56"+
    "\1\61\2\56\1\62\11\0\1\56\1\111\4\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\3\56\1\112"+
    "\2\56\1\60\3\56\1\61\2\56\1\62\11\0\6\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\3\56"+
    "\1\57\2\56\1\113\3\56\1\61\2\56\1\114\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\3\56\1\57\1\56\1\115\1\60\2\56\1\116\1\61"+
    "\2\56\1\62\11\0\6\56\6\0\1\56\1\0\2\56"+
    "\1\0\1\56\6\0\3\56\1\57\2\56\1\60\3\56"+
    "\1\61\2\56\1\117\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\1\120\2\56\1\57\2\56"+
    "\1\60\3\56\1\61\2\56\1\62\11\0\3\56\1\121"+
    "\2\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\1\56\1\122\1\56\1\57\2\56\1\60\3\56\1\61"+
    "\2\56\1\62\11\0\6\56\6\0\1\56\1\0\2\56"+
    "\1\0\1\56\6\0\1\56\1\123\1\56\1\57\2\56"+
    "\1\60\3\56\1\61\2\56\1\62\11\0\6\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\3\56\1\57"+
    "\1\56\1\124\1\60\3\56\1\61\2\56\1\62\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\3\56\1\57\1\125\1\56\1\60\3\56\1\61\2\56"+
    "\1\126\11\0\6\56\6\0\1\56\1\0\2\56\1\0"+
    "\1\56\6\0\3\56\1\57\2\56\1\60\2\56\1\127"+
    "\1\61\2\56\1\62\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\57\1\56\1\130"+
    "\1\60\3\56\1\61\2\56\1\62\11\0\1\56\1\131"+
    "\4\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\1\56\1\132\1\56\1\57\2\56\1\60\2\56\1\133"+
    "\1\61\2\56\1\62\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\57\2\56\1\60"+
    "\3\56\1\61\2\56\1\62\11\0\1\56\1\134\4\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\3\56"+
    "\1\135\2\56\1\60\3\56\1\61\2\56\1\62\11\0"+
    "\6\56\6\0\1\56\16\0\1\52\2\0\1\53\3\0"+
    "\1\54\2\0\1\55\17\0\1\136\4\0\1\137\17\0"+
    "\1\52\2\0\1\53\3\0\1\54\2\0\1\55\20\0"+
    "\1\140\3\0\1\141\17\0\1\52\2\0\1\53\3\0"+
    "\1\54\2\0\1\55\24\0\1\142\57\0\1\143\13\0"+
    "\1\144\2\0\1\145\53\0\1\146\2\0\1\147\56\0"+
    "\1\150\41\0\2\56\1\0\1\56\6\0\16\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\16\56\11\0\6\56\6\0\1\151\1\0\2\56\1\0"+
    "\1\56\6\0\1\152\2\56\1\153\12\56\11\0\6\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\1\154"+
    "\2\56\1\155\12\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\156\12\56\11\0"+
    "\6\56\6\0\1\56\2\0\1\63\1\0\1\63\2\0"+
    "\1\64\51\0\1\157\1\0\1\157\53\0\1\160\1\66"+
    "\1\0\1\66\6\0\16\160\11\0\6\160\6\0\1\160"+
    "\1\0\2\66\1\0\1\66\6\0\16\66\11\0\6\66"+
    "\6\0\1\66\1\0\1\160\1\66\1\0\1\66\6\0"+
    "\16\160\11\0\6\160\6\0\1\161\1\0\1\160\1\66"+
    "\1\0\1\66\6\0\1\162\2\160\1\163\12\160\11\0"+
    "\6\160\6\0\1\160\1\0\1\160\1\66\1\0\1\66"+
    "\6\0\1\164\2\160\1\165\12\160\11\0\6\160\6\0"+
    "\1\160\1\0\1\160\1\66\1\0\1\66\6\0\3\160"+
    "\1\166\12\160\11\0\6\160\6\0\1\160\2\0\1\73"+
    "\1\0\1\73\2\0\1\167\54\0\1\101\56\0\1\101"+
    "\50\0\1\143\5\0\1\101\5\0\1\144\2\0\1\145"+
    "\45\0\1\101\5\0\1\146\2\0\1\147\45\0\1\101"+
    "\10\0\1\150\40\0\11\106\2\0\44\106\1\0\2\56"+
    "\1\0\1\56\6\0\2\56\1\170\13\56\11\0\6\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\3\56"+
    "\1\171\12\56\11\0\6\56\6\0\1\56\1\0\2\56"+
    "\1\0\1\56\6\0\1\172\4\56\1\173\10\56\11\0"+
    "\1\174\5\56\6\0\1\151\1\0\2\56\1\0\1\56"+
    "\6\0\1\152\2\56\1\153\3\56\1\175\6\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\3\56\1\156\12\56\11\0\4\56\1\176\1\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\6\56\1\177"+
    "\7\56\11\0\6\56\6\0\1\56\1\0\2\56\1\0"+
    "\1\56\6\0\1\56\1\200\14\56\11\0\6\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\3\56\1\156"+
    "\12\56\11\0\4\56\1\201\1\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\5\56\1\202\10\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\14\56\1\203\1\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\11\56\1\204\4\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\14\56\1\205\1\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\1\206\2\56\1\156\12\56"+
    "\11\0\6\56\6\0\1\56\1\0\2\56\1\0\1\56"+
    "\6\0\1\207\15\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\7\56\1\210\6\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\5\56\1\211\10\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\212\12\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\11\56\1\213\4\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\14\56\1\214\1\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\4\56\1\215\11\56\11\0\6\56\6\0\1\151\50\0"+
    "\1\136\10\0\1\157\1\0\1\216\53\0\1\66\1\217"+
    "\1\0\1\217\6\0\16\66\11\0\6\66\6\0\1\66"+
    "\2\0\1\220\1\0\1\220\53\0\2\56\1\0\1\56"+
    "\6\0\3\56\1\221\12\56\11\0\6\56\6\0\1\56"+
    "\1\0\2\56\1\0\1\56\6\0\15\56\1\222\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\2\56\1\223\13\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\6\56\1\224\7\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\11\56\1\225\4\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\3\56\1\226\12\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\7\56\1\170\6\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\1\227\15\56\11\0\6\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\1\230"+
    "\15\56\11\0\6\56\6\0\1\56\1\0\2\56\1\0"+
    "\1\56\6\0\12\56\1\231\3\56\11\0\6\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\15\56\1\232"+
    "\11\0\6\56\6\0\1\56\1\0\2\56\1\0\1\56"+
    "\6\0\3\56\1\233\12\56\11\0\6\56\6\0\1\56"+
    "\1\0\2\56\1\0\1\56\6\0\1\56\1\234\14\56"+
    "\11\0\6\56\6\0\1\56\1\0\2\56\1\0\1\56"+
    "\6\0\5\56\1\235\10\56\11\0\6\56\6\0\1\56"+
    "\1\0\2\56\1\0\1\56\6\0\6\56\1\236\7\56"+
    "\11\0\6\56\6\0\1\56\1\0\2\56\1\0\1\56"+
    "\6\0\6\56\1\237\7\56\11\0\6\56\6\0\1\56"+
    "\1\0\2\56\1\0\1\56\6\0\5\56\1\240\10\56"+
    "\11\0\6\56\6\0\1\56\1\0\1\241\1\242\1\0"+
    "\1\242\6\0\16\241\11\0\6\241\6\0\1\241\1\0"+
    "\2\56\1\0\1\56\6\0\1\56\1\243\14\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\1\56\1\244\14\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\14\56\1\245\1\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\16\56\11\0\1\246\5\56\6\0\1\56\1\0\2\56"+
    "\1\0\1\56\6\0\1\56\1\247\14\56\11\0\6\56"+
    "\6\0\1\56\1\0\2\56\1\0\1\56\6\0\16\56"+
    "\11\0\5\56\1\250\6\0\1\56\1\0\2\56\1\0"+
    "\1\56\6\0\3\56\1\251\12\56\11\0\6\56\6\0"+
    "\1\56\1\0\2\56\1\0\1\56\6\0\2\56\1\252"+
    "\13\56\11\0\6\56\6\0\1\56\1\0\2\56\1\0"+
    "\1\56\6\0\15\56\1\253\11\0\6\56\6\0\1\56"+
    "\1\0\2\56\1\0\1\56\6\0\16\56\11\0\4\56"+
    "\1\254\1\56\6\0\1\56\1\0\2\56\1\0\1\56"+
    "\6\0\16\56\11\0\1\255\5\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\16\56\11\0\1\56\1\256"+
    "\4\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\5\56\1\257\10\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\6\56\1\260\7\56\11\0"+
    "\6\56\6\0\1\56\1\0\2\56\1\0\1\56\6\0"+
    "\13\56\1\261\2\56\11\0\6\56\6\0\1\56\1\0"+
    "\2\56\1\0\1\56\6\0\1\262\15\56\11\0\6\56"+
    "\6\0\1\56";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5170];
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
    "\1\0\11\1\1\11\36\1\4\0\6\1\1\0\7\1"+
    "\5\0\1\11\5\1\1\11\27\1\12\11\16\1\1\0"+
    "\51\1\1\11\21\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[178];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 170) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
  public int yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
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
        case 1: 
          { 
          }
        case 64: break;
        case 2: 
          { //writeF(yytext() + "\t" + "FAKE_ID\t" + '-');
	//System.out.println(yytext() + "\t" + "FAKE_ID\t" + "-");
          }
        case 65: break;
        case 3: 
          { //writeF(yytext() + "\t" + "NUMCONST\t" + '-');
	//System.out.println(yytext() + "\t" + "NUMCONST\t" + "-");
	YYParser.lexInt = Integer.parseInt(yytext());
	return YYParser.NUMCONST;
          }
        case 66: break;
        case 4: 
          { //writeF(yytext() + "\t" + "FAKE_ID_HASH\t" + '-');
	//System.out.println(yytext() + "\t" + "FAKE_ID_HASH\t" + "Symbol Table Entry");
          }
        case 67: break;
        case 5: 
          { //writeF(yytext() + "\t" + "PUNCT\t" + '-');
	//System.out.println(yytext() + "\t" + "PUNCT\t" + "-");
          }
        case 68: break;
        case 6: 
          { //writeF(yytext() + "\t" + "DOT_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "DOT_KW\t" + '-');
	return YYParser.DOT_KW;
          }
        case 69: break;
        case 7: 
          { //writeF(yytext() + "\t" + "DIVIDER\t" + '-');
	//System.out.println(yytext() + "\t" + "DIVIDER\t" + '-');
	return YYParser.DIVIDER;
          }
        case 70: break;
        case 8: 
          { //writeF(yytext() + "\t" + "LEFT_BRACE\t" + '-');
	//System.out.println(yytext() + "\t" + "LEFT_BRACE\t" + '-');
	return YYParser.LEFT_BRACE;
          }
        case 71: break;
        case 9: 
          { //writeF(yytext() + "\t" + "RIGHT_BRACE\t" + '-');
	//System.out.println(yytext() + "\t" + "RIGHT_BRACE\t" + '-');
	return YYParser.RIGHT_BRACE;
          }
        case 72: break;
        case 10: 
          { //writeF(yytext() + "\t" + "LEFT_BRACKET\t" + '-');
	//System.out.println(yytext() + "\t" + "LEFT_BRACKET\t" + '-');
	return YYParser.LEFT_BRACKET;
          }
        case 73: break;
        case 11: 
          { //writeF(yytext() + "\t" + "RIGHT_BRACKET\t" + '-');
	//System.out.println(yytext() + "\t" + "RIGHT_BRACKET\t" + '-');
	return YYParser.RIGHT_BRACKET;
          }
        case 74: break;
        case 12: 
          { //writeF(yytext() + "\t" + "LEFT_PARENTHESES\t" + '-');
	//System.out.println(yytext() + "\t" + "LEFT_PARENTHESES\t" + '-');
	return YYParser.LEFT_PARENTHESES;
          }
        case 75: break;
        case 13: 
          { //writeF(yytext() + "\t" + "RIGHT_PARENTHESES\t" + '-');
	//System.out.println(yytext() + "\t" + "RIGHT_PARENTHESES\t" + '-');
	return YYParser.RIGHT_PARENTHESES;
          }
        case 76: break;
        case 14: 
          { //writeF(yytext() + "\t" + "SEMICOLON\t" + '-');
	//System.out.println(yytext() + "\t" + "SEMICOLON\t" + '-');
	return YYParser.SEMICOLON;
          }
        case 77: break;
        case 15: 
          { //writeF(yytext() + "\t" + "COLON\t" + '-');
	//System.out.println(yytext() + "\t" + "COLON\t" + '-');
	return YYParser.COLON;
          }
        case 78: break;
        case 16: 
          { //writeF(yytext() + "\t" + "COMMA\t" + '-');
	//System.out.println(yytext() + "\t" + "COMMA\t" + '-');
	return YYParser.COMMA;
          }
        case 79: break;
        case 17: 
          { //writeF(yytext() + "\t" + "PLUS\t" + '-');
	//System.out.println(yytext() + "\t" + "PLUS\t" + '-');
	return YYParser.PLUS;
          }
        case 80: break;
        case 18: 
          { //writeF(yytext() + "\t" + "MINUS\t" + '-');
	//System.out.println(yytext() + "\t" + "MINUS\t" + '-');
	return YYParser.MINUS;
          }
        case 81: break;
        case 19: 
          { //writeF(yytext() + "\t" + "MULTIPLY\t" + '-');
	//System.out.println(yytext() + "\t" + "MULTIPLY\t" + '-');
	return YYParser.MULTIPLY;
          }
        case 82: break;
        case 20: 
          { //writeF(yytext() + "\t" + "MODUL\t" + '-');
	//System.out.println(yytext() + "\t" + "MODUL\t" + '-');
	return YYParser.MODUL;
          }
        case 83: break;
        case 21: 
          { //writeF(yytext() + "\t" + "QUESTION\t" + '-');
	//System.out.println(yytext() + "\t" + "QUESTION\t" + '-');
	return YYParser.QUESTION;
          }
        case 84: break;
        case 22: 
          { //writeF(yytext() + "\t" + "ASSIGN\t" + '-');
	//System.out.println(yytext() + "\t" + "ASSIGN\t" + '-');
	return YYParser.ASSIGN;
          }
        case 85: break;
        case 23: 
          { //writeF(yytext() + "\t" + "NUMCONST_FAKE\t" + '-');
	//System.out.println(yytext() + "\t" + "NUMCONST_FAKE\t" + "-");
          }
        case 86: break;
        case 24: 
          { //writeF(yytext() + "\t" + "CHARCONST\t" + '-');
	//System.out.println(yytext() + "\t" + "CHARCONST\t" + "-");
	YYParser.lexChar = yytext().charAt(1);
	return YYParser.CHARCONST;
          }
        case 87: break;
        case 25: 
          { //writeF(yytext() + "\t" + "DIVIDER_EQUAL\t" + '-');
	//System.out.println(yytext() + "\t" + "DIVIDER_EQUAL\t" + '-');
	return YYParser.DIVIDER_EQUAL;
          }
        case 88: break;
        case 26: 
          { //writeF(yytext() + "\t" + "OR_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "OR_KW\t" + '-');
	return YYParser.OR_KW;
          }
        case 89: break;
        case 27: 
          { //writeF(yytext() + "\t" + "IF_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "IF_KW\t" + '-');
	return YYParser.IF_KW;
          }
        case 90: break;
        case 28: 
          { //writeF(yytext() + "\t" + "IN_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "IN_KW\t" + '-');
          }
        case 91: break;
        case 29: 
          { //writeF(yytext() + "\t" + "PLUS_PLUS\t" + '-');
	//System.out.println(yytext() + "\t" + "PLUS_PLUS\t" + '-');
	return YYParser.PLUS_PLUS;
          }
        case 92: break;
        case 30: 
          { //writeF(yytext() + "\t" + "PLUS_EQUAL\t" + '-');
	//System.out.println(yytext() + "\t" + "PLUS_EQUAL\t" + '-');
	return YYParser.PLUS_EQUAL;
          }
        case 93: break;
        case 31: 
          { //writeF(yytext() + "\t" + "MINUS_MINUS\t" + '-');
	//System.out.println(yytext() + "\t" + "MINUS_MINUS\t" + '-');
	return YYParser.MINUS_MINUS;
          }
        case 94: break;
        case 32: 
          { //writeF(yytext() + "\t" + "MINUS_EQUAL\t" + '-');
	//System.out.println(yytext() + "\t" + "MINUS_EQUAL\t" + '-');
	return YYParser.MINUS_EQUAL;
          }
        case 95: break;
        case 33: 
          { //writeF(yytext() + "\t" + "MULTIPLY_EQUAL\t" + '-');
	//System.out.println(yytext() + "\t" + "MULTIPLY_EQUAL\t" + '-');
	return YYParser.MULTIPLY_EQUAL;
          }
        case 96: break;
        case 34: 
          { //writeF(yytext() + "\t" + "EQ\t" + '-');
	//System.out.println(yytext() + "\t" + "EQ\t" + '-');
	return YYParser.EQ;
          }
        case 97: break;
        case 35: 
          { //writeF(yytext() + "\t" + "Lt\t" + '-');
	//System.out.println(yytext() + "\t" + "Lt\t" + '-');
	return YYParser.LT;
          }
        case 98: break;
        case 36: 
          { //writeF(yytext() + "\t" + "LE\t" + '-');
	//System.out.println(yytext() + "\t" + "LE\t" + '-');
	return YYParser.LE;
          }
        case 99: break;
        case 37: 
          { //writeF(yytext() + "\t" + "GT\t" + '-');
	//System.out.println(yytext() + "\t" + "GT\t" + '-');
	return YYParser.GT;
          }
        case 100: break;
        case 38: 
          { //writeF(yytext() + "\t" + "GE\t" + '-');
	//System.out.println(yytext() + "\t" + "GE\t" + '-');
	return YYParser.GE;
          }
        case 101: break;
        case 39: 
          { //writeF(yytext() + "\t" + "NE\t" + '-');
	//System.out.println(yytext() + "\t" + "NE\t" + '-');
	return YYParser.NE;
          }
        case 102: break;
        case 40: 
          { //writeF(yytext() + "\t" + "REALCONST\t" + '-');
	//System.out.println(yytext() + "\t" + "REALCONST\t" + "-");
	YYParser.lexReal = Double.parseDouble(yytext());
	return YYParser.REALCONST;
          }
        case 103: break;
        case 41: 
          { //writeF(yytext() + "\t" + "END_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "END_KW\t" + '-');
	return YYParser.END_KW;
          }
        case 104: break;
        case 42: 
          { //writeF(yytext() + "\t" + "FOR_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "FOR_KW\t" + '-');
          }
        case 105: break;
        case 43: 
          { //writeF(yytext() + "\t" + "AND_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "AND_KW\t" + '-');
	return YYParser.AND_KW;
          }
        case 106: break;
        case 44: 
          { //writeF(yytext() + "\t" + "INTEGER_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "INTEGER_KW\t" + '-');
	return YYParser.INTEGER_KW;
          }
        case 107: break;
        case 45: 
          { //writeF(yytext() + "\t" + "NOT_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "NOT_KW\t" + '-');
	return YYParser.NOT_KW;
          }
        case 108: break;
        case 46: 
          { //writeF(yytext() + "\t" + "NON_REALCONST\t" + '-');
	//System.out.println(yytext() + "\t" + "NON_REALCONST\t" + "-");
          }
        case 109: break;
        case 47: 
          { //writeF(yytext() + "\t" + "BOOLCONST\t" + '-');
	//System.out.println(yytext() + "\t" + "BOOLCONST\t" + "-");
	YYParser.lexBoolean = Boolean.parseBoolean(yytext());
	return YYParser.BOOLCONST;
          }
        case 110: break;
        case 48: 
          { //writeF(yytext() + "\t" + "THEN_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "THEN_KW\t" + '-');
	return YYParser.THEN_KW;
          }
        case 111: break;
        case 49: 
          { //writeF(yytext() + "\t" + "REAL_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "REAL_KW\t" + '-');
	return YYParser.REAL_KW;
          }
        case 112: break;
        case 50: 
          { //writeF(yytext() + "\t" + "ELSE_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "ELSE_KW\t" + '-');
	return YYParser.ELSE_KW;
          }
        case 113: break;
        case 51: 
          { //writeF(yytext() + "\t" + "MAIN_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "MAIN_KW\t" + '-');
          }
        case 114: break;
        case 52: 
          { //writeF(yytext() + "\t" + "CASE_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "CASE_KW\t" + '-');
	return YYParser.CASE_KW;
          }
        case 115: break;
        case 53: 
          { //writeF(yytext() + "\t" + "CHAR_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "CHAR_KW\t" + '-');
	return YYParser.CHAR_KW;
          }
        case 116: break;
        case 54: 
          { //writeF(yytext() + "\t" + "BOOL_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "BOOL_KW\t" + '-');
	return YYParser.BOOL_KW;
          }
        case 117: break;
        case 55: 
          { //writeF(yytext() + "\t" + "ID\t" + '-');
	//System.out.println(yytext() + "\t" + "ID\t" + "Symbol Table Entry");
	YYParser.lexIdentifier = yytext();
	return YYParser.ID;
          }
        case 118: break;
        case 56: 
          { //writeF(yytext() + "\t" + "BREAK_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "BREAK_KW\t" + '-');
	return YYParser.BREAK_KW;
          }
        case 119: break;
        case 57: 
          { //writeF(yytext() + "\t" + "WHILE_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "WHILE_KW\t" + '-');
	return YYParser.WHILE_KW;
          }
        case 120: break;
        case 58: 
          { //writeF(yytext() + "\t" + "RETURN_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "RETURN_KW\t" + '-');
	return YYParser.RETURN_KW;
          }
        case 121: break;
        case 59: 
          { //writeF(yytext() + "\t" + "RECORD_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "RECORD_KW\t" + '-');
	return YYParser.RECORD_KW;
          }
        case 122: break;
        case 60: 
          { //writeF(yytext() + "\t" + "STATIC_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "STATIC_KW\t" + '-');
	return YYParser.STATIC_KW;
          }
        case 123: break;
        case 61: 
          { //writeF(yytext() + "\t" + "SWITCH_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "SWITCH_KW\t" + '-');
	return YYParser.SWITCH_KW;
          }
        case 124: break;
        case 62: 
          { //writeF(yytext() + "\t" + "PROGRAM_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "PROGRAM_KW\t" + '-');
          }
        case 125: break;
        case 63: 
          { //writeF(yytext() + "\t" + "DEFAULT_KW\t" + '-');
	//System.out.println(yytext() + "\t" + "DEFAULT_KW\t" + '-');
	return YYParser.DEFAULT_KW;
          }
        case 126: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return 0; }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
