/* This file was generated by SableCC (http://www.sablecc.org/). */

package Calculator.analysis;

import Calculator.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAFactorExpr(AFactorExpr node);
    void caseAPlusExpr(APlusExpr node);
    void caseAMinusExpr(AMinusExpr node);
    void caseATermFactor(ATermFactor node);
    void caseAMultFactor(AMultFactor node);
    void caseADivFactor(ADivFactor node);
    void caseAModFactor(AModFactor node);
    void caseANumberTerm(ANumberTerm node);
    void caseAVarTerm(AVarTerm node);
    void caseAFuncTerm(AFuncTerm node);
    void caseAExprTerm(AExprTerm node);
    void caseASqrtFunc(ASqrtFunc node);
    void caseACbrtFunc(ACbrtFunc node);
    void caseASinFunc(ASinFunc node);
    void caseATanFunc(ATanFunc node);
    void caseASinhFunc(ASinhFunc node);
    void caseATanhFunc(ATanhFunc node);
    void caseAAsinFunc(AAsinFunc node);
    void caseAAtanFunc(AAtanFunc node);
    void caseALogFunc(ALogFunc node);
    void caseALnFunc(ALnFunc node);
    void caseAExpFunc(AExpFunc node);
    void caseACosFunc(ACosFunc node);
    void caseAAcosFunc(AAcosFunc node);
    void caseACoshFunc(ACoshFunc node);
    void caseAPowerFunc(APowerFunc node);
    void caseAAffectFunc(AAffectFunc node);
    void caseAFactFunc(AFactFunc node);

    void caseTNumber(TNumber node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTMod(TMod node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTComma(TComma node);
    void caseTEqual(TEqual node);
    void caseTBlank(TBlank node);
    void caseTVar(TVar node);
    void caseTSqrt(TSqrt node);
    void caseTCos(TCos node);
    void caseTSin(TSin node);
    void caseTTan(TTan node);
    void caseTExp(TExp node);
    void caseTLog(TLog node);
    void caseTPower(TPower node);
    void caseTLn(TLn node);
    void caseTAcos(TAcos node);
    void caseTAsin(TAsin node);
    void caseTAtan(TAtan node);
    void caseTCosh(TCosh node);
    void caseTSinh(TSinh node);
    void caseTTanh(TTanh node);
    void caseTFact(TFact node);
    void caseTCbrt(TCbrt node);
    void caseTAffect(TAffect node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
