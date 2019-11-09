import Calculator.analysis.DepthFirstAdapter;
import Calculator.node.*;

public class PreFixTranslation extends DepthFirstAdapter {
    /** Variables, numbers and basic add, mod, sub, mul and div operations */
    @Override
    public void caseTNumber(TNumber node) {
        System.out.print(node);
    }

    @Override
    public void inAPlusExpr(APlusExpr node) {
        System.out.print(node.getPlus());
    }

    @Override
    public void inAMinusExpr(AMinusExpr node) {
        System.out.print(node.getMinus());
    }

    @Override
    public void inAVarTerm(AVarTerm node) {
        System.out.print(node.getVar());
    }

    @Override
    public void inAMultFactor(AMultFactor node) {
        System.out.print(node.getMult());
    }

    @Override
    public void inADivFactor(ADivFactor node) {
        System.out.print(node.getDiv());
    }

    @Override
    public void inAModFactor(AModFactor node) {
        System.out.print(node.getMod());
    }

    /** Functions */

    /** Square roots and Cube roots */
    @Override
    public void inASqrtFunc(ASqrtFunc node) { System.out.print(node.getSqrt()+"("+node.getExpr()+") "); }

    @Override
    public void inACbrtFunc(ACbrtFunc node) { System.out.print(node.getCbrt()+"("+node.getExpr()+") "); }

    /** Logarithmic functions */
    @Override
    public void inALogFunc(ALogFunc node) { System.out.print(node.getLog()+"("+node.getExpr()+") "); }

    @Override
    public void inALnFunc(ALnFunc node) { System.out.println(node.getLn()+"("+node.getExpr()+") "); }

    /** Power and exponents */
    @Override
    public void inAPowerFunc(APowerFunc node) { System.out.print(node.getPower()+"("+node.getExpr()+","+node.getFactor()+") "); }

    @Override
    public void inAExpFunc(AExpFunc node) { System.out.print(node.getExp()+"("+node.getExpr()+") "); }

    @Override
    public void inAFactFunc(AFactFunc node) { System.out.print(node.getFact()+"("+node.getExpr()+") "); }

    /** Trigonometric functions */

    @Override
    public void inACosFunc(ACosFunc node) { System.out.print(node.getCos()+"("+node.getExpr()+") "); }

    @Override
    public void inATanFunc(ATanFunc node) { System.out.print(node.getTan()+"("+node.getExpr()+") "); }

    @Override
    public void inASinFunc(ASinFunc node) { System.out.print(node.getSin()+"("+node.getExpr()+") "); }

    @Override
    public void inAAcosFunc(AAcosFunc node) { System.out.print(node.getAcos()+"("+node.getExpr()+") "); }

    @Override
    public void inAAsinFunc(AAsinFunc node) { System.out.print(node.getAsin()+"("+node.getExpr()+") "); }

    @Override
    public void inAAtanFunc(AAtanFunc node) { System.out.print(node.getAtan()+"("+node.getExpr()+") "); }

    @Override
    public void inACoshFunc(ACoshFunc node) { System.out.print(node.getCosh()+"("+node.getExpr()+") "); }

    @Override
    public void inASinhFunc(ASinhFunc node) { System.out.print(node.getSinh()+"("+node.getExpr()+") "); }

    @Override
    public void inATanhFunc(ATanhFunc node) { System.out.print(node.getTanh()+"("+node.getExpr()+") "); }
}
