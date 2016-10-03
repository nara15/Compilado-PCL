/* The following code was generated by JFlex 1.6.1 */

package scanner;

import java_cup.runtime.*;
import symbols.sym;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>G:/git/Compilador-PCL/SCANNER/Scanner_PCL/src/scanner/pcl_rules.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner {

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
    "\11\0\1\21\1\2\1\63\1\63\1\3\22\0\1\21\1\0\1\16"+
    "\1\17\4\0\1\4\1\6\1\5\1\54\1\52\1\12\1\13\1\1"+
    "\12\15\1\62\1\53\1\57\1\56\1\55\2\0\4\20\1\14\25\20"+
    "\1\60\1\0\1\61\1\0\1\20\1\0\1\23\1\30\1\37\1\25"+
    "\1\31\1\44\1\32\1\41\1\33\1\20\1\50\1\35\1\46\1\24"+
    "\1\34\1\47\1\20\1\26\1\40\1\36\1\45\1\42\1\43\1\51"+
    "\1\27\1\20\1\7\1\22\1\10\7\0\1\63\u05da\0\12\11\206\0"+
    "\12\11\306\0\12\11\u019c\0\12\11\166\0\12\11\166\0\12\11\166\0"+
    "\12\11\166\0\12\11\166\0\12\11\166\0\12\11\166\0\12\11\166\0"+
    "\12\11\166\0\12\11\140\0\12\11\166\0\12\11\106\0\12\11\u0116\0"+
    "\12\11\106\0\12\11\u0746\0\12\11\46\0\12\11\u012c\0\12\11\200\0"+
    "\12\11\246\0\12\11\6\0\12\11\266\0\12\11\126\0\12\11\206\0"+
    "\12\11\6\0\12\11\u03ce\0\1\63\1\63\u85f6\0\12\11\u02a6\0\12\11"+
    "\46\0\12\11\306\0\12\11\26\0\12\11\126\0\12\11\u0196\0\12\11"+
    "\u5316\0\12\11\u0586\0\12\11\u0bbc\0\12\11\200\0\12\11\74\0\12\11"+
    "\220\0\12\11\u0116\0\12\11\u01d6\0\12\11\u0176\0\12\11\146\0\12\11"+
    "\u0216\0\12\11\u5176\0\12\11\346\0\12\11\u6c74\0\62\11\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u280f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\1"+
    "\1\7\1\10\1\11\3\1\1\3\24\1\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\0\1\25\1\0\1\23\1\7\2\0\1\26"+
    "\1\27\1\30\1\0\1\31\1\32\5\30\1\33\6\30"+
    "\2\33\23\30\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\2\23\2\0\1\44\1\0\1\30\1\33"+
    "\25\30\1\33\4\30\1\45\1\46\1\23\1\0\1\47"+
    "\3\30\1\33\21\30\1\33\15\30\1\33\10\30\1\33"+
    "\4\30\1\33\2\30\1\33\167\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[311];
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
    "\0\0\0\64\0\150\0\64\0\234\0\320\0\64\0\u0104"+
    "\0\u0138\0\u016c\0\64\0\u01a0\0\u01d4\0\u0208\0\u01a0\0\u023c"+
    "\0\u0270\0\u02a4\0\u02d8\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc"+
    "\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c"+
    "\0\u05b0\0\u05e4\0\u0618\0\64\0\64\0\u064c\0\u0680\0\64"+
    "\0\u06b4\0\64\0\64\0\u06e8\0\u071c\0\64\0\u0750\0\64"+
    "\0\u0104\0\u0104\0\u0784\0\u07b8\0\u07ec\0\64\0\64\0\u0820"+
    "\0\u01d4\0\64\0\u0208\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924"+
    "\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4"+
    "\0\u0820\0\u0af8\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30"+
    "\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0"+
    "\0\u0e04\0\u0e38\0\u0e6c\0\u0ea0\0\64\0\64\0\u0ed4\0\64"+
    "\0\64\0\64\0\u0f08\0\64\0\64\0\u0f3c\0\u0f70\0\u0fa4"+
    "\0\u0fd8\0\u100c\0\u1040\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110"+
    "\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248\0\u127c\0\u12b0"+
    "\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8\0\u141c\0\u1450"+
    "\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\64\0\64"+
    "\0\u0750\0\u15bc\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u15f0\0\u168c"+
    "\0\u16c0\0\u16f4\0\u1728\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c"+
    "\0\u1860\0\u1894\0\u18c8\0\u18fc\0\u1930\0\u1964\0\u1998\0\u19cc"+
    "\0\u19cc\0\u1a00\0\u1a34\0\u1a68\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38"+
    "\0\u1b6c\0\u1ba0\0\u1bd4\0\u1c08\0\u1c3c\0\u1c70\0\u1c70\0\u1ca4"+
    "\0\u1cd8\0\u1d0c\0\u1d40\0\u1d74\0\u1da8\0\u1ddc\0\u1e10\0\u1e10"+
    "\0\u1e44\0\u1e78\0\u1eac\0\u1ee0\0\u1ee0\0\u1f14\0\u1f48\0\u1f48"+
    "\0\u1f7c\0\u1fb0\0\u1fe4\0\u2018\0\u204c\0\u2080\0\u20b4\0\u20e8"+
    "\0\u211c\0\u2150\0\u2184\0\u21b8\0\u21ec\0\u2220\0\u2254\0\u2288"+
    "\0\u22bc\0\u22f0\0\u2324\0\u2358\0\u238c\0\u23c0\0\u23f4\0\u2428"+
    "\0\u245c\0\u2490\0\u24c4\0\u24f8\0\u252c\0\u2560\0\u2594\0\u25c8"+
    "\0\u25fc\0\u2630\0\u2664\0\u2698\0\u26cc\0\u2700\0\u2734\0\u2768"+
    "\0\u279c\0\u27d0\0\u2804\0\u2838\0\u286c\0\u28a0\0\u28d4\0\u2908"+
    "\0\u293c\0\u2970\0\u29a4\0\u29d8\0\u2a0c\0\u2a40\0\u2a74\0\u2aa8"+
    "\0\u2adc\0\u2b10\0\u2b44\0\u2b78\0\u2bac\0\u2be0\0\u2c14\0\u2c48"+
    "\0\u2c7c\0\u2cb0\0\u2ce4\0\u2d18\0\u2d4c\0\u2d80\0\u2db4\0\u2de8"+
    "\0\u2e1c\0\u2e50\0\u2e84\0\u2eb8\0\u2eec\0\u2f20\0\u2f54\0\u2f88"+
    "\0\u2fbc\0\u2ff0\0\u3024\0\u3058\0\u308c\0\u30c0\0\u30f4\0\u3128"+
    "\0\u315c\0\u3190\0\u31c4\0\u31f8\0\u322c\0\u3260\0\u3294\0\u32c8"+
    "\0\u32fc\0\u3330\0\u3364\0\u3398\0\u33cc\0\u3400\0\u3434\0\u3468"+
    "\0\u349c\0\u34d0\0\u3504\0\u3538\0\u356c\0\u35a0\0\u35d4\0\u3608"+
    "\0\u363c\0\u3670\0\u36a4\0\u36d8\0\u370c\0\u3740\0\64";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[311];
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
    "\1\2\1\3\2\4\1\5\1\6\1\7\1\10\1\2"+
    "\1\11\1\12\1\13\1\14\1\11\1\15\1\16\1\14"+
    "\1\4\1\17\1\20\1\21\1\22\1\23\1\14\1\24"+
    "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\14\1\35\1\36\1\37\1\40\1\41\1\42\1\14"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\1\54\66\0\1\55\54\0\1\56\12\0\1\57"+
    "\134\0\1\60\5\0\10\61\1\62\53\61\11\0\1\63"+
    "\1\0\1\64\1\0\1\63\57\0\1\65\1\66\2\0"+
    "\1\65\40\0\1\67\21\0\2\70\2\0\1\70\1\0"+
    "\30\70\12\0\16\71\1\72\45\71\11\0\1\73\3\0"+
    "\1\73\62\0\2\70\2\0\1\70\1\0\2\70\1\74"+
    "\1\70\1\75\23\70\26\0\2\70\2\0\1\70\1\0"+
    "\11\70\1\76\1\77\15\70\26\0\2\70\2\0\1\70"+
    "\1\0\11\70\1\100\1\101\15\70\26\0\2\70\2\0"+
    "\1\70\1\0\7\70\1\102\20\70\26\0\2\70\2\0"+
    "\1\70\1\0\5\70\1\103\1\70\1\104\2\70\1\105"+
    "\15\70\26\0\2\70\2\0\1\70\1\0\2\70\1\74"+
    "\10\70\1\106\14\70\26\0\2\70\2\0\1\70\1\0"+
    "\12\70\1\107\15\70\26\0\2\70\2\0\1\70\1\0"+
    "\2\70\1\110\17\70\1\111\5\70\26\0\2\70\2\0"+
    "\1\70\1\0\4\70\1\111\15\70\1\111\5\70\26\0"+
    "\2\70\2\0\1\70\1\0\1\70\1\112\10\70\1\113"+
    "\15\70\26\0\2\70\2\0\1\70\1\0\4\70\1\114"+
    "\1\115\4\70\1\111\4\70\1\116\10\70\26\0\2\70"+
    "\2\0\1\70\1\0\1\70\1\106\10\70\1\117\4\70"+
    "\1\120\10\70\26\0\2\70\2\0\1\70\1\0\7\70"+
    "\1\77\4\70\1\121\2\70\1\122\10\70\26\0\2\70"+
    "\2\0\1\70\1\0\1\70\1\123\26\70\26\0\2\70"+
    "\2\0\1\70\1\0\4\70\1\124\4\70\1\125\5\70"+
    "\1\126\10\70\26\0\2\70\2\0\1\70\1\0\1\70"+
    "\1\127\10\70\1\130\10\70\1\131\4\70\26\0\2\70"+
    "\2\0\1\70\1\0\2\70\1\132\25\70\26\0\2\70"+
    "\2\0\1\70\1\0\12\70\1\74\15\70\26\0\2\70"+
    "\2\0\1\70\1\0\1\70\1\133\2\70\1\134\23\70"+
    "\26\0\2\70\2\0\1\70\1\0\12\70\1\123\15\70"+
    "\66\0\1\135\1\0\1\136\62\0\1\137\1\140\62\0"+
    "\1\141\1\142\1\143\62\0\1\144\5\0\2\55\1\145"+
    "\1\146\60\55\5\57\1\147\56\57\11\0\1\63\1\0"+
    "\1\64\1\150\1\63\57\0\1\151\3\0\1\151\57\0"+
    "\1\152\1\0\1\64\1\0\1\152\62\0\2\153\2\0"+
    "\1\153\1\0\30\153\26\0\2\153\2\0\1\153\1\0"+
    "\3\153\1\154\24\153\26\0\2\153\2\0\1\153\1\0"+
    "\4\153\1\155\23\153\26\0\2\153\2\0\1\153\1\0"+
    "\13\153\1\154\14\153\26\0\2\153\2\0\1\153\1\0"+
    "\14\153\1\154\13\153\26\0\2\153\2\0\1\153\1\0"+
    "\20\153\1\154\7\153\26\0\2\153\2\0\1\153\1\0"+
    "\21\153\1\156\6\153\26\0\2\153\2\0\1\153\1\0"+
    "\1\153\1\157\13\153\1\160\7\153\1\161\2\153\26\0"+
    "\2\153\2\0\1\153\1\0\14\153\1\162\13\153\26\0"+
    "\2\153\2\0\1\153\1\0\10\153\1\163\17\153\26\0"+
    "\2\153\2\0\1\153\1\0\12\153\1\164\15\153\26\0"+
    "\2\153\2\0\1\153\1\0\16\153\1\162\11\153\26\0"+
    "\2\153\2\0\1\153\1\0\14\153\1\165\13\153\26\0"+
    "\2\153\2\0\1\153\1\0\13\153\1\166\1\154\13\153"+
    "\26\0\2\153\2\0\1\153\1\0\6\153\1\167\21\153"+
    "\26\0\2\153\2\0\1\153\1\0\2\153\1\170\25\153"+
    "\26\0\2\153\2\0\1\153\1\0\23\153\1\162\4\153"+
    "\26\0\2\153\2\0\1\153\1\0\25\153\1\162\2\153"+
    "\26\0\2\153\2\0\1\153\1\0\7\153\1\171\20\153"+
    "\26\0\2\153\2\0\1\153\1\0\2\153\1\172\25\153"+
    "\26\0\2\153\2\0\1\153\1\0\1\153\1\173\26\153"+
    "\26\0\2\153\2\0\1\153\1\0\4\153\1\174\23\153"+
    "\26\0\2\153\2\0\1\153\1\0\12\153\1\175\15\153"+
    "\26\0\2\153\2\0\1\153\1\0\4\153\1\154\23\153"+
    "\26\0\2\153\2\0\1\153\1\0\11\153\1\176\16\153"+
    "\26\0\2\153\2\0\1\153\1\0\14\153\1\177\13\153"+
    "\26\0\2\153\2\0\1\153\1\0\11\153\1\200\16\153"+
    "\26\0\2\153\2\0\1\153\1\0\13\153\1\201\14\153"+
    "\26\0\2\153\2\0\1\153\1\0\4\153\1\202\23\153"+
    "\26\0\2\153\2\0\1\153\1\0\2\153\1\203\25\153"+
    "\26\0\2\153\2\0\1\153\1\0\14\153\1\204\13\153"+
    "\26\0\2\153\2\0\1\153\1\0\15\153\1\205\12\153"+
    "\26\0\2\153\2\0\1\153\1\0\12\153\1\206\15\153"+
    "\70\0\1\207\63\0\1\210\7\0\1\145\61\0\5\57"+
    "\1\147\1\211\55\57\12\0\1\212\2\0\1\213\57\0"+
    "\1\151\2\0\1\150\1\151\57\0\1\152\1\0\1\64"+
    "\1\150\1\152\62\0\2\214\2\0\1\214\1\0\30\214"+
    "\26\0\2\214\2\0\1\214\1\0\1\214\1\215\26\214"+
    "\26\0\2\214\2\0\1\214\1\0\2\214\1\216\25\214"+
    "\26\0\2\214\2\0\1\214\1\0\3\214\1\217\7\214"+
    "\1\217\14\214\26\0\2\214\2\0\1\214\1\0\12\214"+
    "\1\220\15\214\26\0\2\214\2\0\1\214\1\0\7\214"+
    "\1\221\20\214\26\0\2\214\2\0\1\214\1\0\7\214"+
    "\1\217\20\214\26\0\2\214\2\0\1\214\1\0\11\214"+
    "\1\222\16\214\26\0\2\214\2\0\1\214\1\0\13\214"+
    "\1\223\14\214\26\0\2\214\2\0\1\214\1\0\12\214"+
    "\1\217\15\214\26\0\2\214\2\0\1\214\1\0\11\214"+
    "\1\224\16\214\26\0\2\214\2\0\1\214\1\0\7\214"+
    "\1\225\20\214\26\0\2\214\2\0\1\214\1\0\10\214"+
    "\1\226\17\214\26\0\2\214\2\0\1\214\1\0\2\214"+
    "\1\217\25\214\26\0\2\214\2\0\1\214\1\0\16\214"+
    "\1\227\11\214\26\0\2\214\2\0\1\214\1\0\4\214"+
    "\1\217\23\214\26\0\2\214\2\0\1\214\1\0\11\214"+
    "\1\230\16\214\26\0\2\214\2\0\1\214\1\0\4\214"+
    "\1\231\23\214\26\0\2\214\2\0\1\214\1\0\14\214"+
    "\1\232\13\214\26\0\2\214\2\0\1\214\1\0\17\214"+
    "\1\217\10\214\26\0\2\214\2\0\1\214\1\0\13\214"+
    "\1\232\14\214\26\0\2\214\2\0\1\214\1\0\16\214"+
    "\1\232\11\214\26\0\2\214\2\0\1\214\1\0\21\214"+
    "\1\233\6\214\26\0\2\214\2\0\1\214\1\0\15\214"+
    "\1\234\12\214\26\0\2\214\2\0\1\214\1\0\11\214"+
    "\1\225\16\214\26\0\2\214\2\0\1\214\1\0\26\214"+
    "\1\235\1\214\26\0\2\214\2\0\1\214\1\0\10\214"+
    "\1\236\4\214\1\237\12\214\27\0\1\213\62\0\2\240"+
    "\2\0\1\240\1\0\30\240\26\0\2\240\2\0\1\240"+
    "\1\0\5\240\1\241\22\240\26\0\2\240\2\0\1\240"+
    "\1\0\14\240\1\242\13\240\26\0\2\240\2\0\1\240"+
    "\1\0\4\240\1\243\23\240\26\0\2\240\2\0\1\240"+
    "\1\0\1\240\1\244\26\240\26\0\2\240\2\0\1\240"+
    "\1\0\2\240\1\241\25\240\26\0\2\240\2\0\1\240"+
    "\1\0\7\240\1\245\20\240\26\0\2\240\2\0\1\240"+
    "\1\0\2\240\1\246\25\240\26\0\2\240\2\0\1\240"+
    "\1\0\13\240\1\241\14\240\26\0\2\240\2\0\1\240"+
    "\1\0\11\240\1\247\16\240\26\0\2\240\2\0\1\240"+
    "\1\0\14\240\1\241\13\240\26\0\2\240\2\0\1\240"+
    "\1\0\2\240\1\250\25\240\26\0\2\240\2\0\1\240"+
    "\1\0\14\240\1\251\13\240\26\0\2\240\2\0\1\240"+
    "\1\0\7\240\1\241\20\240\26\0\2\240\2\0\1\240"+
    "\1\0\1\240\1\252\26\240\26\0\2\240\2\0\1\240"+
    "\1\0\14\240\1\253\13\240\26\0\2\240\2\0\1\240"+
    "\1\0\7\240\1\243\20\240\26\0\2\240\2\0\1\240"+
    "\1\0\4\240\1\254\23\240\26\0\2\240\2\0\1\240"+
    "\1\0\7\240\1\255\20\240\26\0\2\256\2\0\1\256"+
    "\1\0\30\256\26\0\2\256\2\0\1\256\1\0\12\256"+
    "\1\257\15\256\26\0\2\256\2\0\1\256\1\0\3\256"+
    "\1\257\24\256\26\0\2\256\2\0\1\256\1\0\14\256"+
    "\1\257\13\256\26\0\2\256\2\0\1\256\1\0\1\256"+
    "\1\260\26\256\26\0\2\256\2\0\1\256\1\0\7\256"+
    "\1\257\20\256\26\0\2\256\2\0\1\256\1\0\2\256"+
    "\1\261\25\256\26\0\2\256\2\0\1\256\1\0\10\256"+
    "\1\257\17\256\26\0\2\256\2\0\1\256\1\0\11\256"+
    "\1\262\16\256\26\0\2\256\2\0\1\256\1\0\4\256"+
    "\1\263\23\256\26\0\2\256\2\0\1\256\1\0\11\256"+
    "\1\264\16\256\26\0\2\256\2\0\1\256\1\0\1\256"+
    "\1\265\26\256\26\0\2\256\2\0\1\256\1\0\3\256"+
    "\1\266\24\256\26\0\2\267\2\0\1\267\1\0\30\267"+
    "\26\0\2\267\2\0\1\267\1\0\2\267\1\270\25\267"+
    "\26\0\2\267\2\0\1\267\1\0\14\267\1\270\13\267"+
    "\26\0\2\267\2\0\1\267\1\0\2\267\1\271\25\267"+
    "\26\0\2\267\2\0\1\267\1\0\3\267\1\270\24\267"+
    "\26\0\2\267\2\0\1\267\1\0\12\267\1\272\15\267"+
    "\26\0\2\267\2\0\1\267\1\0\24\267\1\270\3\267"+
    "\26\0\2\267\2\0\1\267\1\0\23\267\1\273\4\267"+
    "\26\0\2\274\2\0\1\274\1\0\30\274\26\0\2\274"+
    "\2\0\1\274\1\0\14\274\1\275\13\274\26\0\2\274"+
    "\2\0\1\274\1\0\2\274\1\275\25\274\26\0\2\274"+
    "\2\0\1\274\1\0\4\274\1\276\23\274\26\0\2\277"+
    "\2\0\1\277\1\0\30\277\26\0\2\277\2\0\1\277"+
    "\1\0\7\277\1\300\20\277\26\0\2\301\2\0\1\301"+
    "\1\0\30\301\26\0\2\302\2\0\1\302\1\0\30\302"+
    "\26\0\2\303\2\0\1\303\1\0\30\303\26\0\2\304"+
    "\2\0\1\304\1\0\30\304\26\0\2\305\2\0\1\305"+
    "\1\0\30\305\26\0\2\306\2\0\1\306\1\0\30\306"+
    "\26\0\2\307\2\0\1\307\1\0\30\307\26\0\2\310"+
    "\2\0\1\310\1\0\30\310\26\0\2\311\2\0\1\311"+
    "\1\0\30\311\26\0\2\312\2\0\1\312\1\0\30\312"+
    "\26\0\2\313\2\0\1\313\1\0\30\313\26\0\2\314"+
    "\2\0\1\314\1\0\30\314\26\0\2\315\2\0\1\315"+
    "\1\0\30\315\26\0\2\316\2\0\1\316\1\0\30\316"+
    "\26\0\2\317\2\0\1\317\1\0\30\317\26\0\2\320"+
    "\2\0\1\320\1\0\30\320\26\0\2\321\2\0\1\321"+
    "\1\0\30\321\26\0\2\322\2\0\1\322\1\0\30\322"+
    "\26\0\2\323\2\0\1\323\1\0\30\323\26\0\2\324"+
    "\2\0\1\324\1\0\30\324\26\0\2\325\2\0\1\325"+
    "\1\0\30\325\26\0\2\326\2\0\1\326\1\0\30\326"+
    "\26\0\2\327\2\0\1\327\1\0\30\327\26\0\2\330"+
    "\2\0\1\330\1\0\30\330\26\0\2\331\2\0\1\331"+
    "\1\0\30\331\26\0\2\332\2\0\1\332\1\0\30\332"+
    "\26\0\2\333\2\0\1\333\1\0\30\333\26\0\2\334"+
    "\2\0\1\334\1\0\30\334\26\0\2\335\2\0\1\335"+
    "\1\0\30\335\26\0\2\336\2\0\1\336\1\0\30\336"+
    "\26\0\2\337\2\0\1\337\1\0\30\337\26\0\2\340"+
    "\2\0\1\340\1\0\30\340\26\0\2\341\2\0\1\341"+
    "\1\0\30\341\26\0\2\342\2\0\1\342\1\0\30\342"+
    "\26\0\2\343\2\0\1\343\1\0\30\343\26\0\2\344"+
    "\2\0\1\344\1\0\30\344\26\0\2\345\2\0\1\345"+
    "\1\0\30\345\26\0\2\346\2\0\1\346\1\0\30\346"+
    "\26\0\2\347\2\0\1\347\1\0\30\347\26\0\2\350"+
    "\2\0\1\350\1\0\30\350\26\0\2\351\2\0\1\351"+
    "\1\0\30\351\26\0\2\352\2\0\1\352\1\0\30\352"+
    "\26\0\2\353\2\0\1\353\1\0\30\353\26\0\2\354"+
    "\2\0\1\354\1\0\30\354\26\0\2\355\2\0\1\355"+
    "\1\0\30\355\26\0\2\356\2\0\1\356\1\0\30\356"+
    "\26\0\2\357\2\0\1\357\1\0\30\357\26\0\2\360"+
    "\2\0\1\360\1\0\30\360\26\0\2\361\2\0\1\361"+
    "\1\0\30\361\26\0\2\362\2\0\1\362\1\0\30\362"+
    "\26\0\2\363\2\0\1\363\1\0\30\363\26\0\2\364"+
    "\2\0\1\364\1\0\30\364\26\0\2\365\2\0\1\365"+
    "\1\0\30\365\26\0\2\366\2\0\1\366\1\0\30\366"+
    "\26\0\2\367\2\0\1\367\1\0\30\367\26\0\2\370"+
    "\2\0\1\370\1\0\30\370\26\0\2\371\2\0\1\371"+
    "\1\0\30\371\26\0\2\372\2\0\1\372\1\0\30\372"+
    "\26\0\2\373\2\0\1\373\1\0\30\373\26\0\2\374"+
    "\2\0\1\374\1\0\30\374\26\0\2\375\2\0\1\375"+
    "\1\0\30\375\26\0\2\376\2\0\1\376\1\0\30\376"+
    "\26\0\2\377\2\0\1\377\1\0\30\377\26\0\2\u0100"+
    "\2\0\1\u0100\1\0\30\u0100\26\0\2\u0101\2\0\1\u0101"+
    "\1\0\30\u0101\26\0\2\u0102\2\0\1\u0102\1\0\30\u0102"+
    "\26\0\2\u0103\2\0\1\u0103\1\0\30\u0103\26\0\2\u0104"+
    "\2\0\1\u0104\1\0\30\u0104\26\0\2\u0105\2\0\1\u0105"+
    "\1\0\30\u0105\26\0\2\u0106\2\0\1\u0106\1\0\30\u0106"+
    "\26\0\2\u0107\2\0\1\u0107\1\0\30\u0107\26\0\2\u0108"+
    "\2\0\1\u0108\1\0\30\u0108\26\0\2\u0109\2\0\1\u0109"+
    "\1\0\30\u0109\26\0\2\u010a\2\0\1\u010a\1\0\30\u010a"+
    "\26\0\2\u010b\2\0\1\u010b\1\0\30\u010b\26\0\2\u010c"+
    "\2\0\1\u010c\1\0\30\u010c\26\0\2\u010d\2\0\1\u010d"+
    "\1\0\30\u010d\26\0\2\u010e\2\0\1\u010e\1\0\30\u010e"+
    "\26\0\2\u010f\2\0\1\u010f\1\0\30\u010f\26\0\2\u0110"+
    "\2\0\1\u0110\1\0\30\u0110\26\0\2\u0111\2\0\1\u0111"+
    "\1\0\30\u0111\26\0\2\u0112\2\0\1\u0112\1\0\30\u0112"+
    "\26\0\2\u0113\2\0\1\u0113\1\0\30\u0113\26\0\2\u0114"+
    "\2\0\1\u0114\1\0\30\u0114\26\0\2\u0115\2\0\1\u0115"+
    "\1\0\30\u0115\26\0\2\u0116\2\0\1\u0116\1\0\30\u0116"+
    "\26\0\2\u0117\2\0\1\u0117\1\0\30\u0117\26\0\2\u0118"+
    "\2\0\1\u0118\1\0\30\u0118\26\0\2\u0119\2\0\1\u0119"+
    "\1\0\30\u0119\26\0\2\u011a\2\0\1\u011a\1\0\30\u011a"+
    "\26\0\2\u011b\2\0\1\u011b\1\0\30\u011b\26\0\2\u011c"+
    "\2\0\1\u011c\1\0\30\u011c\26\0\2\u011d\2\0\1\u011d"+
    "\1\0\30\u011d\26\0\2\u011e\2\0\1\u011e\1\0\30\u011e"+
    "\26\0\2\u011f\2\0\1\u011f\1\0\30\u011f\26\0\2\u0120"+
    "\2\0\1\u0120\1\0\30\u0120\26\0\2\u0121\2\0\1\u0121"+
    "\1\0\30\u0121\26\0\2\u0122\2\0\1\u0122\1\0\30\u0122"+
    "\26\0\2\u0123\2\0\1\u0123\1\0\30\u0123\26\0\2\u0124"+
    "\2\0\1\u0124\1\0\30\u0124\26\0\2\u0125\2\0\1\u0125"+
    "\1\0\30\u0125\26\0\2\u0126\2\0\1\u0126\1\0\30\u0126"+
    "\26\0\2\u0127\2\0\1\u0127\1\0\30\u0127\26\0\2\u0128"+
    "\2\0\1\u0128\1\0\30\u0128\26\0\2\u0129\2\0\1\u0129"+
    "\1\0\30\u0129\26\0\2\u012a\2\0\1\u012a\1\0\30\u012a"+
    "\26\0\2\u012b\2\0\1\u012b\1\0\30\u012b\26\0\2\u012c"+
    "\2\0\1\u012c\1\0\30\u012c\26\0\2\u012d\2\0\1\u012d"+
    "\1\0\30\u012d\26\0\2\u012e\2\0\1\u012e\1\0\30\u012e"+
    "\26\0\2\u012f\2\0\1\u012f\1\0\30\u012f\26\0\2\u0130"+
    "\2\0\1\u0130\1\0\30\u0130\26\0\2\u0131\2\0\1\u0131"+
    "\1\0\30\u0131\26\0\2\u0132\2\0\1\u0132\1\0\30\u0132"+
    "\26\0\2\u0133\2\0\1\u0133\1\0\30\u0133\26\0\2\u0134"+
    "\2\0\1\u0134\1\0\30\u0134\26\0\2\u0135\2\0\1\u0135"+
    "\1\0\30\u0135\26\0\2\u0136\2\0\1\u0136\1\0\30\u0136"+
    "\26\0\2\u0137\2\0\1\u0137\1\0\30\u0137\12\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[14196];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\1\1\1\11\2\1\1\11\3\1\1\11"+
    "\30\1\2\11\2\1\1\11\1\1\2\11\2\1\1\11"+
    "\1\0\1\11\1\0\2\1\2\0\2\11\1\1\1\0"+
    "\1\11\42\1\2\11\1\1\3\11\1\1\2\11\1\1"+
    "\2\0\1\1\1\0\34\1\2\11\1\1\1\0\254\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[311];
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

  /* user code: */
private Symbol token(int type, Object value)
{
    return new Symbol(type, yyline, yycolumn, value);
}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
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
    while (i < 368) {
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
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
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
          yycolumn += zzCharCount;
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

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return token(sym.ERROR_LEXICO, "Caracter inválido " + yytext());
            }
          case 40: break;
          case 2: 
            { return token(sym.OP_DIVISION, yytext());
            }
          case 41: break;
          case 3: 
            { /*Omitir el espacio blanco*/
            }
          case 42: break;
          case 4: 
            { return token(sym.PAR_APER, yytext());
            }
          case 43: break;
          case 5: 
            { return token(sym.OP_MULTIPLICACION, yytext());
            }
          case 44: break;
          case 6: 
            { return token(sym.PAR_CERR, yytext());
            }
          case 45: break;
          case 7: 
            { return token(sym.ENTERO, yytext());
            }
          case 46: break;
          case 8: 
            { return token(sym.OP_RESTA, yytext());
            }
          case 47: break;
          case 9: 
            { return token(sym.PUNTO, yytext());
            }
          case 48: break;
          case 10: 
            { return token(sym.COMA, yytext());
            }
          case 49: break;
          case 11: 
            { return token(sym.PUNTO_COMA, yytext());
            }
          case 50: break;
          case 12: 
            { return token(sym.OP_SUMA, yytext());
            }
          case 51: break;
          case 13: 
            { return token(sym.OP_MAYOR, yytext());
            }
          case 52: break;
          case 14: 
            { return token(sym.OP_IGUAL, yytext());
            }
          case 53: break;
          case 15: 
            { return token(sym.OP_MENOR, yytext());
            }
          case 54: break;
          case 16: 
            { return token(sym.BRA_APER, yytext());
            }
          case 55: break;
          case 17: 
            { return token(sym.BRA_CERR, yytext());
            }
          case 56: break;
          case 18: 
            { return token(sym.DOS_PUNTO, yytext());
            }
          case 57: break;
          case 19: 
            { return token(sym.COMMENT, yytext());
            }
          case 58: break;
          case 20: 
            { return token(sym.OP_DIV_ASIGN, yytext());
            }
          case 59: break;
          case 21: 
            { return token(sym.OP_MUL_ASIGN, yytext());
            }
          case 60: break;
          case 22: 
            { return token(sym.OP_DEC, yytext());
            }
          case 61: break;
          case 23: 
            { return token(sym.OP_RESTA_ASIGN, yytext());
            }
          case 62: break;
          case 24: 
            { return token(sym.ID, yytext().toLowerCase());
            }
          case 63: break;
          case 25: 
            { return token(sym.STRING_C, yytext());
            }
          case 64: break;
          case 26: 
            { return token(sym.CHARACTER, yytext());
            }
          case 65: break;
          case 27: 
            { return token(sym.PALABRA_RESERVADA, yytext());
            }
          case 66: break;
          case 28: 
            { return token(sym.OP_INC, yytext());
            }
          case 67: break;
          case 29: 
            { return token(sym.OP_SUMA_ASIGN, yytext());
            }
          case 68: break;
          case 30: 
            { return token(sym.OP_SHIFT_DER, yytext());
            }
          case 69: break;
          case 31: 
            { return token(sym.OP_MAYOR_IGUAL, yytext());
            }
          case 70: break;
          case 32: 
            { return token(sym.OP_DISTINTO, yytext());
            }
          case 71: break;
          case 33: 
            { return token(sym.OP_MENOR_IGUAL, yytext());
            }
          case 72: break;
          case 34: 
            { return token(sym.OP_SHIFT_IZQ, yytext());
            }
          case 73: break;
          case 35: 
            { return token(sym.ASIGN, yytext());
            }
          case 74: break;
          case 36: 
            { return token(sym.FLOTANTE, yytext());
            }
          case 75: break;
          case 37: 
            { return token(sym.OP_SHIFT_DER_ASIGN, yytext());
            }
          case 76: break;
          case 38: 
            { return token(sym.OP_SHIFT_IZQ_ASIGN, yytext());
            }
          case 77: break;
          case 39: 
            { return token(sym.NOTA_CIENTIFICA, yytext());
            }
          case 78: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
