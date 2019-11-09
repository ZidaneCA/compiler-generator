import Calculator.analysis.DepthFirstAdapter;
import Calculator.node.*;

import java.util.Hashtable;
import java.util.Scanner;

public class Evaluation extends DepthFirstAdapter {
    private Hashtable<String,Double> tree = new Hashtable();
    private Scanner scan = new Scanner(System.in);


    /** VARIABLE READING */


    @Override
    public void caseTVar(TVar node) {
        if (!tree.containsKey(node.toString())) {
            System.out.println("\nEnter the value of "+node+": ");
            String stringVal = scan.nextLine();
            try {
                double val = Double.parseDouble(stringVal);
                tree.put(node.toString(),val);
            }catch (Exception e) {
                System.out.println("Invalid Number.");
                System.exit(1);
            }
        }
    }

    /** EVALUATION OF PRODUCTION RULES (TERM) LHS */
    @Override
    public void outAVarTerm(AVarTerm node) {
        double varVal = tree.get(node.getVar().toString());
        tree.put(node.toString(),varVal);
    }


    @Override
    public void outANumberTerm(ANumberTerm node) {
        double numberVal = Double.parseDouble(node.getNumber().getText() );
        tree.put(node.toString(),numberVal);
    }

    @Override
    public void outAExprTerm(AExprTerm node) {
        double termVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(),termVal);
    }

/** EVALUATION OF PRODUCTION RULES (FACTOR) LHS */
    @Override
    public void outATermFactor(ATermFactor node) {
        double termVal = tree.get(node.getTerm().toString());
        tree.put(node.toString(),termVal);
    }

    @Override
    public void outAMultFactor(AMultFactor node) {
        double factorVal = tree.get(node.getFactor().toString());
        double termVal = tree.get(node.getTerm().toString());
        tree.put(node.toString(),factorVal*termVal);
    }

    @Override
    public void outADivFactor(ADivFactor node) {
        double factorVal = tree.get(node.getFactor().toString());
        double termVal = tree.get(node.getTerm().toString());
        tree.put(node.toString(),factorVal/termVal);
    }

    @Override
    public void outAModFactor(AModFactor node) {
        double factorVal = tree.get(node.getFactor().toString());
        double termVal = tree.get(node.getTerm().toString());
        tree.put(node.toString(),factorVal%termVal);
    }



/** EVALUATION OF PRODUCTION RULES (FUNC) LHS */

    /* Square roots and Cube roots */
    @Override
    public void outASqrtFunc(ASqrtFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.sqrt(funcVal));
    }

    @Override
    public void outACbrtFunc(ACbrtFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.cbrt(funcVal));
    }

    /* Logarithmic functions */
    @Override
    public void outALogFunc(ALogFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.log10(funcVal));
    }

    @Override
    public void outALnFunc(ALnFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.log(funcVal));
    }

    /* Trigonometric functions */
    @Override
    public void outASinFunc(ASinFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.sin((funcVal * Math.PI)/180.0));
    }

    @Override
    public void outACosFunc(ACosFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        //tree.put(node.toString(), Math.cos(Math.toRadians(funcVal)));
        tree.put(node.toString(), Math.cos((funcVal * Math.PI)/180.0));
    }

    @Override
    public void outATanFunc(ATanFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.tan((funcVal * Math.PI)/180.0));
    }


    @Override
    public void outAAcosFunc(AAcosFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.toDegrees(Math.acos(funcVal)));
    }

    @Override
    public void outACoshFunc(ACoshFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.cosh(funcVal));
    }

    @Override
    public void outAAtanFunc(AAtanFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.toDegrees(Math.atan(funcVal)));
    }

    @Override
    public void outATanhFunc(ATanhFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.tanh(funcVal));
    }

    @Override
    public void outAAsinFunc(AAsinFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.toDegrees(Math.asin(funcVal)));
    }

    @Override
    public void outASinhFunc(ASinhFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.sinh(funcVal));
    }

    /* Power and exponents */
    @Override
    public void outAExpFunc(AExpFunc node) {
        double funcVal = tree.get(node.getExpr().toString());
        tree.put(node.toString(), Math.exp(funcVal));
    }

    @Override
    public void outAPowerFunc(APowerFunc node) {
        double term = tree.get(node.getExpr().toString());
        double power = tree.get(node.getFactor().toString());
        tree.put(node.toString(), Math.pow(term,power));
    }

    @Override
    public void outAFactFunc(AFactFunc node) {
        double n = tree.get(node.getExpr().toString());
        tree.put(node.toString(), fact((int) n));
    }

    /** EVALUATION OF PRODUCTION RULES (EXPR) LHS */
    @Override
    public void outAFactorExpr(AFactorExpr node) {
        double factorVal = tree.get(node.getFactor().toString());
        tree.put(node.toString(),factorVal);
    }

    @Override
    public void outAPlusExpr(APlusExpr node) {
        double exprVal=  tree.get(node.getExpr().toString());
        double factorVal = tree.get(node.getFactor().toString());
        tree.put(node.toString(),exprVal+factorVal);
    }

    @Override
    public void outAMinusExpr(AMinusExpr node) {
        double exprVal=  tree.get(node.getExpr().toString());
        double factorVal = tree.get(node.getFactor().toString());
        tree.put(node.toString(),exprVal-factorVal);
    }

    @Override
    public void outStart(Start node) {
        double val = tree.get(node.getPExpr().toString());
        System.out.print("\nExpression value: ");
        System.out.printf("\n %g \n", val);
        //System.out.println(val);
        //System.out.println(tree);
    }

    static double fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
