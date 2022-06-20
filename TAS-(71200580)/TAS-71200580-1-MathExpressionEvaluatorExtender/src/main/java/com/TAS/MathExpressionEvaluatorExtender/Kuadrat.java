package com.TAS.MathExpressionEvaluatorExtender;

public class Kuadrat extends UnaryOperator{

    public Kuadrat(Node dataNode) {
        super(dataNode);
    }

    @Override
    public double hitung() {
        return Math.pow(this.getDataNode().hitung(),2);
    }
}

