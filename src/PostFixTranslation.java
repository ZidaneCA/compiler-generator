import Calculator.analysis.DepthFirstAdapter;
import Calculator.node.*;

public class PostFixTranslation extends DepthFirstAdapter{

    /** Variables, numbers and basic add, mod, sub, mul and div operations */
    @Override
    public void caseTNumber(TNumber node) {
        System.out.print(node);
    }

    @Override
    public void outAPlusExpr(APlusExpr node) {
        System.out.print(node.getPlus());
    }

    @Override
    public void outAVarTerm(AVarTerm node) {
        System.out.print(node.getVar());
    }

    @Override
    public void outAMinusExpr(AMinusExpr node) {
        System.out.print(node.getMinus());
    }

    @Override
    public void outAMultFactor(AMultFactor node) {
        System.out.print(node.getMult());
    }

    @Override
    public void outADivFactor(ADivFactor node) {
        System.out.print(node.getDiv());
    }

    @Override
    public void outAModFactor(AModFactor node) {
        System.out.print(node.getMod());
    }

    /** Square roots and Cube roots */
    @Override
    public void outASqrtFunc(ASqrtFunc node) { System.out.print(node.getSqrt()+"("+node.getExpr()+") "); }

    @Override
    public void outACbrtFunc(ACbrtFunc node) { System.out.print(node.getCbrt()+"("+node.getExpr()+") "); }

    /** Logarithmic functions */
    @Override
    public void outALogFunc(ALogFunc node) { System.out.print(node.getLog()+"("+node.getExpr()+") "); }

    @Override
    public void outALnFunc(ALnFunc node) { System.out.println(node.getLn()+"("+node.getExpr()+") "); }

    /** Power and exponents */
    @Override
    public void outAPowerFunc(APowerFunc node) { System.out.print(node.getPower()+"("+node.getExpr()+","+node.getFactor()+") "); }

    @Override
    public void outAExpFunc(AExpFunc node) { System.out.print(node.getExp()+"("+node.getExpr()+") "); }

    @Override
    public void outAFactFunc(AFactFunc node) { System.out.print(node.getFact()+"("+node.getExpr()+") "); }

    /** Trigonometric functions */
    @Override
    public void outASinFunc(ASinFunc node) { System.out.print(node.getSin()+"("+node.getExpr()+") "); }

    @Override
    public void outACosFunc(ACosFunc node) { System.out.print(node.getCos()+"("+node.getExpr()+") "); }

    @Override
    public void outATanFunc(ATanFunc node) { System.out.print(node.getTan()+"("+node.getExpr()+") "); }

    @Override
    public void outACoshFunc(ACoshFunc node) { System.out.print(node.getCosh()+"("+node.getExpr()+") "); }

    @Override
    public void outAAcosFunc(AAcosFunc node) { System.out.print(node.getAcos()+"("+node.getExpr()+") "); }

    @Override
    public void outASinhFunc(ASinhFunc node) { System.out.print(node.getSinh()+"("+node.getExpr()+") "); }

    @Override
    public void outAAsinFunc(AAsinFunc node) { System.out.print(node.getAsin()+"("+node.getExpr()+") "); }

    @Override
    public void outATanhFunc(ATanhFunc node) { System.out.print(node.getTanh()+"("+node.getExpr()+") "); }

    @Override
    public void outAAtanFunc(AAtanFunc node) { System.out.print(node.getAtan()+"("+node.getExpr()+") "); }
}
