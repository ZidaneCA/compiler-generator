/* This file was generated by SableCC (http://www.sablecc.org/). */

package Calculator.node;

import Calculator.analysis.*;

@SuppressWarnings("nls")
public final class TSinh extends Token
{
    public TSinh()
    {
        super.setText("\\sinh");
    }

    public TSinh(int line, int pos)
    {
        super.setText("\\sinh");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TSinh(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTSinh(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TSinh text.");
    }
}