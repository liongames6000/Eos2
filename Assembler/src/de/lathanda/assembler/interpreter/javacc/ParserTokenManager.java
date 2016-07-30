/* ParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ParserTokenManager.java */
package de.lathanda.assembler.interpreter.javacc;
import de.lathanda.assembler.interpreter.*;

/** Token Manager. */
@SuppressWarnings("unused")public class ParserTokenManager implements ParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x180000L) != 0L)
            return 19;
         if ((active0 & 0x7fffeL) != 0L)
         {
            jjmatchedKind = 41;
            return 19;
         }
         return -1;
      case 1:
         if ((active0 & 0x6L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 1;
            }
            return 19;
         }
         if ((active0 & 0x7fff8L) != 0L)
            return 19;
         return -1;
      case 2:
         if ((active0 & 0x6L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 19;
         }
         if ((active0 & 0x7e000L) != 0L)
            return 19;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 21);
      case 41:
         return jjStopAtPos(0, 22);
      case 43:
         return jjStopAtPos(0, 25);
      case 44:
         return jjStopAtPos(0, 24);
      case 45:
         return jjStopAtPos(0, 26);
      case 58:
         return jjStopAtPos(0, 23);
      case 65:
      case 97:
         return jjStartNfaWithStates_0(0, 19, 19);
      case 66:
      case 98:
         return jjStartNfaWithStates_0(0, 20, 19);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x2L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x7fff8L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 48:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(1, 3, 19);
         break;
      case 49:
         if ((active0 & 0x10L) != 0L)
         {
            jjmatchedKind = 4;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x7e000L);
      case 50:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(1, 5, 19);
         break;
      case 51:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(1, 6, 19);
         break;
      case 52:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(1, 7, 19);
         break;
      case 53:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(1, 8, 19);
         break;
      case 54:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 19);
         break;
      case 55:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(1, 10, 19);
         break;
      case 56:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 19);
         break;
      case 57:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(1, 12, 19);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 48:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 19);
         break;
      case 49:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(2, 14, 19);
         break;
      case 50:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(2, 15, 19);
         break;
      case 51:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 19);
         break;
      case 52:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(2, 17, 19);
         break;
      case 53:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(2, 18, 19);
         break;
      case 68:
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x4L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 19);
         break;
      case 69:
      case 101:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(3, 2, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec3 = {
   0x1ff00000fffffffeL, 0xffffffffffffc000L, 0xffffffffL, 0x600000000000000L
};
static final long[] jjbitVec4 = {
   0x0L, 0x0L, 0x0L, 0xff7fffffff7fffffL
};
static final long[] jjbitVec5 = {
   0x3fffffffffL, 0x0L, 0x0L, 0x0L
};
static final long[] jjbitVec6 = {
   0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec7 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffL, 0x0L
};
static final long[] jjbitVec8 = {
   0xffffffffffffffffL, 0xffffffffffffffffL, 0x0L, 0x0L
};
static final long[] jjbitVec9 = {
   0x3fffffffffffL, 0x0L, 0x0L, 0x0L
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 43;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  else if (curChar == 47)
                     { jjAddStates(4, 5); }
                  else if (curChar == 36)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAdd(19); }
                  }
                  else if (curChar == 34)
                     { jjCheckNAddStates(6, 8); }
                  else if (curChar == 46)
                     { jjCheckNAdd(9); }
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 35)
                        kind = 35;
                     { jjCheckNAdd(4); }
                  }
                  else if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 1:
                  { jjAddStates(9, 10); }
                  break;
               case 3:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(4); }
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  { jjCheckNAdd(4); }
                  break;
               case 5:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if (curChar == 46)
                     { jjCheckNAdd(9); }
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAddTwoStates(9, 10); }
                  break;
               case 11:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(12); }
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAdd(12); }
                  break;
               case 13:
               case 16:
                  if (curChar == 34)
                     { jjCheckNAddStates(6, 8); }
                  break;
               case 14:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     { jjCheckNAddStates(6, 8); }
                  break;
               case 17:
                  if (curChar == 34 && kind > 40)
                     kind = 40;
                  break;
               case 18:
                  if (curChar != 36)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(19); }
                  break;
               case 19:
                  if ((0x3ff001000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(19); }
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(0, 3); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(21, 22); }
                  break;
               case 22:
                  if (curChar != 46)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 25:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(26); }
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAdd(26); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(27, 28); }
                  break;
               case 29:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(30); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  { jjCheckNAdd(30); }
                  break;
               case 31:
                  if (curChar == 47)
                     { jjAddStates(4, 5); }
                  break;
               case 32:
                  if (curChar == 47)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 33:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(11, 13); }
                  break;
               case 34:
                  if ((0x2400L & l) != 0L && kind > 32)
                     kind = 32;
                  break;
               case 35:
                  if (curChar == 10 && kind > 32)
                     kind = 32;
                  break;
               case 36:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 37:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(38, 39); }
                  break;
               case 38:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(38, 39); }
                  break;
               case 39:
                  if (curChar == 42)
                     { jjCheckNAddStates(14, 16); }
                  break;
               case 40:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(41, 39); }
                  break;
               case 41:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(41, 39); }
                  break;
               case 42:
                  if (curChar == 47 && kind > 33)
                     kind = 33;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAdd(19); }
                  }
                  else if (curChar == 123)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 1:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 125 && kind > 34)
                     kind = 34;
                  break;
               case 6:
                  if ((0x100000001000000L & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  { jjCheckNAdd(7); }
                  break;
               case 7:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 37)
                     kind = 37;
                  { jjCheckNAdd(7); }
                  break;
               case 10:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(17, 18); }
                  break;
               case 14:
                  if ((0xffffffffefffffffL & l) != 0L)
                     { jjCheckNAddStates(6, 8); }
                  break;
               case 15:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x14400010144000L & l) != 0L)
                     { jjCheckNAddStates(6, 8); }
                  break;
               case 18:
               case 19:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(19); }
                  break;
               case 24:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(19, 20); }
                  break;
               case 28:
                  if ((0x2000000020L & l) != 0L)
                     { jjAddStates(21, 22); }
                  break;
               case 33:
                  { jjAddStates(11, 13); }
                  break;
               case 38:
                  { jjCheckNAddTwoStates(38, 39); }
                  break;
               case 40:
               case 41:
                  { jjCheckNAddTwoStates(41, 39); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 19:
                  if (!jjCanMove_1(hiByte, i1, i2, l1, l2))
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAdd(19); }
                  break;
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(9, 10); }
                  break;
               case 14:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(6, 8); }
                  break;
               case 33:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjAddStates(11, 13); }
                  break;
               case 38:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(38, 39); }
                  break;
               case 40:
               case 41:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     { jjCheckNAddTwoStates(41, 39); }
                  break;
               default : if (i1 == 0 || l1 == 0 || i2 == 0 ||  l2 == 0) break; else break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 43 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   21, 22, 27, 28, 32, 37, 14, 15, 17, 1, 2, 33, 34, 36, 39, 40, 
   42, 11, 12, 25, 26, 29, 30, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}
private static final boolean jjCanMove_1(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec4[i2] & l2) != 0L);
      case 45:
         return ((jjbitVec5[i2] & l2) != 0L);
      case 48:
         return ((jjbitVec6[i2] & l2) != 0L);
      case 49:
         return ((jjbitVec7[i2] & l2) != 0L);
      case 51:
         return ((jjbitVec8[i2] & l2) != 0L);
      case 61:
         return ((jjbitVec9[i2] & l2) != 0L);
      default :
         if ((jjbitVec3[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, "\50", "\51", "\72", "\54", "\53", 
"\55", null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ParserTokenManager(CharStream stream){


    input_stream = stream;
  }

  /** Constructor. */
  public ParserTokenManager (CharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  public void ReInit(CharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 43; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(CharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x36807ffffffL, 
};
static final long[] jjtoSkip = {
   0x7f8000000L, 
};
static final long[] jjtoSpecial = {
   0x700000000L, 
};
    protected CharStream  input_stream;

    private final int[] jjrounds = new int[43];
    private final int[] jjstateSet = new int[2 * 43];

    
    protected char curChar;
}
