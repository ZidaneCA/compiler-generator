/* This file was generated by SableCC (http://www.sablecc.org/). */

package Calculator.node;

import Calculator.analysis.*;

@SuppressWarnings("nls")
public final class TLn extends Token
{
    public TLn()
    {
        super.setText("\\ln");
    }

    public TLn(int line, int pos)
    {
        super.setText("\\ln");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLn(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLn(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLn text.");
    }
}
