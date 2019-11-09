/* This file was generated by SableCC (http://www.sablecc.org/). */

package Calculator.analysis;

import java.util.*;
import Calculator.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPExpr().apply(this);
        outStart(node);
    }

    public void inAFactorExpr(AFactorExpr node)
    {
        defaultIn(node);
    }

    public void outAFactorExpr(AFactorExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorExpr(AFactorExpr node)
    {
        inAFactorExpr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAFactorExpr(node);
    }

    public void inAPlusExpr(APlusExpr node)
    {
        defaultIn(node);
    }

    public void outAPlusExpr(APlusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExpr(APlusExpr node)
    {
        inAPlusExpr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getPlus() != null)
        {
            node.getPlus().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAPlusExpr(node);
    }

    public void inAMinusExpr(AMinusExpr node)
    {
        defaultIn(node);
    }

    public void outAMinusExpr(AMinusExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExpr(AMinusExpr node)
    {
        inAMinusExpr(node);
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getMinus() != null)
        {
            node.getMinus().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAMinusExpr(node);
    }

    public void inATermFactor(ATermFactor node)
    {
        defaultIn(node);
    }

    public void outATermFactor(ATermFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermFactor(ATermFactor node)
    {
        inATermFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermFactor(node);
    }

    public void inAMultFactor(AMultFactor node)
    {
        defaultIn(node);
    }

    public void outAMultFactor(AMultFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultFactor(AMultFactor node)
    {
        inAMultFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getMult() != null)
        {
            node.getMult().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAMultFactor(node);
    }

    public void inADivFactor(ADivFactor node)
    {
        defaultIn(node);
    }

    public void outADivFactor(ADivFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivFactor(ADivFactor node)
    {
        inADivFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getDiv() != null)
        {
            node.getDiv().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outADivFactor(node);
    }

    public void inAModFactor(AModFactor node)
    {
        defaultIn(node);
    }

    public void outAModFactor(AModFactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAModFactor(AModFactor node)
    {
        inAModFactor(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getMod() != null)
        {
            node.getMod().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        outAModFactor(node);
    }

    public void inANumberTerm(ANumberTerm node)
    {
        defaultIn(node);
    }

    public void outANumberTerm(ANumberTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumberTerm(ANumberTerm node)
    {
        inANumberTerm(node);
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        outANumberTerm(node);
    }

    public void inAVarTerm(AVarTerm node)
    {
        defaultIn(node);
    }

    public void outAVarTerm(AVarTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarTerm(AVarTerm node)
    {
        inAVarTerm(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarTerm(node);
    }

    public void inAFuncTerm(AFuncTerm node)
    {
        defaultIn(node);
    }

    public void outAFuncTerm(AFuncTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFuncTerm(AFuncTerm node)
    {
        inAFuncTerm(node);
        if(node.getFunc() != null)
        {
            node.getFunc().apply(this);
        }
        outAFuncTerm(node);
    }

    public void inAExprTerm(AExprTerm node)
    {
        defaultIn(node);
    }

    public void outAExprTerm(AExprTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprTerm(AExprTerm node)
    {
        inAExprTerm(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        outAExprTerm(node);
    }

    public void inASqrtFunc(ASqrtFunc node)
    {
        defaultIn(node);
    }

    public void outASqrtFunc(ASqrtFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASqrtFunc(ASqrtFunc node)
    {
        inASqrtFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getSqrt() != null)
        {
            node.getSqrt().apply(this);
        }
        outASqrtFunc(node);
    }

    public void inACbrtFunc(ACbrtFunc node)
    {
        defaultIn(node);
    }

    public void outACbrtFunc(ACbrtFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACbrtFunc(ACbrtFunc node)
    {
        inACbrtFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getCbrt() != null)
        {
            node.getCbrt().apply(this);
        }
        outACbrtFunc(node);
    }

    public void inASinFunc(ASinFunc node)
    {
        defaultIn(node);
    }

    public void outASinFunc(ASinFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASinFunc(ASinFunc node)
    {
        inASinFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getSin() != null)
        {
            node.getSin().apply(this);
        }
        outASinFunc(node);
    }

    public void inATanFunc(ATanFunc node)
    {
        defaultIn(node);
    }

    public void outATanFunc(ATanFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATanFunc(ATanFunc node)
    {
        inATanFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getTan() != null)
        {
            node.getTan().apply(this);
        }
        outATanFunc(node);
    }

    public void inASinhFunc(ASinhFunc node)
    {
        defaultIn(node);
    }

    public void outASinhFunc(ASinhFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASinhFunc(ASinhFunc node)
    {
        inASinhFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getSinh() != null)
        {
            node.getSinh().apply(this);
        }
        outASinhFunc(node);
    }

    public void inATanhFunc(ATanhFunc node)
    {
        defaultIn(node);
    }

    public void outATanhFunc(ATanhFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATanhFunc(ATanhFunc node)
    {
        inATanhFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getTanh() != null)
        {
            node.getTanh().apply(this);
        }
        outATanhFunc(node);
    }

    public void inAAsinFunc(AAsinFunc node)
    {
        defaultIn(node);
    }

    public void outAAsinFunc(AAsinFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAsinFunc(AAsinFunc node)
    {
        inAAsinFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getAsin() != null)
        {
            node.getAsin().apply(this);
        }
        outAAsinFunc(node);
    }

    public void inAAtanFunc(AAtanFunc node)
    {
        defaultIn(node);
    }

    public void outAAtanFunc(AAtanFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAtanFunc(AAtanFunc node)
    {
        inAAtanFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getAtan() != null)
        {
            node.getAtan().apply(this);
        }
        outAAtanFunc(node);
    }

    public void inALogFunc(ALogFunc node)
    {
        defaultIn(node);
    }

    public void outALogFunc(ALogFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALogFunc(ALogFunc node)
    {
        inALogFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getLog() != null)
        {
            node.getLog().apply(this);
        }
        outALogFunc(node);
    }

    public void inALnFunc(ALnFunc node)
    {
        defaultIn(node);
    }

    public void outALnFunc(ALnFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALnFunc(ALnFunc node)
    {
        inALnFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getLn() != null)
        {
            node.getLn().apply(this);
        }
        outALnFunc(node);
    }

    public void inAExpFunc(AExpFunc node)
    {
        defaultIn(node);
    }

    public void outAExpFunc(AExpFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpFunc(AExpFunc node)
    {
        inAExpFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpFunc(node);
    }

    public void inACosFunc(ACosFunc node)
    {
        defaultIn(node);
    }

    public void outACosFunc(ACosFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACosFunc(ACosFunc node)
    {
        inACosFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getCos() != null)
        {
            node.getCos().apply(this);
        }
        outACosFunc(node);
    }

    public void inAAcosFunc(AAcosFunc node)
    {
        defaultIn(node);
    }

    public void outAAcosFunc(AAcosFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAcosFunc(AAcosFunc node)
    {
        inAAcosFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getAcos() != null)
        {
            node.getAcos().apply(this);
        }
        outAAcosFunc(node);
    }

    public void inACoshFunc(ACoshFunc node)
    {
        defaultIn(node);
    }

    public void outACoshFunc(ACoshFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACoshFunc(ACoshFunc node)
    {
        inACoshFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getCosh() != null)
        {
            node.getCosh().apply(this);
        }
        outACoshFunc(node);
    }

    public void inAPowerFunc(APowerFunc node)
    {
        defaultIn(node);
    }

    public void outAPowerFunc(APowerFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPowerFunc(APowerFunc node)
    {
        inAPowerFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getFactor() != null)
        {
            node.getFactor().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getPower() != null)
        {
            node.getPower().apply(this);
        }
        outAPowerFunc(node);
    }

    public void inAAffectFunc(AAffectFunc node)
    {
        defaultIn(node);
    }

    public void outAAffectFunc(AAffectFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAffectFunc(AAffectFunc node)
    {
        inAAffectFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getNumber() != null)
        {
            node.getNumber().apply(this);
        }
        if(node.getEqual() != null)
        {
            node.getEqual().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getAffect() != null)
        {
            node.getAffect().apply(this);
        }
        outAAffectFunc(node);
    }

    public void inAFactFunc(AFactFunc node)
    {
        defaultIn(node);
    }

    public void outAFactFunc(AFactFunc node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactFunc(AFactFunc node)
    {
        inAFactFunc(node);
        if(node.getRPar() != null)
        {
            node.getRPar().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getLPar() != null)
        {
            node.getLPar().apply(this);
        }
        if(node.getFact() != null)
        {
            node.getFact().apply(this);
        }
        outAFactFunc(node);
    }
}
