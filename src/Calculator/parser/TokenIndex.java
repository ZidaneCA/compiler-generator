/* This file was generated by SableCC (http://www.sablecc.org/). */

package Calculator.parser;

import Calculator.node.*;
import Calculator.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 0;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 1;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 2;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 3;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 4;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 5;
    }

    @Override
    public void caseTLPar(@SuppressWarnings("unused") TLPar node)
    {
        this.index = 6;
    }

    @Override
    public void caseTRPar(@SuppressWarnings("unused") TRPar node)
    {
        this.index = 7;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 8;
    }

    @Override
    public void caseTEqual(@SuppressWarnings("unused") TEqual node)
    {
        this.index = 9;
    }

    @Override
    public void caseTVar(@SuppressWarnings("unused") TVar node)
    {
        this.index = 10;
    }

    @Override
    public void caseTSqrt(@SuppressWarnings("unused") TSqrt node)
    {
        this.index = 11;
    }

    @Override
    public void caseTCos(@SuppressWarnings("unused") TCos node)
    {
        this.index = 12;
    }

    @Override
    public void caseTSin(@SuppressWarnings("unused") TSin node)
    {
        this.index = 13;
    }

    @Override
    public void caseTTan(@SuppressWarnings("unused") TTan node)
    {
        this.index = 14;
    }

    @Override
    public void caseTExp(@SuppressWarnings("unused") TExp node)
    {
        this.index = 15;
    }

    @Override
    public void caseTLog(@SuppressWarnings("unused") TLog node)
    {
        this.index = 16;
    }

    @Override
    public void caseTPower(@SuppressWarnings("unused") TPower node)
    {
        this.index = 17;
    }

    @Override
    public void caseTLn(@SuppressWarnings("unused") TLn node)
    {
        this.index = 18;
    }

    @Override
    public void caseTAcos(@SuppressWarnings("unused") TAcos node)
    {
        this.index = 19;
    }

    @Override
    public void caseTAsin(@SuppressWarnings("unused") TAsin node)
    {
        this.index = 20;
    }

    @Override
    public void caseTAtan(@SuppressWarnings("unused") TAtan node)
    {
        this.index = 21;
    }

    @Override
    public void caseTCosh(@SuppressWarnings("unused") TCosh node)
    {
        this.index = 22;
    }

    @Override
    public void caseTSinh(@SuppressWarnings("unused") TSinh node)
    {
        this.index = 23;
    }

    @Override
    public void caseTTanh(@SuppressWarnings("unused") TTanh node)
    {
        this.index = 24;
    }

    @Override
    public void caseTFact(@SuppressWarnings("unused") TFact node)
    {
        this.index = 25;
    }

    @Override
    public void caseTCbrt(@SuppressWarnings("unused") TCbrt node)
    {
        this.index = 26;
    }

    @Override
    public void caseTAffect(@SuppressWarnings("unused") TAffect node)
    {
        this.index = 27;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 28;
    }
}
